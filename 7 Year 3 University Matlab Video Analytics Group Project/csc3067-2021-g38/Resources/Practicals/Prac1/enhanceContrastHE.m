function [outputImage, transferFunction] = enhanceContrastHE(inputImage)
outputImage = uint8(zeros(length(inputImage)));
[lut, transferFunction] = contrast_HE_LUT(inputImage);

for greyLevel=0:length(inputImage)-1
    firstInstance = find(lut==greyLevel, 1, 'first');
    pixelRange=sum(lut(:)==greyLevel);
    
    for i=0:(pixelRange - 1)
        for row=1:length(inputImage)
            for column=1:length(inputImage)
                
                if inputImage(row, column) == (firstInstance + i)
                    outputImage(row, column) = uint8(greyLevel);
                end
                
            end
        end
    end
end
end

