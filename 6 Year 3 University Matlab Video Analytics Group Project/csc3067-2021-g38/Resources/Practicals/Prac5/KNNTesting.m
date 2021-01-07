function prediction = KNNTesting(testImage, modelNN, k)
% Get how many training images we have in the model
modelLength = size(modelNN.neighbours, 1);
distanceVector = zeros(2,modelLength);

for i=1:modelLength
    distanceVector(1,i) = modelNN.labels(i);
    distanceVector(2,i) = EuclideanDistance(testImage, modelNN.neighbours(i, :));
end
% Sorting vector on distances only, '~' doesn't get used cause I only want
% the order to put the vector back together lol
[~, order] = sort(distanceVector(2, :));
distanceVector = distanceVector(:, order);
kNearest = distanceVector(1, 1:k);

prediction = mode(kNearest);
end
