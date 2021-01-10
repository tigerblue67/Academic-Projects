close all;
clear all;

% Preprocessing and Naive Segmentation
% Simple implementation on pre-processing and segmentation

vehicle = imread('vehicle.jpg');
subplot(6,2,1);
imshow(vehicle);
title('original')

subplot(6,2,3);
histogram(vehicle, 'BinLimits', [0,256], 'BinWidth', 1);
title("original hist");

subplot(6,2,2);
%[enhancedVehicle, transferFunctionVehicle] = histeq(vehicle);
%enhancedVehicle = vehicle + 45;
%enhancedVehicle = histeq(vehicle);
%enhancedVehicle = adapthisteq(enhancedVehicle);
%enhancedVehicle = vehicle * 1.5;

% After attempting everything it turns out jesus used Auto LS
enhancedVehicle = enhanceContrastALS(vehicle);

%B(1:3,1:3) = 1/9;
%enhanceVehicle = uint8(filter2(B, enhancedVehicle));

imshow(enhancedVehicle);
title("Auto LS image")


subplot(6,2,4);
histogram(enhancedVehicle, 'BinLimits', [0,256], 'BinWidth', 1);
title("Auto LS hist");
%title("histeq hist");

subplot(6,2,5);
thresholdImage = enhancedVehicle <= 45;
imshow(thresholdImage);
title("Correct threshold");

subplot(6,2,6)
thresholdImage = enhancedVehicle <= 80;
imshow(thresholdImage);
title("Incorrect threshold;")




% 2nd vehicle
vehicle = imread('vehicle2.jpg');
subplot(6,2,7);
imshow(vehicle);
title('original')

subplot(6,2,9);
histogram(vehicle, 'BinLimits', [0,256], 'BinWidth', 1);
title("original hist");

subplot(6,2,8);
%[enhancedVehicle, transferFunctionVehicle] = histeq(vehicle);
%enhancedVehicle = vehicle + 45;
%enhancedVehicle = histeq(vehicle);
%enhancedVehicle = adapthisteq(enhancedVehicle);
%enhancedVehicle = vehicle * 1.5;

% After attempting everything it turns out jesus used Auto LS
enhancedVehicle = enhanceContrastALS(vehicle);

%B(1:3,1:3) = 1/9;
%enhanceVehicle = uint8(filter2(B, enhancedVehicle));

imshow(enhancedVehicle);
title("Auto LS image")


subplot(6,2,10);
histogram(enhancedVehicle, 'BinLimits', [0,256], 'BinWidth', 1);
title("Auto LS hist");
%title("histeq hist");

% Cant use same threshold as this car is lighter
subplot(6,2,11);
thresholdImage = enhancedVehicle <= 55;
imshow(thresholdImage);
title("Correct threshold");

subplot(6,2,12)
thresholdImage = enhancedVehicle <= 100;
imshow(thresholdImage);
title("Incorrect threshold;")

