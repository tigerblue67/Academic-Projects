from flask import Flask, render_template, request, redirect
from faceCropping import singleFaceDetector
from KNNClassification import KNNTest1image, KNNmodelTestingW_DCT, KNNmodelTesting, KNNTest1imageW_DCT
from poseConvert import poseConvert
import os
import re
import cv2
import numpy as np
app = Flask(__name__)

#set FLASK_APP=HTTPServer.py

@app.route('/')
def homePage():
    return render_template('index.html')


@app.route('/training-ims')
def training():
    # directories = os.listdir('ExtYaleBCrops')
    # filePath = []
    # for i in range(len(directories)):
    #     subDirectory = 'ExtYaleBCrops/' + directories[i]
    #     if os.path.isdir(subDirectory):
    #         filelist = os.listdir(subDirectory)
    #         for j in range(len(filelist)):
    #             fp = subDirectory + "/" + filelist[j]
    #             filePath = np.append(filePath, fp)
    trainText = open('train_dataset_filenames.txt', 'r')
    trainFiles = trainText.readlines()
    for i in range(len(trainFiles)):
        trainFiles[i] = 'YalePoseCrops/' + trainFiles[i]

    return render_template('dirList.html', directory=trainFiles, name='Training Images')


@app.route('/testing-ims')
def testing():
    testText = open('test_dataset_filenames.txt', 'r')
    trainFiles = testText.readlines()
    for i in range(len(trainFiles)):
        trainFiles[i] = 'YalePoseCrops/' + trainFiles[i]

    return render_template('dirList.html', directory=trainFiles, name='Testing Images')


@app.route('/image-get', methods=["GET", "POST"])
def imageShow():
    if request.method == "POST":
        req = request.form.get('FilePath')
    else:
        print("no filepath passed")
        return render_template('index.html')
    print(req)
    posee = re.search('yaleB\d{2}_P(..)A', req).group(1)
    poseStr = poseConvert(int(posee))
    return render_template('imageView.html', filePath=req, pose=poseStr)


@app.route('/upload-ims')
def uploadView():
    return render_template('upload.html')


@app.route('/compare-image', methods=["GET", "POST"])
def compareImage():
    if request.method == "POST":
        if request.files:
            image = request.files["image"]
            image.save('static/images/UserUploads/image.jpg')
            singleFaceDetector('static/images/UserUploads/image.jpg')

            DCTTrim = int(request.form.get('DCTTrim'))
            Sampling = int(request.form.get('Sampling'))
            KValue = int(request.form.get('KValue'))
            if DCTTrim == 0:
                posee = KNNTest1image('static/images/UserUploads/cropFace.jpg', KValue, Sampling)
            elif DCTTrim == 64:
                posee = KNNTest1imageW_DCT('static/images/UserUploads/cropFace.jpg', -1, KValue, Sampling)
            else:
                posee = KNNTest1imageW_DCT('static/images/UserUploads/cropFace.jpg', DCTTrim, KValue, Sampling)
            poseStr = poseConvert(int(posee))
    print(poseStr)
    return render_template('compare-file.html', filePath='cropFace.jpg', pose=poseStr)


@app.route('/train_test')
def trainTest():
    return render_template('trainTest.html')


@app.route('/dataset_testing', methods=["GET", "POST"])
def dataset_testing():
    if request.method == "POST":
        DCTTrim = int(request.form.get('DCTTrim'))
        Sampling = int(request.form.get('Sampling'))
        KValue = int(request.form.get('KValue'))
        if DCTTrim == 0:
            accuracy, timing = KNNmodelTesting(KValue, Sampling)
        elif DCTTrim == 64:
            accuracy, timing = KNNmodelTestingW_DCT(-1, KValue, Sampling)
        else:
            accuracy, timing = KNNmodelTestingW_DCT(DCTTrim, KValue, Sampling)
        return render_template('dataset_testing.html', Accuracy=accuracy, Timing=timing)

    else:
        print("Incorrect inputs")
        return render_template('index.html')