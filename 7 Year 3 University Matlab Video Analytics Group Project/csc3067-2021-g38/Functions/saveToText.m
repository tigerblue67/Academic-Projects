function saveToText(Title, Timing, Accuracy, TP, FP, TN, FN, RocCurveArea)
%Function for easy saving of results gathered within each dectection method

if nargin < 7
    if nargin < 3
        T = table(Title, Timing); %save in specific format format, e.g. NN testing, 3 seconds
    else
        T = table(Title, Timing, Accuracy); %save in specific format format, e.g. KNN testing, 15 seconds, 0.8
    end
else
    % Display evaluation metrics
    if isnumeric(TP) && isnumeric(FP) && isnumeric(TN) && isnumeric(FN)
        [Recall, Precision, Specificity, F_Measure, FalseAlarmRate] = displayEvaluationMetrics(TP, FP, TN, FN);
        
        if (nargin == 8) %if we have roc curve input, include in the table
        T = table(Title, Timing, Accuracy, TP, FP, TN, FN, Recall, Precision, Specificity, F_Measure, FalseAlarmRate, RocCurveArea);
        else
        T = table(Title, Timing, Accuracy, TP, FP, TN, FN, Recall, Precision, Specificity, F_Measure, FalseAlarmRate);
        %include type I and II errors and evaluation metrics to the output list if they are input
        end
    else
        Recall=" "; Precision=" "; Specificity=" "; F_Measure=" ";  FalseAlarmRate=" ";
        T = table(Title, Timing, Accuracy, TP, FP, TN, FN, Recall, Precision, Specificity, F_Measure, FalseAlarmRate, RocCurveArea);
    end
    
end

if ~isfile('timing-accuracy-store.csv') %if the file exists
    writetable(T,'timing-accuracy-store.csv') %Initalise file
else
    writetable(T,'timing-accuracy-store.csv','WriteMode','Append') %append all data to the end
    T = table(" ");
    writetable(T,'timing-accuracy-store.csv','WriteMode','Append') %append spacing to the end
end



end

