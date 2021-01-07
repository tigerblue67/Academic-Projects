close all
clear all

%adding paths to provided resources, function and variable storage
addpath('./Resources/Provided/');
addpath('./Resources/Provided/SVM-KM');
addpath('./Functions/');
addpath('./Variables/');




%% Training Section

%saveToText(" ", " ", " ", " ", " ", " ", " ", " "); %initalise the saving file with variables titles 
%tic

%Load Training Images
[Training_Images, Training_Labels] = loadFaceImages_PRE('./Resources/Provided/face_train.cdataset');
Temp_Images = [];
for i=1:size(Training_Images, 3)
    Training_Images(:, :, i) = enhanceContrastHE(Training_Images(:, :, i));
    Temp_Images = [Temp_Images; double(Im2Vector_JC(Training_Images(:, :, i)))];
end
Training_Images = Temp_Images;

% For visualization purposes, we display the first 100 images
% figure
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

modelSVM = SVMtraining(Training_Images, Training_Labels);

%Timing=toc
%saveToText("SVM HE training ", Timing);

save('./Variables/modelSVM.mat', 'modelSVM');


%% Basic Testing With Dataset
%Load testing Images
[Testing_Images, Testing_Labels] = loadFaceImages_PRE('./Resources/Provided/face_test.cdataset');

%tic

Temp_Images = [];
for i=1:size(Testing_Images, 3)
    Testing_Images(:, :, i) = enhanceContrastHE(Testing_Images(:, :, i));
    Temp_Images = [Temp_Images; double(Im2Vector_JC(Testing_Images(:, :, i)))];
end
Testing_Images = Temp_Images;

%For each testing image, we obtain a prediction based on our trained model
for i=1:size(Testing_Images,1)
    
    testnumber= Testing_Images(i,:);
    
    classificationResult(i,1) = SVMTesting(testnumber, modelSVM);
    
end

% Finally we compared the predicted classification from our mahcine
% learning algorithm against the real labelling of the esting image
comparison = (Testing_Labels==classificationResult);

%Accuracy is the most common metric. It is defiend as the numebr of
%correctly classified samples/ the total number of tested samples
Accuracy = sum(comparison)/length(comparison)
[TP, FP, TN, FN] = displayTypeErrors(classificationResult, Testing_Labels);
[Recall, Precision, Specificity, F_Measure, FalseAlarmRate] = displayEvaluationMetrics(TP, FP, TN, FN);

%Timing=toc
%saveToText("SVM HE test dataset ", Timing, Accuracy, TP, FP, TN, FN);


% %We display 100 of the correctly classified images
% figure
% title('Initial Testing Correct Classification')
% count=0;
% i=1;
% while (count<100)&&(i<=length(comparison))
%    
%     if comparison(i)
%         count=count+1;
%         subplot(10,10,count)
%         Im = reshape(Testing_Images(i,:),27,18);
%         image(Im), colormap(gray(256));
%     end
%     
%     i=i+1;
%     
% end
% 
% 
% %We display 100 of the incorrectly classified images
% figure
% title('Initial Testing Wrong Classification')
% count=0;
% i=1;
% while (count<100)&&(i<=length(comparison))
%     
%     if ~comparison(i)
%         count=count+1;
%         subplot(10,10,count)
%         Im = reshape(Testing_Images(i,:),27,18);
%         image(Im), colormap(gray(256));
%         title(num2str(classificationResult(i)))
%     end
%     
%     i=i+1;
%     
% end

%% Testing with supplied images
%Below will be code to test this using the images provided outside the inital dataset (imX.jpg)

%Load image
testIm = imread('./Resources/Provided/im1.jpg');
imshow(testIm);

%tic

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
   %figure
   %imshow(tmpIm);
   tmpIm = enhanceContrastHE(tmpIm);
   faces(i,:) = Im2Vector_JC(tmpIm);
end


predictedRow=[];
for i=1:7
    
    testnumber= faces(i,:);
    
    prediction = SVMTesting(testnumber, modelSVM);
    predictedRow=[predictedRow prediction];

end
solution = [1,1,1,1,1,1,1];
comparison = predictedRow==solution;
Accuracy = sum(sum(comparison)/size(comparison,2))
[TP,FP,TN,FN] = displayTypeErrors(predictedRow, solution);
displayEvaluationMetrics(TP,FP,TN,FN);

%Timing=toc;
%saveToText("SVM HE supplied images ", Timing, Accuracy, TP, FP, TN, FN);