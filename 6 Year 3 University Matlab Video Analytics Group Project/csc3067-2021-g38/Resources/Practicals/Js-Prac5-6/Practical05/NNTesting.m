function prediction = NNTesting(testImage, modelNN)
%NNTESTING Summary of this function goes here
%   Detailed explanation goes here
sample2 = modelNN.neighbours;
sizeneigh = size(sample2,1);
for i=1:sizeneigh
    result(i) = EuclideanDistance(testImage,sample2(i,:));
end
[num,index] = min(result);
prediction = modelNN.labels(index);
end

