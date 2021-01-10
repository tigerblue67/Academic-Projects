function [bkg] = bkgGenerator(videoStream,samplingRate)
% Task 3: generate a background from 4d video stream and sampling rate
buffer=[];
counter=0;
for i = 1:samplingRate:size(videoStream,4)
    counter=counter+1;
    buffer(:,:,counter) = rgb2gray(videoStream(:,:,:, i));
end
bkg = median(buffer, 3);
end

