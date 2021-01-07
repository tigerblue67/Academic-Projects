close all;
clear all;

addpath .\Prac5\SVM-KM

% This function gives us a 1D array of pixelVals for each image
[imageVectors, labels] = loadPedestrianDatabase('pedestrian_train.cdataset', 50);


%% Start of step 3
firstImageVector = imageVectors(1,:);
% % We need to reshape the image back to it's original size as the
% loadPedestrianDatabase function converted it to a vector
firstImage = uint8(reshape(firstImageVector, 160, 96));
imageSize = [160, 96];
% 
% hogFeature = hog_feature_vector(firstImage);
% 
% subplot(1,2,1);
% imshow(firstImage), title('Original');
% 
% subplot(1,2,2);
% showHog(hogFeature, imageSize), title('The whole hog');
% End of step 3

%% Step 4-6 (Training)
% Get the original images cause our load function gives us vectors
trainImages = reshape(imageVectors, [size(imageVectors, 1), 160, 96]);
for i=1:size(trainImages, 1)
    hogs(i,:) = hog_feature_vector(squeeze(trainImages(i,:,:)));
end

%Perform training
modelSVM = SVMtraining(hogs, labels);

% This is the weighted average of the support vectors:
% This will only look like Jesus's if our sampling value is 1 at the top
numOfSupVectors = size(modelSVM.xsup, 1);
numOfFeatures = size(modelSVM.xsup, 2);
for j=1:numOfFeatures
    total = 0;
    for i=1:numOfSupVectors
        weight = modelSVM.w(i);
        total = total + (modelSVM.xsup(i, j) * weight);
    end
    weightedAverages(j) = total / numOfSupVectors;
end

%% Step 7-9 (Testing)
[testImageVectors, testLabels] = loadPedestrianDatabase('pedestrian_test.cdataset', 50);
testImages = reshape(testImageVectors, [size(testImageVectors, 1), 160, 96]);
for i=1:size(testImages, 1)
    testHogs(i,:) = hog_feature_vector(squeeze(testImages(i,:,:)));
end

for i=1:size(testHogs,1)
    
    testHog=testHogs(i,:);
    
    classificationResult(i,1) = SVMTesting(testHog,modelSVM);
end

% Finally we compared the predicted classification from our mahcine
% learning algorithm against the real labelling of the esting image
comparison = (testLabels==classificationResult);

%Accuracy is the most common metric. It is defiend as the numebr of
%correctly classified samples/ the total number of tested samples
Accuracy = sum(comparison)/length(comparison)

[TP, FP, TN, FN] = displayTypeErrors(testLabels,classificationResult);
Recall = TP / (TP+FN)
Precision = TP / (TP+FP)
Specificty = TN / (TN+FP)
F_measure = 2*(Precision*Recall) / (Precision + Recall)
FalseAlarmRate = FP/(FP+TN)


