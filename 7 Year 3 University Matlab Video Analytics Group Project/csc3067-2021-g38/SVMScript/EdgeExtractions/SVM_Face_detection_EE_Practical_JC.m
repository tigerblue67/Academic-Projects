close all
clear all

%adding paths to provided resources, function and variable storage
addpath('./Resources/Provided/');
addpath('./Resources/Provided/SVM-KM');
addpath('./Functions/');
addpath('./Variables/');

%% Training Section

% Masks for neighbourhood edge extraction
B1 = ones(3);
B1(:, 1) = -1;
B1(:, 2) = 0;

B2 = ones(3);
B2(1, :) = -1;
B2(2, :) = 0;

% Load Training Images
[Training_Images, Training_Labels] = loadFaceImages('./Resources/Provided/face_train.cdataset');
for i=1:size(Training_Images, 1)
    [Edges, Ihor, Iver] = edgeExtraction(Training_Images(i, :), B1, B2);
    Train_Edge_Images(i, :) = Edges;
end
Training_Images = Train_Edge_Images;

% Load Testing Images
[Testing_Images, Testing_Labels] = loadFaceImages('./Resources/Provided/face_test.cdataset');
for i=1:size(Testing_Images, 1)
    [Edges, Ihor, Iver] = edgeExtraction(Testing_Images(i, :), B1, B2);
    Test_Edge_Images(i, :) = Edges;
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
