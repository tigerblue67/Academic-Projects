import cv2
import sys
import fnmatch
import numpy as np
import os
import re

def path_Reading():
    directories = os.listdir('ExtendedYaleB')
    filePath = []
    for i in range(len(directories)):
        subDirectory = 'ExtendedYaleB/' + directories[i]
        if os.path.isdir(subDirectory):
            filelist = os.listdir(subDirectory)
            for j in range(len(filelist)):
                fp = subDirectory + "/" + filelist[j]
                filePath = np.append(filePath, fp)
    return filePath

def faceCrop(fileList):
    numFiles = fileList.shape
    fileExt = "*.pgm"
    width = 24
    height = 32
    dim = (width, height)
    for i in range(numFiles[0]):
        if fnmatch.fnmatch(fileList[i], fileExt):
            currentPath = fileList[i]
            currentIm = cv2.imread(currentPath)
            faceCascade = cv2.CascadeClassifier()
            faceCascade.load("OpenCV_haarcascades/haarcascade_frontalface_default.xml")
            # below needs to be single scale
            faces = faceCascade.detectMultiScale(
                currentIm,
                scaleFactor=1.2,
                minNeighbors=3,
                minSize=(170, 220)
            )
            for (x, y, w, h) in faces:
                faceImOut = currentIm[y:y+h, x:x+w]
                faceImOut = cv2.resize(faceImOut, dim, interpolation=cv2.INTER_AREA)
                pose = int(re.search('yaleB\d{2}_P0(.)A', currentPath).group(1))
                faceOutPath = 'YalePoseCrops/'+currentPath[22:len(currentPath)-4]+'x=' + str(x) + 'y=' + str(y) + '.jpg'
                #print(faceOutPath)
                if not cv2.imwrite(faceOutPath, faceImOut):
                    raise Exception("could not write image")
                pose = pose + 10
                flipFaceImOut = cv2.flip(faceImOut, 1)
                flipFaceOutPath = 'YalePoseCrops/' + currentPath[22:31] + str(pose) + currentPath[33:len(currentPath) - 4] + 'x=' + str(x) + 'y=' + str(y) + '.jpg'
                #print(flipFaceOutPath)
                if not cv2.imwrite(flipFaceOutPath, flipFaceImOut):
                    raise Exception("could not write image")




def singleFaceDetector(filePath):
    width = 24
    height = 32
    dim = (width, height)
    currentIm = cv2.imread(filePath)
    faceCascade = cv2.CascadeClassifier()
    faceCascade.load("OpenCV_haarcascades/haarcascade_frontalface_default.xml")
    faces = faceCascade.detectMultiScale(
        currentIm,
        scaleFactor=1.2,
        minNeighbors=3,
        minSize=(70, 100)
    )
    for (x, y, w, h) in faces:
        faceImOut = currentIm[y:y + h, x:x + w]
        faceImOut = cv2.resize(faceImOut, dim, interpolation=cv2.INTER_AREA)
        faceOutPath = 'static/images/UserUploads/cropFace.jpg'
        if not cv2.imwrite(faceOutPath, faceImOut):
            raise Exception("could not write image")


#FilePathList = path_Reading()
#faceCrop(FilePathList)
