function [trainIm,trainLab, testIm, testLab] = DataSetCrossValidation(split, numSplit)
%DATASETCROSSVALIDATION Summary of this function goes here
%   Detailed explanation goes here
%Split defines what section of the code we want to belong to the test
%dataset and numSplit is the fraction of code belongs to test for example a
%split of 2 and numsplit of 4 then we will take from 25% to 50% through the
%whole dataset
addpath('./Resources/Provided/');
addpath('./Functions/');
addpath('./Variables/');

[Training_Images, Training_Labels] = loadFaceImages('./Resources/Provided/face_train.cdataset');
[Testing_Images, Testing_Labels] = loadFaceImages('./Resources/Provided/face_test.cdataset');

Images = [Testing_Images; Training_Images];
Labels = [Testing_Labels; Training_Labels];
p = randperm(size(Images, 1));
Images = Images(p, :);
Labels = Labels(p, :);
testLen = uint64(size(Images, 1)/numSplit);
currentpos = 1 + ((split-1)*testLen);
endpos = (testLen+currentpos-1);
testIm = Images(currentpos:endpos, :);  
testLab = Labels(currentpos:endpos, :);
Images(currentpos:endpos, :) = [];
Labels(currentpos:endpos, :) = [];

trainIm = Images;
trainLab = Labels;

end

