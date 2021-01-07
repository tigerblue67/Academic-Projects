close all;
clear all;

% Task 1: Reading video files
file_name_traffic = 'viptraffic.avi';
videoObjTraffic = VideoReader(file_name_traffic);

%deprecated method but only returns info structure so quicker
%file_info = aviinfo(file_name_traffic);

file_name_shop = 'shopping_center.mpg';
videoObjShop = VideoReader(file_name_shop);

vidTrafficFrames = read(videoObjTraffic);
% Running size(videoObj) will get you [x pixels, y pixels, rgb channels, frames]

% Play video with MatLab internal player
%implay(vidTrafficFrames);

% Display montage of images
% montage(vidTrafficFrames);

% Extract the first frame
frame = vidTrafficFrames(:,:,:,1);
imshow(frame)






