close all
clear all
addpath .\SVM-KM\


[images,labels] = loadPedestrianDatabase("pedestrian_train.cdataset", 10);
imSize = size(images);
size = [96 160];
[imTest,laTest] = loadPedestrianDatabase("pedestrian_test.cdataset", 10);
for i=1:imSize(1)
    vector1 = images(i, :);
    image = reshape(vector1,size);
    vector2 = imTest(i, :);
    testImage = reshape(vector2,size);
    HOG_Vector(i,:) = hog_feature_vector(image);
    test_HOG(i,:) = hog_feature_vector(testImage);
end
SVMmodel = SVMtraining(HOG_Vector,labels);
for i=1:imSize(1)
    
    testnumber= test_HOG(i,:);
    
    classificationResult(i,1) = SVMTesting(testnumber,SVMmodel);

end

% Finally we compared the predicted classification from our mahcine
% learning algorithm against the real labelling of the esting image
comparison = (laTest==classificationResult);

%Accuracy is the most common metric. It is defiend as the numebr of
%correctly classified samples/ the total number of tested samples
Accuracy = sum(comparison)/length(comparison)



