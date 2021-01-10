close all;
clear all;

% Task 3: Background Update
videoObj = VideoReader('viptraffic.avi');
frames = read(videoObj);
bkgGray = bkgGenerator(frames, 5);

for i = 1:get(videoObj,'NumFrames')
    % We have to convert to double or substractions under 0 will be borked
    currentFrame = double(rgb2gray(frames(:,:,:,i)));
    subplot(2,3,1), imagesc(currentFrame), title(['Frame: ',num2str(i)]);
    subplot(2,3,2), imagesc(bkgGray), title('Background');
    Blobs=abs(currentFrame - bkgGray) > 45;
    subplot(2,3,3), imagesc(Blobs), title('Blobs'), colormap(gray);
    pause(0.1);
end

