clear all;
close all;

subplot(2,3,1)
boat = imread('boat256.jpg');
image(boat);

subplot(2,3,4)
boatHist = histogram(boat, 'BinLimits', [0,256], 'BinWidth', 1);

subplot(2,3,2)
Lut = brightnessLut(50);
plot(Lut);
ylim([0,300])

subplot(2,3,3)
enhancedBoat = enhanceBrightness(boat, 50);
imshow(enhancedBoat)

subplot(2,3,6)
histogram(enhancedBoat, 'BinLimits', [0,256], 'BinWidth', 1);

