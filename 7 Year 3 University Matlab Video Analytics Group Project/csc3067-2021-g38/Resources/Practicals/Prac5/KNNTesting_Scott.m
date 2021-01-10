function prediction = KNNTesting_Scott(testImage, modelNN, K)

dEuc = EuclideanDistance(testImage, modelNN);

[~,index] = sort(dEuc(:,1));
kClosest = dEuc(index, 2);

prediction = mode(kClosest(1:K));

end