clear all;
close all;

noisyBoat = imread('boatnois.jpg');

subplot(1,3,1)
imshow(noisyBoat);

subplot(1,3,2)
mask = ones(3)/9;
filterBoat = uint8(filter2(mask, noisyBoat));
imshow(filterBoat);

subplot(1,3,3)
myFilterBoat = uint8(myConvolution(noisyBoat, mask));
imshow(myFilterBoat);