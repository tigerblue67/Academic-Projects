function [dEuc] = EuclideanDistance_JC(sample1,sample2)
%EUCLIDEANDISTANCE Summary of this function goes here
%   Detailed explanation goes here
dEuc = 0;
for i = 1:size(sample1, 2)
dEuc = dEuc + abs(sample1(i)-sample2(i));
end

end

