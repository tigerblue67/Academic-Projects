close all
clear all

%adding paths to provided resources, function and variable storage
addpath('./Resources/Provided/');
addpath('./Functions/');
addpath('./Variables/');

image1 = imread(strcat('./Resources/Provided/im1.jpg'));
image2 = imread(strcat('./Resources/Provided/im2.jpg'));
image3 = imread(strcat('./Resources/Provided/im3.jpg'));
image4 = imread(strcat('./Resources/Provided/im4.jpg'));

for i = 1:4
    if i==1
        currentImage=image1;
    elseif i==2
        currentImage=image2;
    elseif i==3
        currentImage=image3;
    else
        currentImage=image4;
    end
    ObjectDetection(currentImage, 'haarcascade_frontalface_alt.mat');
    
end