function Iout = IntegralImageCalculation(Iin)

% Calculate the integral image
imSize = size(Iin);
sum = 0;
Iout = zeros(imSize);
for x = 1:imSize(2)
    for y = 1:imSize(1)
        
        sum = sum + Iin(y,x);
        Iout(y,x) = sum;
    end
end
sum = 0;
for y = 1:imSize(1)
    for x = 1:imSize(2)
        sum = sum + Iin(y,x);
        if sum < Iout(y,x)
            Iout(y,x) = sum;
        end
    end
end