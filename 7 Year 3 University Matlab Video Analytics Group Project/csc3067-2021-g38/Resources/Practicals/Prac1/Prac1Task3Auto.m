close all;
clear all;

"Automatic contrast attempt"

boat = imread('boat256.jpg');
subplot(2,3,1);
imshow(boat)

subplot(2,3,4)
histogram(boat, 'BinLimits', [0,256], 'BinWidth', 1)
xlim([0 300])

subplot (2,3,2)
lut = contrastLut(2, -100);
plot(lut)

subplot(2,3,3)
enhanceBoat = enhanceContrastALS(boat);
imshow(enhanceBoat)


subplot(2,3,6)
histogram(enhanceBoat, 'BinLimits', [0,256], 'BinWidth', 1)
xlim([0 300])
