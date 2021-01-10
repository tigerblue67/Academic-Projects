close all
clear all

%adding paths to provided resources, function and variable storage
addpath('./Resources/Provided/');
addpath('./Functions/');
addpath('./Variables/');

% Load Training Images
[Training_Images, Training_Labels] = loadFaceImages('./Resources/Provided/face_train.cdataset');
% Load Testing Images
[Testing_Images, Testing_Labels] = loadFaceImages('./Resources/Provided/face_test.cdataset');

%saveToText(" ", " ", " ", " ", " ", " ", " ", " "); %initalise the saving file with variables titles 
% tic

nTrees=500;
modelRF = TreeBagger(nTrees,Training_Images,Training_Labels, 'Method', 'classification'); 
% Timing=toc
% saveToText("RF training", Timing);

% tic
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
% Log loss
logLoss = crossentropy(predictions, Testing_Labels)

% How many we got right
comparison = predictions==Testing_Labels;
Accuracy=sum(comparison)/length(Testing_Labels)

% Timing=toc
% saveToText("RF test dataset", Timing, Accuracy, TP, FP, TN, FN, areaUnderCurve);

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
    testnumber= faces(i,:);
    
    prediction = modelRF.predict(testnumber);
    predictedRow=[predictedRow prediction];
end

predictedRow = str2double(predictedRow);
solution = [1,1,1,1,1,1,1];
comparison = predictedRow==solution;
Accuracy = sum(sum(comparison)/size(comparison,2))
[TP,FP,TN,FN] = displayTypeErrors(predictedRow, solution);
displayEvaluationMetrics(TP,FP,TN,FN);

%Timing=toc
%saveToText("RF Boosted supplied images ", Timing, Accuracy, TP, FP, TN, FN);



%% Testing with Images outside DB

[cbclImages, cbclLabels] = loadCBCLImages();
vectorImages = zeros(size(cbclImages, 1), 486);
for i=1:size(cbclImages, 1)
    vectorImages(i, :) = Im2Vector_JC(cbclImages(i, :, :));
end
cbclImages = vectorImages;
[cbclPredictions, cbclScores] = modelRF.predict(cbclImages);
cbclPredictions = str2double(cbclPredictions);

% Display type I and II errors
[TP, FP, TN, FN] = displayTypeErrors(cbclPredictions, cbclLabels);
% Display evaluation metrics
[Recall, Precision, Specificity, F_Measure, FalseAlarmRate] = displayEvaluationMetrics(TP, FP, TN, FN);
% ROC curve
areaUnderCurve = displayROCCurve(cbclLabels, cbclScores(:, 2), 1, 'ROC for Classification by Random Forrest')


%% Testing on images using single scale sliding window

%Load in each image
image1 = imread(strcat('./Resources/Provided/im1.jpg'));
image2 = imread(strcat('./Resources/Provided/im2.jpg'));
image3 = imread(strcat('./Resources/Provided/im3.jpg'));
image4 = imread(strcat('./Resources/Provided/im4.jpg'));

%coordinates of each face for each of the loaded in images used to error
%testing
im1Faces = [[21,9];[13,25];[27,46];[12,64];[23,82];[9,98];[23,119]];
im2Faces = [[6,6];[6,31];[6,57];[6,81];[6,108];[36,6];[36,31];[36,57];[36,80];[36,106];[66,6];[66,31];[66,56];[66,80];[66,106]];
im3Faces = [[29,15];[42,38];[45,63];[17,67];[29,93];[55,116];[70,91];[71,27]];
im4Faces = [[27,66];[49,43];[41,103];[67,63];[85,49];[84,108];[81,140];[48,157];[26,140];[114,91];[115,146];[112,25];[142,80];[150,141];[185,19];[184,114];[16,204];[42,233];[56,207];[21,264];[20,319];[47,282];[55,334];[62,255];[72,291];[80,193];[96,257];[86,323];[110,176];[110,210];[139,272];[125,305];[146,338];[178,209];[184,303];[27,379];[26,405];[42,437];[28,465];[40,487];[71,364];[63,380];[58,407];[71,520];[127,363];[110,287];[90,440];[93,496];[143,390];[124,450];[115,512];[148,472];[145,551];[188,375];[181,452];[192,532]];

