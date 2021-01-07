close all
clear all

%adding paths to provided resources, function and variable storage
addpath('../Resources/Provided/');
addpath('../Functions/');
addpath('../Variables/');

% Load Training Images
[Training_Images, Training_Labels] = loadFaceImages('./Resources/Provided/face_train.cdataset');
[eigenVectors, eigenvalues, meanX, Xlda] = LDA(Training_Labels,[],Training_Images); 
Training_Images = Xlda;

% Load Testing Images
[Testing_Images, Testing_Labels] = loadFaceImages('./Resources/Provided/face_test.cdataset');
for i=1:size(Testing_Images, 1)
    LDA_Images(i, :) = (Testing_Images(i, :) - meanX) * eigenVectors;
end
Testing_Images = LDA_Images;

nTrees=500;
modelRF = TreeBagger(nTrees,Training_Images,Training_Labels, 'Method', 'classification'); 
% Our predictions for the training dataset, this is returned as a char for
% some reason so we need to convert it
[predictions, scores] = modelRF.predict(Testing_Images);
predictions = str2double(predictions);

% Display type I and II errors
[TP, FP, TN, FN] = displayTypeErrors(predictions, Testing_Labels);
% Display evaluation metrics
[Recall, Precision, Specificity, F_Measure, FalseAlarmRate] = displayEvaluationMetrics(TP, FP, TN, FN);
% ROC curve
areaUnderCurve = displayROCCurve(Testing_Labels, scores(:, 2), 1, 'ROC for Classification by Random Forrest')
% Log loss
logLoss = crossentropy(predictions, Testing_Labels)

% How many we got right
comparison = predictions==Testing_Labels;
Accuracy=sum(comparison)/length(Testing_Labels)

%% Testing with supplied images

%Load image
testIm = imread('./Resources/Provided/im1.jpg');
% imshow(testIm);

%Extract Faces(Manually)
pplPos = [[21,9];[13,25];[27,46];[12,64];[23,82];[9,98];[23,119]];
faceSize=[27, 18];
faces = zeros(7, 1);
for i = 1:7
   for y = 1:faceSize(1)
       for x = 1:faceSize(2)
           tmpIm(y,x) = testIm(pplPos(i,1)+y,pplPos(i,2)+x);
       end
   end
   % figure
   % imshow(tmpIm);
   tmpIm = double(Im2Vector_JC(tmpIm));
   tmpIm = (tmpIm - meanX) * eigenVectors;
   faces(i,:) = tmpIm;
   tmpIm=[];
end

predictedRow=[];
for i=1:7
    testFace= faces(i,:);
    
    prediction = modelRF.predict(testFace);
    predictedRow=[predictedRow prediction];
end

predictedRow = str2double(predictedRow);
solution = [1,1,1,1,1,1,1];
comparison = predictedRow==solution;
Accuracy = sum(sum(comparison)/size(comparison,2))
[TP,FP,TN,FN] = displayTypeErrors(predictedRow, solution);
displayEvaluationMetrics(TP,FP,TN,FN);

