clear all;
close all;

boat = imread('boat256.jpg');
subplot(2,2,1);
imshow(boat);

dome = imread('dome256.jpg');
subplot(2,2,2);
imshow(dome);

subplot(2,2,3);
boatHist=histogram(boat, 'BinLimits', [0,256], 'BinWidth', 1);

subplot(2,2,4);
domeHist=histogram(dome, 'BinLimits', [0,256], 'BinWidth', 1);

boatHistValues=boatHist.Values