%Initialising variables, Sampling X and Y can be adjusted to change how
%much the sliding window moves each iteration
samplingX = 6;
samplingY = 8;
prediction = -1;
FaceSize = [27,18];
intersectionThreshold = 0.3;
bbArea=FaceSize(1)*FaceSize(2);

% Confidence in this case will be the probability we selected this class
confidence = max(scores, [], 2);

%Loop through images 1-4
for i=1:4
    %tic
    if i==1
        currentImage=image1;
        currentLabels = im1Faces;
    elseif i==2
        currentImage=image2;
        currentLabels = im2Faces;
    elseif i==3
        currentImage=image3;
        currentLabels = im3Faces;
    else
        currentImage=image4;
        currentLabels = im4Faces;
    end

    RectArray = [];
    WindowIterations = 0;
    currentImage = double(currentImage);
    %loops for each X and Y iteration of the sliding window and runs
    %testing on each image within the sliding window
    for y=1:samplingY:size(currentImage,1)
        for x=1:samplingX:size(currentImage,2)
            WindowIterations = WindowIterations + 1;
            if (x+FaceSize(2)-1 <= size(currentImage,2))&&(y+FaceSize(1) <= size(currentImage,1))
                possibleFace = currentImage(y:y+FaceSize(1)-1,x:x+FaceSize(2)-1);
                possibleFace = Im2Vector_JC(possibleFace);
                [prediction, confidence] = modelRF.predict(possibleFace);
                prediction = str2double(cell2mat(prediction));
                confidence = max(confidence, [], 2);
                if prediction==1
                    RectArray = cat(1, RectArray, [y ,x ,confidence]);
                end
            end
        end
    end
    %Below implements NMS by checking if each array is intersecting with
    %any other array by a certain threshold (configurable) and adds it to
    %the list of bad rects to be removed in the next step
    badRect = [];
    for j=1:size(RectArray,1)-1
        for k=1:size(RectArray,1)
            if j~=k
                rect1 = [RectArray(j,2),RectArray(j,1),FaceSize(2),FaceSize(1)];
                rect2 = [RectArray(k,2),RectArray(k,1),FaceSize(2),FaceSize(1)];
                intersection_area = rectint(rect1,rect2);
                if (intersection_area/bbArea) > intersectionThreshold
                    if RectArray(j,3)<=RectArray(k,3)
                        badRect = [badRect k];
                    else
                        badRect = [badRect j];
                    end
                end
            end
        end
    end
    
    %Removes overlapping detections from the detection array
    badRect = unique(badRect);
    for j=1:size(badRect,2)
       RectArray(badRect(size(badRect,2)-j+1),:) = []; 
    end
    figure
    imshow(uint8(currentImage));
    hold on

    %Displays each detection on the image
    for j=1:size(RectArray,1)
        x1 = RectArray(j,2);
        y1 = RectArray(j,1);
        x2 = FaceSize(2);
        y2 = FaceSize(1);
        rectangle('Position', [x1 y1 x2 y2], 'EdgeColor', 'b')
    end
    hold off
    
    [TP,FP,TN,FN] = SlidingWindowTypeErrors(WindowIterations, RectArray, currentLabels);
    %displayEvaluationMetrics(TP,FP,TN,FN);
    Accuracy = (TN+TP)/WindowIterations
    %Timing=toc;
    %saveToText("RF single scale sliding " + i, Timing, Accuracy, TP, FP, TN, FN);
end


%% Testing multi-scale sliding window


