function [Edges, Ihor, Iver] = edgeExtraction(inputImage,B1, B2)
Ihor = filter2(B1, inputImage);
Iver = filter2(B2, inputImage);

Edges = sqrt(Iver.^2 + Ihor.^2);
end

