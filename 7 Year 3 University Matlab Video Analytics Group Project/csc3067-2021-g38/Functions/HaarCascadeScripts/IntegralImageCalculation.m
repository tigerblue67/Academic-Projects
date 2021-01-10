function Iout = IntegralImageCalculation(Iin)

% Calculate the integral image
imSize = size(Iin);
Iout = zeros(imSize);
for x = 1:imSize(2)
    for y = 1:imSize(1)
        Iout(y,x) = sum(sum(Iin(1:y,1:x)));
    end
end
end