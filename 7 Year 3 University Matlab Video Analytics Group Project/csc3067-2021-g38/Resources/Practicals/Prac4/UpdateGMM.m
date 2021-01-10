function [w, mean, sd] = UpdateGMM(w, mean, sd, alpha, pixval)
if nargin<5
    w = (1 - alpha) * w;
else
    w = ((1 - alpha) * w) + alpha;
    mean = ((1 - (alpha/w)) * mean) + ((alpha/w) * pixval);
    sd = sqrt(((1 - (alpha/w)) * (sd^2)) + ((alpha/w) * (pixval-mean)^2));
end
end

