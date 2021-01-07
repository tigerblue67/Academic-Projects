function [Lut] = contrast_HE_Lut(Iin)

Lut(1,256) = 0;
h = histogram(Iin, 'BinLimits', [0 256],'BinWidth',1).Values;
c = cumsum(h);
NP = c(256)/256; %number of pixels divided by greyscale pixel amount

for index=1:size(Lut,2)
    Lut(1,index) = max(0,(c(index) / NP) -1);
end

Lut=uint8(Lut);

end

