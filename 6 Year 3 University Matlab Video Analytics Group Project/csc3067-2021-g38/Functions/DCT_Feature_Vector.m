function VectorTotal = DCT_Feature_Vector(image)
addpath('./Resources/DCTZigZag/zigzag');
padImage = imresize(image, [24 16]);

yTimes = size(padImage,1)/8;
xTimes = size(padImage,2)/8;

VectorTotal = [];

for k = 1:yTimes
    for l = 1:xTimes
        currentImage = padImage(yTimes*(1:8),xTimes*(1:8));
        DCTimage = dct2(currentImage);
        Vector = zigzag(DCTimage);
        %Vector(17:64) = [];
        VectorTotal = [VectorTotal Vector];
    end   
end

end
