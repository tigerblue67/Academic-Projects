close all;
clear all;

% Task 2: Motion detection using background substraction
videoObj = VideoReader('viptraffic.avi');
frames = read(videoObj);
lastFrame = get(videoObj,'NumFrames');
bkg = frames(:,:,:,lastFrame);
bkgGray = rgb2gray(bkg);
bkgGray = double(bkgGray);
imshow(bkgGray);

% approximation
bkgGray2 = bkg(:,:,1)/3 + bkg(:,:,2)/3 + bkg(:,:,3)/3;
imshow(bkgGray2);

% Comparison: I tested with a timer and the approximation is quicker and I
% can't see the difference -_-
figure
subplot(1,3,1), imshow(bkg), title('Colour Bkg')
% Elapsed time is 0.002124 seconds.
subplot(1,3,2), imshow(bkgGray), title('Gray Bkg'), colormap(gray)
% Elapsed time is 0.000722 seconds.
subplot(1,3,3), imshow(bkgGray2), title('Gray Bkg Approx'), colormap(gray)

vidObj2 = VideoWriter('resultTraffic.avi');
open(vidObj2);
MAP=colormap(gray(256));
for i = 1:lastFrame
    % We have to convert to double or substractions under 0 will be borked
    currentFrame = double(rgb2gray(frames(:,:,:,i)));
    subplot(2,3,1), imagesc(currentFrame), title(['Frame: ',num2str(i)]);
    subplot(2,3,2), imagesc(bkgGray), title('Background');
    Blobs=abs(currentFrame - bkgGray) > 45;
    subplot(2,3,3), imagesc(Blobs), title('Blobs'), colormap(gray);
    pause(0.2);
    
    %Write video
    frame = im2frame(uint8(Blobs)*255, MAP);
    writeVideo(vidObj2,frame);
end

close(vidObj2);


