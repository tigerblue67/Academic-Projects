function [lut, transferFunction] = contrast_HE_LUT(inputImage)
[pixelCounts, greyLevels] = imhist(inputImage);
lut = zeros(length(greyLevels), 1);

transferFunction = cumsum(pixelCounts);
idealNumberOfPixels = sum(pixelCounts) / length(greyLevels);

for i=1:length(greyLevels)
    lut(i) = max(0,uint8((transferFunction(i) / idealNumberOfPixels) - 1));
end
end

