close all;
clear all;

% Task 3: Background Update
videoObj = VideoReader('viptraffic.avi');
frames = read(videoObj);
lastFrame = get(videoObj,'NumFrames');
bkg = frames(:,:,:,lastFrame);
bkgGray = rgb2gray(bkg);
bkgGray = double(bkgGray);

Mask3 = ones(3,3); %use two different masks to get better accuracy
Mask7 = ones(7,7);

for i = 1:get(videoObj,'NumFrames')
    % We have to convert to double or substractions under 0 will be borked
    currentFrame = double(rgb2gray(frames(:,:,:,i)));
    subplot(2,3,1), imagesc(currentFrame), title(['Frame: ',num2str(i)]);
    subplot(2,3,2), imagesc(bkgGray), title('Background');
   
    Blobs=abs(currentFrame - bkgGray) > 45.5;
    subplot(2,3,3), imagesc(Blobs), title('Blobs'), colormap(gray);
    
    Blobs = imclose(Blobs, Mask7);
    Blobs = imopen(Blobs, Mask3);
    subplot(2,3,4), imshow(Blobs), title('Post-processed Blobs'), colormap(gray);
    
    BlobsLabel = bwlabel(Blobs,4);
    subplot(2,3,5), imshow(BlobsLabel), title('Labelling')
    
    subplot(2,3,6), imagesc(currentFrame), title('Detections'), hold on
    BBs = boundingBoxes(BlobsLabel);
    for b = 1: max(max(BlobsLabel))
        rectangle('Position', [abs(BBs(b,1)) abs(BBs(b,2)) abs(BBs(b,3)-BBs(b,1)+1) abs(BBs(b,4)-BBs(b,2)+1)])
    end
    hold off
    pause(0.05);
end