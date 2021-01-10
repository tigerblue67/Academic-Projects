close all;
clear all;

% Task 1 Gaussian Mixture Models (GMM)
videoObj = VideoReader('viptraffic.avi');
frames = read(videoObj);

height = videoObj.Height;
width = videoObj.Width;
GMM = InitialiseGMM(height, width);

morphMask = ones(9);
for i = 1:videoObj.NumFrames
    currentFrame = double(frames(:,:,:,i));
    % GrayScale approximation for speeeeed
    currentFrameGray = currentFrame(:,:,1)/3 + currentFrame(:,:,2)/3 + currentFrame(:,:,3)/3;
    
    [Foreground, Background, GMM] = RunGMM(currentFrameGray,GMM);
    
    figure(1),subplot(2,3,1),imshow(uint8(currentFrameGray)), title(['Frame: ',num2str(i)])
    subplot(2,3,2),imshow(uint8(Background)), title('Background')
    subplot(2,3,3),imshow(uint8(Foreground)), title('Foreground') 
    
    Blobs = Foreground > 0;
    subplot(2,3,4), imagesc(Blobs), title('Blobs'), colormap(gray);
    
    Blobs = imclose(Blobs, morphMask);
    Blobs = imopen(Blobs, morphMask);
    subplot(2,3,5), imshow(Blobs), title('Post-processed Blobs'), colormap(gray);
    
    BlobsLabel = bwlabel(Blobs);
    %subplot(2,3,6), imshow(BlobsLabel), title('Labelling')
    
    
    subplot(2,3,6), imagesc(currentFrameGray), title('Detections'), hold on;
    BBs = boundingBoxes(BlobsLabel);
    for b = 1: max(max(BlobsLabel))
        rectangle('Position', [BBs(b,1) BBs(b,2) BBs(b,3)-BBs(b,1)+1 BBs(b,4)-BBs(b,2)+1]);
    end
    hold off
    
    pause(0.01);
end

    

    
