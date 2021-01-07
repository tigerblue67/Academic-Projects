function [Iout] = enhanceContrastHE(Iin)

Lut = contrast_HE_Lut(Iin);
Iout = intlut(Iin,Lut);
end

