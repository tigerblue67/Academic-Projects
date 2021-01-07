function [lut] = brightnessLut(c)
lut=zeros(256,1);
for i=1:256
    if i < -c 
        lut(i) = 0;
    elseif i > (255 - c)
        lut(i) = 255;
    else
        lut(i) = i + c;
    end
end
lut=uint8(lut);
end

