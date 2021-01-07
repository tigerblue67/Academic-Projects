function outputImage = enhanceContrastAuto(inputImage)
histValues = histcounts(inputImage, 'BinLimits', [0,256], 'BinWidth', 1);
lowest = find(histValues>1, 1, 'first');
highest = find(histValues>1, 1, 'last');

m = (255/(highest-lowest));
c = (-m*lowest);

Lut = contrastLut(m,c);
outputImage = intlut(inputImage, Lut);
end
