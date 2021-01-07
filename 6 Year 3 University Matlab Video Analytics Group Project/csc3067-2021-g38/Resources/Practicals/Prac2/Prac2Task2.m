close all 
clear all

% Neighbourhood operation for edge extraction

boat = imread('boat256.jpg');
subplot(2,2,1);
imshow(boat);

subplot(2,2,2);
B1 = ones(3);
B1(:, 1) = -1;
B1(:, 2) = 0;

B2 = ones(3);
B2(1, :) = -1;
B2(2, :) = 0;

[Edges, Ihor, Iver] = edgeExtraction(boat, B1, B2);
imagesc(Edges);

subplot(2,2,3);
imagesc(Ihor);

subplot(2,2,4);
imagesc(Iver);

colormap(gray(256))
