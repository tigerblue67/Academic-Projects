import numpy as np
import time
from collections import Counter
from matplotlib.image import imread
from rgb2gray import rgb2gray
from DCTapp import DCTImage
import re
    

class image_Label:
    def __init__(self, images, labels):
        self.images = images
        self.labels = labels


class eucDist:
    def __init__(self, distance, pose):
        self.distance = distance
        self.pose = pose


class classification:
    def __init__(self, prediction, confidence):
        self.prediction = prediction
        self.confidence = confidence


def EuclideanDistance(imagein, imageTest):
    #input images should be a vector of the same size
    eucDist = 0.0
    for i in range(len(imagein)-1):
        eucDist = eucDist + abs(imagein[i] - imageTest[i])

    return eucDist


def KNNmodelTraining(Sampling):
    trainText = open('train_dataset_filenames.txt', 'r')
    trainFiles = trainText.readlines()
    KNNmodel = []
    for file in trainFiles[0:len(trainFiles)-1:Sampling]:
        pose = re.search('yaleB\d{2}_P(..)A', file).group(1)
        currentImage = imread('YalePoseCrops/'+file[0:len(file)-1])
        currentImage = rgb2gray(currentImage)
        currentImage = currentImage.reshape(-1)
        couple = image_Label(currentImage, pose)
        KNNmodel.append(couple)

    return KNNmodel


#This class should be supplied with all their testing ims in vector and corresponding pose to index values
def classification_confidence(imageIn, trainingIms, K):
    trainSize = len(trainingIms)
    classificationConf = 0.0
    distanceIm = []
    poseCount = []
    for i in range(trainSize-1):
        print(imageIn.shape)
        print(trainingIms[i].images.shape)
        currentDist = EuclideanDistance(imageIn, trainingIms[i].images)
        current = eucDist(currentDist, trainingIms[i].labels)
        distanceIm.append(current)
    distanceIm = sorted(distanceIm, key=lambda eucDist: eucDist.distance)
    lowestK = distanceIm[0:K-1]
    for i in range(K - 1):
        poseCount.append(distanceIm[i].pose)
    count = Counter(poseCount)
    prediction = next(iter(count))
    numPrediction = 0
    print("prediction")
    print(prediction)
    for i in range(K - 1):
        if lowestK[i] == prediction:
            numPrediction += 1
            classificationConf += lowestK[i].distance
    classificationConf = classificationConf*(numPrediction/K)
    return classification(prediction, classificationConf)


def KNNmodelTesting(KValue, Sampling):
    testText = open('test_dataset_filenames.txt', 'r')
    testFiles = testText.readlines()
    testImages = []
    Results = []
    accuracy = 0
    for file in testFiles:
        pose = re.search('yaleB\d{2}_P(..)A', file).group(1)
        currentImage = imread('YalePoseCrops/' + file[0:len(file) - 1])
        currentImage = rgb2gray(currentImage)
        currentImage = currentImage.reshape(-1)
        couple = image_Label(currentImage, pose)
        testImages.append(couple)
    KNNmodel = KNNmodelTraining(Sampling)
    start = time.time()
    for i in range(len(testImages)-1):
        Results.append(classification_confidence(testImages[i].images, KNNmodel, KValue))
        if Results[i].prediction == testImages[i].labels:
            print("correct")
            accuracy += 1
        else:
            print("incorrect")
            print("ans=" + str(testImages[i].labels))
    accuracy = accuracy/len(testFiles)
    end = time.time()
    timing = end-start
    return accuracy, timing

def KNNTest1image(imageFP, KValue, Sampling):
    KNNmodel = KNNmodelTraining(Sampling)
    image = imread(imageFP)
    image = rgb2gray(image)
    image = image.reshape(-1)
    result = classification_confidence(image, KNNmodel, KValue)
    return result.prediction


# string = 'YalePoseCrops/yaleB39_P07A-020E-10x=220y=58.jpg'
# print(KNNTest1image(string))

