clear all;
close all;

boat = imread('boat256.jpg');
dome = imread('dome256.jpg');

subplot(3,2,1)
[enhancedBoat, transferFunction] = enhanceContrastHE(boat);
imshow(enhancedBoat);
subplot(3,2,3)
histogram(enhancedBoat, 'BinLimits', [0,256], 'BinWidth', 1);
subplot(3,2,5)
plot(transferFunction);

subplot(3,2,2)
[enhancedDome, transferFunction] = enhanceContrastHE(dome);
imshow(enhancedDome);
subplot(3,2,4)
histogram(enhancedDome, 'BinLimits', [0,256], 'BinWidth', 1);
subplot(3,2,6)
plot(transferFunction);