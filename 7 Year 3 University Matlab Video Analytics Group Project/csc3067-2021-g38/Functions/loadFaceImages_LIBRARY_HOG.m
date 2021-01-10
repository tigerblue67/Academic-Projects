function [images, labels] = loadFaceImages_LIBRARY_HOG(filename,sampling)

if nargin<2
    sampling =1;
end

% this is a flag that allow you to activate/deactivate the data augmentation
% Data augmentation will increase the size of the dataset by created variations 
%(mirroring, flipping, displacements) of each given image. This aims to produce more
% training images and, therefore, improve performance
augmented=1;


fp = fopen(filename, 'rb');
assert(fp ~= -1, ['Could not open ', filename, '']);


line1=fgetl(fp);
line2=fgetl(fp);

numberOfImages = fscanf(fp,'%d',1);

images=[];
labels =[];
for im=1:sampling:numberOfImages
    
    label = fscanf(fp,'%d',1);
    
    labels= [labels; label];
    
    imfile = fscanf(fp,'%s',1);
    %Add in prefix for navigating from Base Folder
    prefix = './Resources/Provided/';
    imfile = strcat(prefix,imfile);
    I=imread(imfile);
    if size(I,3)>1
        I=rgb2gray(I);
   end
    % For HOG, requires computer vision toolbox
    vector = extractHOGFeatures(I);
    images= [images; vector];
    
    if augmented
        
        if label==1
            Itemp =fliplr(I);
            vector = extractHOGFeatures(I);
            images= [images; vector];
            labels= [labels; label];
            
            Itemp =circshift(I,1);
            vector = extractHOGFeatures(I);
            images= [images; vector];
            labels= [labels; label];
            
            Itemp =circshift(I,-1);
            vector = extractHOGFeatures(I);
            images= [images; vector];
            labels= [labels; label];
            
            Itemp =circshift(I,[0 1]);
            vector = extractHOGFeatures(I); 
            images= [images; vector];
            labels= [labels; label];
            
            Itemp =circshift(I,[0 -1]);
            vector = extractHOGFeatures(I);
            images= [images; vector];
            labels= [labels; label];
            
            Itemp =circshift(fliplr(I),1);
            vector = extractHOGFeatures(I);
            images= [images; vector];
            labels= [labels; label];
            
            Itemp =circshift(fliplr(I),-1);
            vector = extractHOGFeatures(I);
            images= [images; vector];
            labels= [labels; label];
            
            Itemp =circshift(fliplr(I),[0 1]);
            vector = extractHOGFeatures(I);
            images= [images; vector];
            labels= [labels; label];
            
            Itemp =circshift(fliplr(I),[0 -1]);
            vector = extractHOGFeatures(I);
            images= [images; vector];
            labels= [labels; label];
            
        else
            Itemp =fliplr(I);
            vector = extractHOGFeatures(I);
            images= [images; vector];
            labels= [labels; label];
            
            Itemp =flipud(I);
            vector = extractHOGFeatures(I);
            images= [images; vector];
            labels= [labels; label];
            
            Itemp =flipud(fliplr(I));
            vector = extractHOGFeatures(I);
            images= [images; vector];
            labels= [labels; label];      
        end

    end
    
end

images = double(images);
fclose(fp);

end
