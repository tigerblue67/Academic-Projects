function [Recall, Precision, Specificity, F_Measure, FalseAlarmRate] = displayEvaluationMetrics(TP, FP, TN, FN)
Recall = TP / (TP+FN)
Precision = TP / (TP+FP)
Specificity = TN / (TN+FP)
F_Measure = 2*(Precision*Recall) / (Precision + Recall)
FalseAlarmRate = FP/(FP+TN)
end