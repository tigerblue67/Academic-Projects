function [] = addingOneWithFors(inputArray)
[rows, columns] = size(inputArray);

for i=1:rows
    for j=1:columns
        inputArray(i,j) = inputArray(i,j) + 1;
    end
end
end
