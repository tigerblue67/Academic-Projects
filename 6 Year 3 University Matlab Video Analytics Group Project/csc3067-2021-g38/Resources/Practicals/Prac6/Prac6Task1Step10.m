close all;
clear all;

addpath .\Prac5\SVM-KM

% This function gives us a 1D array of pixelVals for each image
[imageVectors, labels] = loadPedestrianDatabase('pedestrian_train.cdataset', 50);
%Perform training
modelSVM = SVMtraining(imageVectors, labels);

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
weightsImageDouble = reshape(weightedAverages, 160, 96);
% This is a way I found to scale the uint8 image properly from 0-255
% Again sampling will need to be 1 above to get the visual solution
weightsImage = uint8(255 * mat2gray(weightsImageDouble));
figure, imshow(weightsImage), title('Support vectors');

[testImageVectors, testLabels] = loadPedestrianDatabase('pedestrian_test.cdataset', 1);
for i=1:size(testImageVectors,1)
    testImage=testImageVectors(i,:);
    classificationResult(i,1) = SVMTesting(testImage,modelSVM);
end

% Finally we compared the predicted classification from our mahcine
% learning algorithm against the real labelling of the esting image
comparison = (testLabels==classificationResult);

%Accuracy is the most common metric. It is defiend as the numebr of
%correctly classified samples/ the total number of tested samples
Accuracy = sum(comparison)/length(comparison)


