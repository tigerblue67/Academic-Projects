import os
import random
import numpy as np

fileList = os.listdir('YalePoseCrops')
numFiles = len(fileList)
testSplit = int(numFiles*0.005)
randInts = []
testFiles = []
for i in range(testSplit):
    randNum = random.randint(0, numFiles)
    if randNum not in randInts:
        randInts.append(randNum)
        testFiles.append(fileList[randNum])
trainFiles = [i for i in fileList if i not in testFiles]

with open('train_dataset_filenames.txt', 'w') as file:
    file.writelines("%s\n" % name for name in trainFiles)

with open('test_dataset_filenames.txt', 'w') as filetest:
    filetest.writelines("%s\n" % nametest for nametest in testFiles)
