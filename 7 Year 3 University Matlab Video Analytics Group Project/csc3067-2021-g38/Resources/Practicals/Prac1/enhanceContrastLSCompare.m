close all;
clear all;

boat = imread('boat256.jpg');

subplot(2,2,1)
enhanceBoat = enhanceContrastLS(boat, 1.5, -70);
imshow(enhanceBoat);

subplot(2,2,3)
histogram(enhanceBoat, 'BinLimits', [0, 256], 'BinWidth', 1)

subplot(2,2,2)
enhanceBoatQuick = enhanceContrastLSQuick(boat, 1.5, -70);
imshow(enhanceBoatQuick);

subplot(2,2,4)
histogram(enhanceBoatQuick, 'BinLimits', [0, 256], 'BinWidth', 1)