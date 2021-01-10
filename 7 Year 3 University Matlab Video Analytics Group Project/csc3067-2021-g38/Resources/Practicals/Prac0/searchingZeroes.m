function [outputNumOfZeroes] = searchingZeroes(inputArray)
[rows, columns] = size(inputArray);
count = 0;

for i=1:rows
    for j=1:columns
        if inputArray(i,j)==0
            count = count+1;
        end
    end
end
outputNumOfZeroes=count;
end

