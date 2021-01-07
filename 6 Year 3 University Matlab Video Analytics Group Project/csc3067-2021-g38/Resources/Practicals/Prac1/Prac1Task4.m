close all;
clear all;

boat = imread('boat256.jpg');
subplot(2,3,1)
lowGamma = enhanceContrastPL(boat, 0.5);
imshow(lowGamma)

subplot(2,3,4)
histogram(lowGamma, 'BinLimits', [0, 256], 'BinWidth', 1);

subplot(2,3,2)
midGamma = enhanceContrastPL(boat, 2);
imshow(midGamma)

subplot(2,3,5)
histogram(midGamma, 'BinLimits', [0,256], 'BinWidth', 1);

subplot(2,3,3)
highGamma = enhanceContrastPL(boat, 3);
imshow(highGamma)

subplot(2,3,6)
histogram(highGamma, 'BinLimits', [0, 256], 'BinWidth', 1);