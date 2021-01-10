close all
clear all

%adding paths to provided resources, function and variable storage
addpath('./Resources/Provided/');
addpath('./Resources/Provided/SVM-KM');

addpath('./Functions/');
addpath('./Variables/');



for e = 1:5
    
    [Training_Images, Training_Labels, Testing_Images, Testing_Labels] = DataSetCrossValidation(e, 5);
    
    %% Training Section
    
    saveToText(" ", " ", " ", " ", " ", " ", " ", " "); %initalise the saving file with variables titles
    tic
    
    %Load Training Images
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
    
    modelSVMHOG = SVMtraining(Training_Images, Training_Labels);
    
    Timing=toc
    saveToText("SVM HOG training Cross Validation " + e, Timing);
    
    save('./Variables/modelSVMHOG.mat', 'modelSVMHOG');
    
    
    %% Basic Testing With Dataset
    %Load testing Images
    
    tic
    
    %For each testing image, we obtain a prediction based on our trained model
    for i=1:size(Testing_Images,1)
        
        testnumber= Testing_Images(i,:);
        
        [prediction, score] = SVMTesting(testnumber, modelSVMHOG);
        classificationResult(i,1) = prediction;
        scores(i) = score;
        
    end
    Timing=toc
    
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
    
    saveToText("SVM HOG test Cross Validation" + e, Timing, Accuracy, TP, FP, TN, FN, areaUnderCurve);
end
