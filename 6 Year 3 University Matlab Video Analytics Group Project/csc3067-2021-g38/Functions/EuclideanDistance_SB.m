function dEuc = EuclideanDistance_SB(sample1, sample2)

temp = zeros(1,2);
tempDist = 0;

for i=1:size(sample2.neighbours,1)
    for j=1:size(sample2.neighbours,2)
        tempDist = tempDist + abs(sample1(j) - sample2.neighbours(i,j)); %adds together all the distances squared
    end
    temp(i,1) = tempDist;
    temp(i,2) = sample2.labels(i);
    tempDist = 0;
end

dEuc = temp;

end

