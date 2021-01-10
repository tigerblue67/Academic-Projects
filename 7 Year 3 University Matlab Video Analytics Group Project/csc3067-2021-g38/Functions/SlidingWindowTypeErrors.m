function [TP,FP,TN,FN] = SlidingWindowTypeErrors(WindowIterations,RectArray,currentLabels)
    FaceSize=[27,18];
    disp("Multi Scale Sliding window Type 1 and 2 Errors")
    TP = 0;
    FP = 0;
    TN = 0;
    FN = 0;
    foundArr = [];
    for j =1:size(RectArray, 1)
    found = false;
    currentRect = [RectArray(j,2),RectArray(j,1),FaceSize(2),FaceSize(1)];
    for k = 1:size(currentLabels, 1)
        currentLab = [currentLabels(k,2),currentLabels(k,1),FaceSize(2),FaceSize(1)];
        if rectint(currentRect,currentLab) > 0.5
            if ~ismember(k,foundArr)
                TP = TP + 1;
                found = true;
                foundArr = [foundArr k];
                break;
            end
        end
    end
    if found == false
        FP = FP + 1;
    end
    end
    for k = 1:size(currentLabels, 1)
        found = false;
        currentLab = [currentLabels(k,2),currentLabels(k,1),FaceSize(2),FaceSize(1)];
        for j =1:size(RectArray, 1)
            currentRect = [RectArray(j,2),RectArray(j,1),FaceSize(2),FaceSize(1)];
            if rectint(currentRect,currentLab) > 0.5
                found = true;
                
            end
        end
        if found == false
            FN = FN + 1;
        end
    end
    
    TP
    FP
    FN
    TN = WindowIterations - (size(currentLabels, 1) + FP)
    
end

