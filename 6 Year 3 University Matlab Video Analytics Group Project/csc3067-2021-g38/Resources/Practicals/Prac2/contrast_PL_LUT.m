function [lut] = contrast_PL_LUT(gamma)
lut=zeros(256,1);
for i=1:256
    output = round((i^gamma)/(255^(gamma-1)));
    if output > 255 
        lut(i)=255;
    elseif output < 0 
        lut(i)=0;
    else
        lut(i)=output;
    end
end
lut=uint8(lut);
end

