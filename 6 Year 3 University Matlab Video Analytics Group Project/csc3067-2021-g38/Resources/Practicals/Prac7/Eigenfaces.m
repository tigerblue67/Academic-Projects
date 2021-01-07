clear all 
close all 
load Yale_64x64
[nSamples, nDimensions] = size(fea); 

h=64;
w=64;
% draw the first 9 images 
load('Yale_64x64.mat')
for i=1:9
    subplot(3,3,i);
    displayImage = reshape(fea(i, :), 64, 64);
    imshow(uint8(displayImage));
end

% Apply PCA
[eigenVectors, eigenvalues, meanX, Xpca] = PrincipalComponentAnalysis(fea, 15);

%% show 0th through 15th principal eigenvectors 
eig0 = reshape(meanX, [h,w]); 
figure,subplot(4,4,1) 
imagesc(eig0) 
colormap gray 
for i = 1:15 
subplot(4,4,i+1) 
imagesc(reshape(eigenVectors(:,i),h,w)) 
end

%%
%animation for observing the variation of the first eigenvector
eigVector_index=2;
weights = [-3*sqrt(eigenvalues(eigVector_index)): 6*sqrt(eigenvalues(eigVector_index))/200: 3*sqrt(eigenvalues(eigVector_index))];
figure
for b=weights
 faceReconstruct = meanX + b*eigenVectors(:,eigVector_index)';
 faceReconstructImage = reshape(faceReconstruct,[h w]);
 imagesc(faceReconstructImage), colormap(gray), axis equal, axis off,
 drawnow
end

