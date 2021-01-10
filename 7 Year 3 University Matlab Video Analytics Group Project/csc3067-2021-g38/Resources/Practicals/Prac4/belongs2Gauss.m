function [belongs] = belongs2Gauss(distance,sd, threshold)
% Task 1 - calculate if a pixel belongs to a gaussian
belongs = (distance / sd) <= threshold;
end

