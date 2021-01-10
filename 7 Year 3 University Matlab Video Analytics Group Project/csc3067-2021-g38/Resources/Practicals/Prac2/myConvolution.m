function outputImage = myConvolution(inputImage,mask)
inputImage=double(inputImage);
mask=double(mask);

% We're assuming the mask/image is of equal length here for simplicity
maskLength = length(mask);
imageLength = length(inputImage);
outputImage = zeros(imageLength-maskLength+1);
oImageLength = length(outputImage);
skip = false;

for i=1:imageLength 
    for j=1:imageLength
        sum = 0.0;
        skip = false;
        for k=1:maskLength
            for l=1:maskLength
                x = i + (k-1);
                y = j + (l-1);
                % Should check if x/y + mask exceeds bounds and then skip
                % but f that
                if x>256; x=256; end
                if y>256; y=256; end
                if (x+maskLength)>256 || (y+maskLength)>256; skip = true; end
                sum = sum + (mask(k,l) * inputImage(x,y)); 
            end
        end
        if skip==false; outputImage(i,j) = uint8(sum); end
    end
end
end
