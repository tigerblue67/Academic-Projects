close all
clear all

%adding paths to provided resources, function and variable storage
addpath('./Resources/Provided/');
addpath('./Functions/');
addpath('./Variables/');





%% Training Section
%saveToText(" ", " ", " ", " ", " ", " ", " ", " "); %initalise the saving file with variables titles 
%tic

%Load Training Images
[Training_Images, Training_Labels] = DCTLoadFaceImages('./Resources/Provided/face_train.cdataset');
% For visualization purposes, we display the first 100 images
%figure
% for i=1:100
% 
%     % As you can notice by the size of the matrix image, each digit image
%     % has been transform into a long feature vector to be fed in a machine
%     % learning algorithm.
%     
%     %To visualise or recompose the image again, we need to revert that
%     %process in its 27x18 image format
%     Im = reshape(Training_Images(i,:),27,18);
%     subplot(10,10,i), image(Im), colormap(gray(256)), title(['label: ',num2str(Training_Labels(i))])
%     
% end

modelKNNDCT = NNtraining_JC(Training_Images, Training_Labels);

save('./Variables/modelKNNDCT.mat', 'modelKNNDCT');

%Timing=toc
%saveToText("DCT KNN training", Timing);

%% Basic Testing With Dataset
%Load testing Images
[Testing_Images, Testing_Labels] = DCTLoadFaceImages('./Resources/Provided/face_test.cdataset');

%tic

%For each testing image, we obtain a prediction based on our trained model
for i=1:size(Testing_Images,1)
    
    testnumber= Testing_Images(i,:);
    
    classificationResult(i,1) = KNNTesting_JC(testnumber, modelKNNDCT, 5);
    
end

% Finally we compared the predicted classification from our mahcine
% learning algorithm against the real labelling of the esting image
comparison = (Testing_Labels==classificationResult);

%Accuracy is the most common metric. It is defiend as the numebr of
%correctly classified samples/ the total number of tested samples
Accuracy = sum(comparison)/length(comparison)

[TP,FP,TN,FN] = displayTypeErrors(classificationResult,Testing_Labels);
displayEvaluationMetrics(TP,FP,TN,FN);

%Timing=toc
%saveToText("DCT KNN test dataset", Timing, Accuracy, TP, FP, TN, FN);

%% Testing with supplied images
%Below will be code to test this using the images provided outside the inital dataset (imX.jpg)

%Load image
testIm = imread('./Resources/Provided/im1.jpg');

%tic

%Extract Faces(Manually)
pplPos = [[21,9];[13,25];[27,46];[12,64];[23,82];[9,98];[23,119]];
faceSize=[27, 18];
faces = [];
for i = 1:7
   for y = 1:faceSize(1)
       for x = 1:faceSize(2)
           tmpIm(y,x) = testIm(pplPos(i,1)+y,pplPos(i,2)+x);
           
       end
   end

   faces(i,:) = DCT_Feature_Vector(tmpIm);
end


predictedRow=[];
for i=1:7
    
    testnumber= faces(i,:);
    
    prediction = KNNTesting_JC(testnumber, modelKNNDCT, 5);
    predictedRow=[predictedRow prediction];

end
solution = [1,1,1,1,1,1,1];
comparison = predictedRow==solution;
Accuracy = sum(sum(comparison)/size(comparison,2))
[TP,FP,TN,FN] = displayTypeErrors(predictedRow, solution);
displayEvaluationMetrics(TP,FP,TN,FN);

%Timing=toc;
%saveToText("DCT KNN supplied images ", Timing, Accuracy, TP, FP, TN, FN);
