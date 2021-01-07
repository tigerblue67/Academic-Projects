function [outputImage] = enhanceContrastPL(inputImage, gamma)
imDub = double(inputImage);
outputImage = uint8((imDub.^gamma) / (255^(gamma-1)));
end

