function [distance] = distance2Gauss(pixelVal,mean)
% Task 1: function to calculate the Mahalanobis distance
distance = abs(pixelVal - mean);
end

