function [prediction, confidence] = NNTesting_WC_SB(testImage, modelNN)

dEuc = EuclideanDistance_SB(testImage, modelNN);
[distance,index] = min(dEuc(:,1));

prediction = dEuc(index,2);
confidence = distance;
end

