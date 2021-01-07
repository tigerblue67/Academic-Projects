close all
clear all

%adding paths to provided resources, function and variable storage
addpath('./Resources/Provided/');
addpath('./Resources/Provided/SVM-KM');
addpath('./Functions/');
addpath('./Variables/');

%% Training Section

fudgeFactor = 0.5;
% Load Training Images
[Training_Images, Training_Labels] = loadFaceImages('./Resources/Provided/face_train.cdataset');
for i=1:size(Training_Images, 1)
   [~,threshold] = edge(Training_Images(i,:),'sobel');
   BinaryGradientMask = edge(Training_Images(i,:),'sobel',threshold * fudgeFactor);
   Train_Edge_Images(i, :) = double(BinaryGradientMask);
end
Training_Images = Train_Edge_Images;

% Load Testing Images
[Testing_Images, Testing_Labels] = loadFaceImages('./Resources/Provided/face_test.cdataset');
for i=1:size(Testing_Images, 1)
    [~,threshold] = edge(Testing_Images(i,:),'sobel');
    BinaryGradientMask = edge(Testing_Images(i,:),'sobel',threshold * fudgeFactor);
    Test_Edge_Images(i, :) = double(BinaryGradientMask);
end
Testing_Images = Test_Edge_Images;

modelSVM = SVMtraining(Training_Images, Training_Labels);


%% Basic Testing With Dataset

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
