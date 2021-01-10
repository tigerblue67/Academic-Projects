function [images labels] = loadCBCLImages()

% This is where the cbcl face images reside
path = fullfile(pwd,  './Resources/CBCL_Dataset/face')
D=dir(fullfile(path,'*.pgm'));

faceImages=zeros(numel(D), 27, 18);
for k=1:numel(D)
    face = imread(fullfile(path,D(k).name));
    face = imresize(face, [27, 18]);
    faceImages(k, :, :) = double(face);
end
faceLabels(1:numel(D), :) = 1;

% Now for the non-faces
path = fullfile(pwd,  './Resources/CBCL_Dataset/face')
D=dir(fullfile(path,'*.pgm'));

nonfaceImages=zeros(numel(D), 27, 18);
for k=1:numel(D)
    nonface = imread(fullfile(path,D(k).name));
    nonface = imresize(face, [27, 18]);
    nonfaceImages(k, :, :) = double(nonface);
end
nonfaceLabels(1:numel(D), :) = 0;

images = [faceImages; nonfaceImages];
labels = [faceLabels; nonfaceLabels];
end

