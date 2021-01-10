function prediction = KNNTesting_JC(testImage,modelNN, K)
%KNNTESTING Summary of this function goes here
sample2 = modelNN.neighbours;
sizeneigh = size(sample2,1);
for i=1:sizeneigh
    result(i) = EuclideanDistance_JC(testImage,sample2(i,:));
    ValnLabel(i,1) = result(i);
    ValnLabel(i,2) = modelNN.labels(i);
end
ValnLabel = sortrows(ValnLabel,1);
Knear(1:K) = ValnLabel(1:K,2);

prediction = mode(Knear);
end

