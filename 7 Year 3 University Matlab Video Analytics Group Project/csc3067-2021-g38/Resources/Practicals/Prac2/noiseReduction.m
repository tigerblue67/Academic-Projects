function [outputImage] = noiseReduction(inputImage, N)
mask = ones(N, N)/(N*N);
outputImage = uint8(filter2(mask, inputImage));
end

