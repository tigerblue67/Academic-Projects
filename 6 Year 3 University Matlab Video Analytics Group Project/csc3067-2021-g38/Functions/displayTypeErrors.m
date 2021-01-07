function [TP, FP, TN, FN] = displayTypeErrors(predictions,labels)
TP = 0; FP = 0; TN = 0; FN = 0;

for i=1:length(predictions)
    if (predictions(i) == labels(i) && labels(i) == 1), TP = TP + 1; end 
    if (predictions(i) == labels(i) && labels(i) == -1), TN = TN + 1; end
    if (predictions(i) ~= labels(i) && labels(i) == 1), FN = FN + 1; end
    if (predictions(i) ~= labels(i) && labels(i) == -1), FP = FP + 1; end
end

disp('Type I and II errors: ')
TP, FP, TN, FN
end

