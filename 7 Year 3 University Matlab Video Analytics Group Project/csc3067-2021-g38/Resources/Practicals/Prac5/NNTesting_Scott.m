function [prediction] = NNTesting_Scott(testImage, modelNN)

dEuc = EuclideanDistance(testImage, modelNN);
[closestDistance,index] = min(dEuc(:,1));


prediction = dEuc(index,2); %get the index of the closestdistance, then return the label associated

%My Elapsed time is 10.676618 seconds.
%Jonnys Elapsed time is 0.862843 seconds.

end