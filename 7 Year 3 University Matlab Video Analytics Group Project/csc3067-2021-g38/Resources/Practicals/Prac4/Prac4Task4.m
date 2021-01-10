close all;
clear all;

% Task 4: Template Matching

letters = imread('letters.jpg');
k = imread('k.jpg');

BB = templateMatching(letters, k);

subplot(3,3,1), imshow(letters), title('Image');
subplot(3,3,2), imshow(k), title('Template')

subplot(3,3,3), imshow(letters), title('Matched'), hold on;
rectangle('Position', BB, 'EdgeColor', 'r'), hold off;

s = imread('s.jpg');

BB = templateMatching(letters, s);

subplot(3,3,4), imshow(letters), title('Image');
subplot(3,3,5), imshow(s), title('Template')

subplot(3,3,6), imshow(letters), title('Matched'), hold on;
rectangle('Position', BB, 'EdgeColor', 'r'), hold off;

im1 = imread('image1.jpg');
im2 = imread('image2.JPG');

BB = templateMatching(im1, im2);

subplot(3,3,7), imshow(im1), title('Image');
subplot(3,3,8), imshow(im2), title('Template')
subplot(3,3,9), imshow(im1), title('Matched'), hold on;
rectangle('Position', BB, 'EdgeColor', 'r'), hold off;