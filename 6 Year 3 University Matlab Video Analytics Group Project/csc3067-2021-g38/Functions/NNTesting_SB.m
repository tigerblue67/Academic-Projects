function [prediction] = NNTesting_SB(testImage, modelNN)

dEuc = EuclideanDistance_SB(testImage, modelNN);
[~,index] = min(dEuc(:,1));

prediction = dEuc(index,2);
end

