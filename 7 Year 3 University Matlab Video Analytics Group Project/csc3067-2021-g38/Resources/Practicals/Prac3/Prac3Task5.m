close all;
clear all;

videoObj = VideoReader('shopping_center.mpg');
frames = read(videoObj);
bkgGray = bkgGenerator(frames, 10);


morphMask = ones(9);

for i = 1:get(videoObj,'NumFrames')
    % We have to convert to double or substractions under 0 will be borked
    currentFrame = double(rgb2gray(frames(:,:,:,i)));
    subplot(2,3,1), imagesc(currentFrame), title(['Frame: ',num2str(i)]);
    subplot(2,3,2), imagesc(bkgGray), title('Background');
   
    Blobs=abs(currentFrame - bkgGray) > 60;
    subplot(2,3,3), imagesc(Blobs), title('Blobs'), colormap(gray);
    
    Blobs = imclose(Blobs, morphMask);
    Blobs = imopen(Blobs, morphMask);

    subplot(2,3,4), imshow(Blobs), title('Post-processed Blobs'), colormap(gray);
    
    BlobsLabel = bwlabel(Blobs);
    subplot(2,3,5), imshow(BlobsLabel), title('Labelling')
    
    subplot(2,3,6), imagesc(currentFrame), title('Detections'), hold on
    BBs = boundingBoxes(BlobsLabel);
    for b = 1: max(max(BlobsLabel))
        rectangle('Position', [abs(BBs(b,1)) abs(BBs(b,2)) abs(BBs(b,3)-BBs(b,1)+1) abs(BBs(b,4)-BBs(b,2)+1)])
    end
    hold off
    pause(0.05);
end
