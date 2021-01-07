close all;
clear all;

% Task 2: Optical flow

videoObj = VideoReader('viptraffic.avi');
frames = read(videoObj);

morphMask = ones(9);
for i = 2:videoObj.NumFrames
    currentFrame = double(frames(:,:,:,i));
    currentFrameGray = currentFrame(:,:,1)/3 + currentFrame(:,:,2)/3 + currentFrame(:,:,3)/3;
    
    previousFrame = double(frames(:,:,:,i-1));
    previousFrameGray = previousFrame(:,:,1)/3 + previousFrame(:,:,2)/3 + previousFrame(:,:,3)/3;
    
    [u, v] = HS(previousFrameGray, currentFrameGray);
    
    figure(1)
    subplot(1,3,1), title('Optical Flow');
    imshow(previousFrameGray,[0 255]), hold on
    quiver(u, v, 4, 'color', 'b', 'linewidth', 2);
    set(gca,'YDir','reverse');
    hold off

    mag = sqrt(u.^2+v.^2);
    vel_th = 3;
    Blobs = mag >= vel_th;
    subplot(1,3,2), title('Blobs'), imshow(Blobs);
    
    Blobs = imclose(Blobs, morphMask);
    Blobs = imopen(Blobs, morphMask);
    
    subplot(1,3,2), imshow(Blobs), title('Post-processed Blobs'), colormap(gray);
    
    BlobsLabel = bwlabel(Blobs);    
    subplot(1,3,3), imshow(uint8(previousFrameGray)), title('Detections'), hold on;
    BBs = boundingBoxes(BlobsLabel);
    for b = 1: max(max(BlobsLabel))
        rectangle('Position', [BBs(b,1) BBs(b,2) BBs(b,3)-BBs(b,1)+1 BBs(b,4)-BBs(b,2)+1]);
    end
    hold off
end