function prediction = NNTesting(testImage,modelNN)
% Get how many training images we have in the model
modelLength = size(modelNN.neighbours, 1);
closest = intmax;

for i=1:modelLength
    dEuc = EuclideanDistance(testImage, modelNN.neighbours(i, :));
    if (dEuc < closest)
        closest = dEuc;
        prediction = modelNN.labels(i);
    end
end
end

