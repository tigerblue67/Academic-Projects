clear all
close all

%% training Stage

% Loading labels and examples of handwritten digits from MNIST Dataset
%Since they are too many of them, to make it usable for this practical we
%will be taking one out of many images (one out of 'sampling'). This is
%done by using the variable sampling>1
sampling=50;
images = loadMNISTImages('train-images',sampling);
labels = loadMNISTLabels('train-labels',sampling);

% For visualization purposes, we display the first 100 images
figure
for i=1:100

    % As you can notice by the size of the matrix image, each digit image
    % has been transform into a long feature vector to be fed in a machine
    % learning algorithm.
    
    %To visualise or recompose the image again, we need to revert that
    %process in its 28x28 image format
    Im = reshape(images(i,:),28,28);
    subplot(10,10,i), imagesc(Im), title(['label: ',num2str(labels(i))])
    
end

%Supervised training function that takes the examples and infers a model
[eigenVectors, eigenvalues, meanX, Xpca] = PrincipalComponentAnalysis(images);
modelNN = NNtraining(Xpca, labels);

%% testing
% Loading testing labels and testing examples of handwritten digits from MNIST Dataset
% It is very important that this images are different from the ones used in
% training or our results will not be reliable

images = loadMNISTImages('test-images',sampling);
labels = loadMNISTLabels('test-labels',sampling);

%For each testing image, we obtain a prediction based on our trained model
for i=1:size(images,1)
    
    testnumber= images(i,:);
    testnumber = (testnumber - meanX) * eigenVectors;
    
    % classificationResult(i,1) = NNTesting(testnumber, modelNN);
    classificationResult(i,1) = KNNTesting(testnumber, modelNN, 3);
    
end

confusionMatrix = confusionmat(labels, classificationResult)

%% Evaluation

% Finally we compared the predicted classification from our mahcine
% learning algorithm against the real labelling of the esting image
comparison = (labels==classificationResult);

%Accuracy is the most common metric. It is defiend as the numebr of
%correctly classified samples/ the total number of tested samples
Accuracy = sum(comparison)/length(comparison)


%We display 100 of the correctly classified images
figure
title('Correct Classification')
count=0;
i=1;
while (count<100)&&(i<=length(comparison))
   
    if comparison(i)
        count=count+1;
        subplot(10,10,count)
        Im = reshape(images(i,:),28,28);
        imshow(Im)
    end
    
    i=i+1;
    
end


%We display 100 of the incorrectly classified images
figure
title('Wrong Classification')
count=0;
i=1;
while (count<100)&&(i<=length(comparison))
    
    if ~comparison(i)
        count=count+1;
        subplot(10,10,count)
        Im = reshape(images(i,:),28,28);
        imshow(Im)
        title(num2str(classificationResult(i)))
    end
    
    i=i+1;
    
end
