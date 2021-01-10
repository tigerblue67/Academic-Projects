close all
clear all

%adding paths to provided resources, function and variable storage
addpath('./Resources/Provided/');
addpath('./Resources/Provided/SVM-KM');
addpath('./Functions/');
addpath('./Variables/');




%% Training Section

%saveToText(" ", " ", " ", " ", " ", " ", " ", " "); %initalise the saving file with variables titles 
%tic

% Load Training Images
[Training_Images, Training_Labels] = loadFaceImages('./Resources/Provided/face_train.cdataset');
[eigenVectors, eigenvalues, meanX, Xpca] = PrincipalComponentAnalysis(Training_Images);
Training_Images = Xpca;

% Load Testing Images
[Testing_Images, Testing_Labels] = loadFaceImages('./Resources/Provided/face_test.cdataset');
for i=1:size(Testing_Images, 1)
    PCA_Images(i, :) = (Testing_Images(i, :) - meanX) * eigenVectors;
end
Testing_Images = PCA_Images;

modelSVM = SVMtraining(Training_Images, Training_Labels);

%Timing=toc
%saveToText("SVM PCA training ", Timing);

%save('./Variables/modelSVMPCA.mat', 'modelSVM');


%% Basic Testing With Dataset

%tic

%For each testing image, we obtain a prediction based on our trained model
for i=1:size(Testing_Images,1)
    
    testnumber= Testing_Images(i,:);
    
    [prediction, score] = SVMTesting(testnumber, modelSVM);
    classificationResult(i,1) = prediction;
    scores(i) = score;
    
end

% Finally we compared the predicted classification from our mahcine
% learning algorithm against the real labelling of the esting image
comparison = (Testing_Labels==classificationResult);

%Accuracy is the most common metric. It is defiend as the numebr of
%correctly classified samples/ the total number of tested samples
Accuracy = sum(comparison)/length(comparison)
% Display type I and II errors
[TP, FP, TN, FN] = displayTypeErrors(classificationResult, Testing_Labels);
% Display evaluation metrics
[Recall, Precision, Specificity, F_Measure, FalseAlarmRate] = displayEvaluationMetrics(TP, FP, TN, FN);
% ROC curve
areaUnderCurve = displayROCCurve(Testing_Labels, scores, 1, 'ROC for Classification by SVM')

%Timing=toc
%saveToText("SVM PCA test dataset ", Timing, Accuracy, TP, FP, TN, FN, areaUnderCurve);

%% Testing with supplied images
%Below will be code to test this using the images provided outside the inital dataset (imX.jpg)
%Load image
testIm = imread('./Resources/Provided/im1.jpg');

%tic

%Extract Faces(Manually)
pplPos = [[21,9];[13,25];[27,46];[12,64];[23,82];[9,98];[23,119]];
faceSize=[27, 18];
faces = zeros(7, 69);
for i = 1:7
   for y = 1:faceSize(1)
       for x = 1:faceSize(2)
           tmpIm(y,x) = testIm(pplPos(i,1)+y,pplPos(i,2)+x);
           
       end
   end
   
   tmpIm = double(Im2Vector_JC(tmpIm));
   tmpIm = (tmpIm - meanX) * eigenVectors;
   faces(i,:) = Im2Vector_JC(tmpIm);
   tmpIm = [];
end


predictedRow=[];
for i=1:7
    
    testnumber= faces(i,:);
    
    prediction = SVMTesting(testnumber, modelSVM);
    predictedRow=[predictedRow prediction];

end
solution = [1,1,1,1,1,1,1];
comparison = predictedRow==solution;
Accuracy = sum(sum(comparison)/size(comparison,2))
[TP,FP,TN,FN] = displayTypeErrors(predictedRow, solution);
displayEvaluationMetrics(TP,FP,TN,FN);


%Timing=toc;
%saveToText("SVM PCA supplied images ", Timing, Accuracy, TP, FP, TN, FN);
