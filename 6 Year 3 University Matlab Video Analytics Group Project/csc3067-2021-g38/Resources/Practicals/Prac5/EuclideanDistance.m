function [dEuc] = EuclideanDistance(sample1, sample2)
dEuc = sum(abs(sample1 - sample2));
end

