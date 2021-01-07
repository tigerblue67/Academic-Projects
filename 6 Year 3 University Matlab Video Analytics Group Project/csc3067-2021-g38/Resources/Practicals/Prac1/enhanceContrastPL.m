function [outputImage] = enhanceContrastPL(inputImage, gamma)
lut = contrast_PL_LUT(gamma);
outputImage = intlut(inputImage, lut);
end

