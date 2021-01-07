function [AUC] = displayROCCurve(testLabels, probabilities, positiveClass, graphTitle)
[X,Y,T,AUC] = perfcurve(testLabels, probabilities, positiveClass);
figure; plot(X,Y);
xlabel('False positive rate'); 
ylabel('True positive rate');
title(graphTitle);
end

