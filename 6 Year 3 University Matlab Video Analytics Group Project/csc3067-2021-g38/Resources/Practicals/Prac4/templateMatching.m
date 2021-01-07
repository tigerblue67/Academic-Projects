function [BB] = templateMatching(inputImage,template)
inputImage = double(rgb2gray(inputImage));
template = double(rgb2gray(template));
width = size(template, 1);
height = size(template, 2);

correlationMap = filter2(template, inputImage);

maxGrayLevel = max(correlationMap(:));
[rows, columns] = find(correlationMap == maxGrayLevel);
% Just selecting one value from middle incase we get multiple matches
x = rows(uint8(end/2));
y = columns(uint8(end/2));

BB = [y-(height/2) x-(width/2) height width];
end

