clear all;
close all;

% Load and display boat image with noise
noisyBoat = imread('boatnois.jpg');
subplot(1,5,1)
imshow(noisyBoat)

% Create mask B with every element equal to 1/9
B(1:3,1:3) = 1/9;

subplot(1,5,2)
conv2Boat = uint8(conv2(B, noisyBoat));
imshow(conv2Boat);

subplot(1,5,3)
filter2Boat = uint8(filter2(B, noisyBoat));
imshow(filter2Boat);

subplot(1,5,4)
C = ones(5,5)/25;
bigMaskBoat = uint8(filter2(C, noisyBoat));
imshow(noisyBoat)

subplot(1,5,5)
medMaskBoat = noiseReduction(noisyBoat, 4);
imshow(medMaskBoat);