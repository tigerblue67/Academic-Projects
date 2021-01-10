function Vector = DCT_Feature_Vector(image)
addpath('./Resources/DCTZigZag/zigzag');

        currentImage = imresize(image, [8 8]);
        DCTimage = dct2(currentImage);
        Vector = zigzag(DCTimage);
        


%         DCTSize = size(DCTimage);
%         x = 1;
%         y = 1;
%         minY = 1;
%         minX = 1;
%         i = 1;
%         Vector = [];
%         diagonal = false;
%         adiagonal = false;
%         while (x*y) < DCTSize(1)*DCTSize(2)
%             while adiagonal
%                 Vector(x + y) = DCTimage(y, x);
%                 x = x - 1;
%                 y = y + 1;
%                 if x == 1 || y == DCTSize(1)
%                         adiagonal = false;
%                 end
%             end
%             while diagonal
%                 Vector(x + y) = DCTimage(y, x);
%                 y = y - 1;
%                 x = x + 1;
%                 if y == 1 || x == DCTSize(2)
%                     diagonal = false;
%                 end
%             end
%             if x == DCTSize(2)
%                 Vector(x + y) = DCTimage(y, x);
%                 y = y + 1;
%                 adiagonal = true;
%             end
%             if y == DCTSize(1)
%                 Vector(x + y) = DCTimage(y, x);
%                 x = x + 1;
%                 diagonal = true;
%             end
%             if x == 1
%                 
%                 Vector(x+y) = DCTimage(y, x);
%                 y = y + 1;
%                 diagonal = true;
%             end
%             if y == 1
%                 Vector(x+y) = DCTimage(y, x);
%                 x = x + 1;
%                 adiagonal = true;
%             end
%         end


        
%         %----------------------------------
%         while ((y <= size(DCTimage, 1)) && (x <= size(DCTimage, 2)))
%             
%             if (mod(x + y, 2) == 0)                 % goDCTimageg up
%                 if (y == minY)
%                     Vector(i) = DCTimage(y, x);        % if we got to the first lDCTimagee
%                     if (x == size(DCTimage, 2))
%                         y = y + 1;
%                     else
%                         x = x + 1;
%                     end
%                     i = i + 1;
%                 elseif ((x == size(DCTimage, 2)) && (y < size(DCTimage, 1)))   % if we got to the last column
%                     Vector(i) = DCTimage(y, x);
%                     y = y + 1;
%                     i = i + 1;
%                 elseif ((y > minY) && (x < size(DCTimage, 2)))    % all other cases
%                     Vector(i) = DCTimage(y, x);
%                     y = y - 1;
%                     x = x + 1;
%                     i = i + 1;
%                 end
%                 
%             else                                    % goDCTimageg down
%                 if ((y == size(DCTimage, 1)) && (x <= size(DCTimage, 2)))       % if we got to the last lDCTimagee
%                     Vector(i) = DCTimage(y, x);
%                     x = x + 1;
%                     i = i + 1;
%                     
%                 elseif (x == minX)                   % if we got to the first column
%                     Vector(i) = DCTimage(y, x);
%                     if (y == size(DCTimage, 1))
%                         x = x + 1;
%                     else
%                         y = y + 1;
%                     end
%                     i = i + 1;
%                 elseif ((y < size(DCTimage, 1)) && (x > minX))     % all other cases
%                     Vector(i) = DCTimage(y, x);
%                     y = y + 1;
%                     x = x - 1;
%                     i = i + 1;
%                 end
%             end
%             if ((y == size(DCTimage, 1)) && (x == size(DCTimage, 2)))          % bottom right element
%                 Vector(i) = DCTimage(y, x);
%                 break
%             end
%         end