function outputImage = enhanceContrastLS(inputImage,m, c)
Lut = contrastLut(m,c);
outputImage = intlut(inputImage, Lut);
end

