function [lut] = contrastLut(m, c)
lut=zeros(256,1);
for i=1:256
    if i < double(-c)/double(m) 
        lut(i) = 0;
    elseif i > (double(255 - c))/double(m)
        lut(i) = 255;
    else
        lut(i) = (double(m)*double(i)) + double(c);
    end
end
lut=uint8(lut);
end

