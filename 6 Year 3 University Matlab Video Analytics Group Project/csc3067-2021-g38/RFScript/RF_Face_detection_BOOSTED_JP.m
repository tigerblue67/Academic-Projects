close all
clear all

%adding paths to provided resources, function and variable storage
addpath('../Resources/Provided/');
addpath('../Functions/');
addpath('../Variables/');

% Load Training Images
[Training_Images, Training_Labels] = loadFaceImages('./Resources/Provided/face_train.cdataset');
% Load Testing Images
[Testing_Images, Testing_Labels] = loadFaceImages('./Resources/Provided/face_test.cdataset');

%saveToText(" ", " ", " ", " ", " ", " ", " ", " "); %initalise the saving file with variables titles 
%tic

% Fit an ensemble of 500 week decision tree classifers using AdaBoost M1
modelRF = fitensemble(Training_Images,Training_Labels,'AdaBoostM1',500,'tree');
%Timing=toc
%saveToText("RF Boosted training", Timing);

%tic
% Our predictions for the training dataset
[predictions, scores] = predict(modelRF, Testing_Images);

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

%Timing=toc
%saveToText("RF Boosted test dataset", Timing, Accuracy, TP, FP, TN, FN, areaUnderCurve);

%% Testing with supplied images

%tic

%Load image
testIm = imread('./Resources/Provided/im1.jpg');
% imshow(testIm);

%Extract Faces(Manually)
pplPos = [[21,9];[13,25];[27,46];[12,64];[23,82];[9,98];[23,119]];
faceSize=[27, 18];
faces = zeros(7, 486);
for i = 1:7
   for y = 1:faceSize(1)
       for x = 1:faceSize(2)
           tmpIm(y,x) = testIm(pplPos(i,1)+y,pplPos(i,2)+x);
       end
   end
   % figure
   % imshow(tmpIm);
   faces(i,:) = Im2Vector_JC(tmpIm);
end

predictedRow=[];
for i=1:7
    testface= faces(i,:);
    prediction = predict(modelRF, testface);
    predictedRow=[predictedRow prediction];
end

solution = [1,1,1,1,1,1,1];
comparison = predictedRow==solution;
Accuracy = sum(sum(comparison)/size(comparison,2))
[TP,FP,TN,FN] = displayTypeErrors(predictedRow, solution);
displayEvaluationMetrics(TP,FP,TN,FN);

%Timing=toc;
%saveToText("RF Boosted supplied images ", Timing, Accuracy, TP, FP, TN, FN);