%Initialising variables, Sampling X and Y can be adjusted to hcange how
%much the sliding window moves each iteration, also contains an array of
%face sizes which determines the size change of each sliding window, this
%can be altered to change detections and also initialises the intersection
%threshold which can change the removal of intersecting detections in NMS
samplingX = 6;
samplingY = 8;
prediction=-1;
predictedRow = [];
FaceSizes = [27,18; 18,12; 36,24;];
intersectionThreshold = 0.3;
im1RectArray=[];
im2RectArray=[];
im3RectArray=[];
im4RectArray=[];

%Loop through images 1-4
for i=1:4
    RectArray = [];
    badRect = [];
    WindowIterations = 0;
    %tic
    %Iterates the sliding window for each size
    for a = 1:size(FaceSizes,1)
        FaceSize = FaceSizes(a,:);
        bbArea=FaceSize(1)*FaceSize(2);
        if i==1
            currentImage=image1;
            currentLabels = im1Faces;
        elseif i==2
            currentImage=image2;
            currentLabels = im2Faces;
        elseif i==3
            currentImage=image3;
            currentLabels = im3Faces;
        else
            currentImage=image4;
            currentLabels = im4Faces;
        end

        
        currentImage = double(currentImage);
        %loops for each X and Y iteration of the sliding window and runs
        %testing on each image within the sliding window
        for y=1:samplingY:size(currentImage,1)
            for x=1:samplingX:size(currentImage,2)
                WindowIterations = WindowIterations + 1;
                if (x+FaceSize(2)-1 <= size(currentImage,2))&&(y+FaceSize(1) <= size(currentImage,1))
                    possibleFace = currentImage(y:y+FaceSize(1)-1,x:x+FaceSize(2)-1);
                    possibleFace = imresize(possibleFace, [27,18]);
                    possibleFace = Im2Vector_JC(possibleFace);
                    [prediction, confidence] = modelRF.predict(possibleFace);
                    prediction = str2double(cell2mat(prediction));
                    confidence = max(confidence, [], 2);
                    if prediction==1
                        RectArray = cat(1, RectArray, [y,x,confidence]);
                    end
                    predictedRow=[predictedRow prediction];
                end
            end
        end

    end
    
    %Below implements NMS by checking if each array is intersecting with
    %any other array by a certain threshold (configurable) and adds it to
    %the list of bad rects to be removed in the next step
    for j=1:size(RectArray,1)-1
        for k=1:size(RectArray,1)
            if j~=k
                rect1 = [RectArray(j,2),RectArray(j,1),FaceSize(2),FaceSize(1)];
                rect2 = [RectArray(k,2),RectArray(k,1),FaceSize(2),FaceSize(1)];
                intersection_area = rectint(rect1,rect2);
                if (intersection_area/bbArea) > intersectionThreshold
                    if RectArray(j,3)<=RectArray(k,3)
                        badRect = [badRect k];
                    else
                        badRect = [badRect j];
                    end
                end
            end
        end
    end
    %Removes overlapping detections from the detection array
    badRect = unique(badRect);
    for j=1:size(badRect,2)
        RectArray(badRect(size(badRect,2)-j+1),:) = [];
    end
    figure
    imshow(uint8(currentImage));
    hold on
    
    %Displays each detection on the image
    for j=1:size(RectArray,1)
        x1 = RectArray(j,2);
        y1 = RectArray(j,1);
        x2 = FaceSize(2);
        y2 = FaceSize(1);
        rectangle('Position', [x1 y1 x2 y2], 'EdgeColor', 'b')
    end
    hold off
    
    [TP,FP,TN,FN] = SlidingWindowTypeErrors(WindowIterations, RectArray, currentLabels);
    %displayEvaluationMetrics(TP,FP,TN,FN);
    Accuracy = (TN+TP)/WindowIterations
    %Timing=toc;
    %saveToText("RF multi scale sliding " + i, Timing, Accuracy, TP, FP, TN, FN);
end

