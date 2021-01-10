close all
clear all

%adding paths to provided resources, function and variable storage
addpath('./Resources/Provided/');
addpath('./Functions/');
addpath('./Functions/PreProcessing');
addpath('./Variables/');

% Load Training Images
[Training_Images, Training_Labels] = loadFaceImages_PRE('./Resources/Provided/face_train.cdataset');
Temp_Images = [];
for i=1:size(Training_Images, 3)
    Training_Images(:, :, i) = enhanceContrastHE(Training_Images(:, :, i));
    Temp_Images = [Temp_Images; double(Im2Vector_JC(Training_Images(:, :, i)))];
end
Training_Images = Temp_Images;
% Load Testing Images
[Testing_Images, Testing_Labels] = loadFaceImages_PRE('./Resources/Provided/face_test.cdataset');
Temp_Images = [];
for i=1:size(Testing_Images, 3)
    Testing_Images(:, :, i) = enhanceContrastHE(Testing_Images(:, :, i));
    Temp_Images = [Temp_Images; double(Im2Vector_JC(Testing_Images(:, :, i)))];
end
Testing_Images = Temp_Images;

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
faces = zeros(7, 486);
for i = 1:7
   for y = 1:faceSize(1)
       for x = 1:faceSize(2)
           tmpIm(y,x) = testIm(pplPos(i,1)+y,pplPos(i,2)+x);
       end
   end
   % figure
   % imshow(tmpIm);
   tmpIm = enhanceContrastHE(tmpIm);
   faces(i,:) = Im2Vector_JC(tmpIm);
end

predictedRow=[];
for i=1:7
    testnumber= faces(i,:);
    
    prediction = modelRF.predict(testnumber);
    predictedRow=[predictedRow prediction];
end

predictedRow = str2double(predictedRow);
solution = [1,1,1,1,1,1,1];
comparison = predictedRow==solution;
Accuracy = sum(sum(comparison)/size(comparison,2))