# start = time.time()
# print(KNNmodelTesting())
# end = time.time()
# print("time taken:", end-start)
#---------------- With DCT Code below ---------------------


def EuclideanDistanceW_DCT(imagein, imageTest):
    #input images should be a vector of the same size
    eucDist = 0.0
    size = imagein.shape
    for i in range(len(imagein)):
        eucDist = eucDist + abs(imagein[i] - imageTest[i])

    return eucDist


#This class should be supplied with all their testing ims in vector and corresponding pose to index values
def classification_confidenceW_DCT(imageIn, trainingIms, K):
    trainSize = len(trainingIms)
    imSize = imageIn.shape
    classificationConf = 0.0
    distanceIm = []
    poseCount = []
    for i in range(trainSize-1):
        currentDist = 0
        for j in range(imSize[0]):
            currentDist = currentDist + EuclideanDistanceW_DCT(imageIn[j, :], trainingIms[i].images[j, :])
        current = eucDist(currentDist, trainingIms[i].labels)
        distanceIm.append(current)
    distanceIm = sorted(distanceIm, key=lambda eucDist: eucDist.distance)
    lowestK = distanceIm[0:K-1]
    for i in range(K - 1):
        poseCount.append(distanceIm[i].pose)
    count = Counter(poseCount)
    prediction = next(iter(count))
    numPrediction = 0
    #print("prediction")
    #print(prediction)
    for i in range(K - 1):
        if lowestK[i] == prediction:
            numPrediction += 1
            classificationConf += lowestK[i].distance
    classificationConf = classificationConf*(numPrediction/K)
    return classification(prediction, classificationConf)


def KNNmodelTrainingW_DCT(sampling):
    trainText = open('train_dataset_filenames.txt', 'r')
    trainFiles = trainText.readlines()
    KNNmodel = []
    for file in trainFiles[0:len(trainFiles)-1:sampling]:
        pose = re.search('yaleB\d{2}_P(..)A', file).group(1)
        currentImage = imread('YalePoseCrops/'+file[0:len(file)-1])
        currentImage = rgb2gray(currentImage)
        currentImage = DCTImage(currentImage)
        couple = image_Label(currentImage, pose)
        KNNmodel.append(couple)

    return KNNmodel


def KNNmodelTestingW_DCT(DCTTrim, KValue, Sampling):
    testText = open('test_dataset_filenames.txt', 'r')
    testFiles = testText.readlines()
    testImages = []
    Results = []
    accuracy = 0
    for file in testFiles:
        pose = re.search('yaleB\d{2}_P(..)A', file).group(1)
        currentImage = imread('YalePoseCrops/' + file[0:len(file) - 1])
        currentImage = rgb2gray(currentImage)
        currentImage = DCTImage(currentImage, DCTTrim)
        couple = image_Label(currentImage, pose)
        testImages.append(couple)
    KNNmodel = KNNmodelTrainingW_DCT(Sampling)
    start = time.time()
    for i in range(len(testImages)-1):
        Results.append(classification_confidenceW_DCT(testImages[i].images, KNNmodel, KValue))
        if Results[i].prediction == testImages[i].labels:
            #print("correct")
            accuracy += 1
        #else:
            #print("incorrect")
            #print("ans=" + str(testImages[i].labels))
    end = time.time()
    timing = end-start
    accuracy = accuracy/len(testFiles)

    return accuracy, timing

def KNNTest1imageW_DCT(imageFP, DCTTrim, KValue, Sampling):
    KNNmodel = KNNmodelTrainingW_DCT(Sampling)
    image = imread(imageFP)
    image = rgb2gray(image)
    image = DCTImage(image, DCTTrim)
    result = classification_confidenceW_DCT(image, KNNmodel, KValue)
    return result.prediction


#print(KNNmodelTestingW_DCT(8, 10, 1))
