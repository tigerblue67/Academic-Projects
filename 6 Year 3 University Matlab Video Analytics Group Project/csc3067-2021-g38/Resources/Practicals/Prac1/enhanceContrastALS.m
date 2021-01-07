function outputImage = enhanceContrastALS(inputImage)
hist = histogram(inputImage, 'BinLimits', [0,256], 'BinWidth', 1);
histValues = hist.Values;
lowest = find(histValues>10, 1, 'first');
highest = find(histValues>10, 1, 'last');

m = (255/(highest-lowest));
c = (-m*lowest);

Lut = contrastLut(m,c);
outputImage = intlut(inputImage, Lut);
end
