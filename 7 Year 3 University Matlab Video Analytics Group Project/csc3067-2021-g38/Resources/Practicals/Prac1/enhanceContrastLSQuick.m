function outputImage = enhanceContrastLSQuick(inputImage,m, c)
outputImage = uint8((double(m)*double(inputImage) + double(c)));
end

