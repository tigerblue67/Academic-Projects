function Objects = simpleNMS(Objects,threshold)
for i=1:size(Objects, 1)
    for j=1:size(Objects, 1)
        if(i==j), continue; end
        intersection_area = rectint(Objects(i,:), Objects(j,:));
        bounding_box_area = prod(Objects(i, 3:4));
        if(intersection_area/bounding_box_area > threshold)
            if (Objects(i, 5) > Objects(j, 5))
                Objects(j, :) = 0;
            else
                Objects(i, :) = 0;
            end
        end
    end  
end
counter = 1;
for i=1:size(Objects, 1)
    if (sum(Objects(i,:)) > 0)
        nonZeroIndices(counter) = i;
        counter= counter + 1;
    end
end
Objects = Objects(nonZeroIndices, :);
end

