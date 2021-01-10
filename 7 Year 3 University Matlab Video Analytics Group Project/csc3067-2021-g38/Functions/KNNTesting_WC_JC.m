function [prediction, confidence] = KNNTesting_WC_JC(testImage,modelNN, K)
%KNNTESTING Summary of this function goes here
sample2 = modelNN.neighbours;
sizeneigh = size(sample2,1);
confidencePercent = 0.0;
for i=1:sizeneigh
    result(i) = EuclideanDistance_JC(testImage,sample2(i,:));
    ValnLabel(i,1) = result(i);
    ValnLabel(i,2) = modelNN.labels(i);
end
ValnLabel = sortrows(ValnLabel,1);
Knear(1:K) = ValnLabel(1:K,2);
confidence = sum(ValnLabel(1:K,1))/K;

prediction = mode(Knear);
for i=1:K
   if Knear(i)==prediction
       confidencePercent = confidencePercent +1;
   end
end
confidencePercent = confidencePercent/K;
confidence = confidence/confidencePercent;
end

