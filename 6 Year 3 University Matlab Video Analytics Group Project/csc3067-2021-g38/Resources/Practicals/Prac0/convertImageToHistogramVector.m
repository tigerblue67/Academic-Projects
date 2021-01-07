function [vectorHist] = convertImageToHistogramVector(inputImage)
imageHist=histogram(inputImage, 'BinLimits', [0,256], 'BinWidth', 1);
vectorHist=imageHist.Values;
end

