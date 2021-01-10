import numpy as np
import netpbmfile as pgmage
from scipy.fftpack import dct
from scipy.fftpack import idct
from ImageSegmentationV2 import imageblocking
from matplotlib.image import imread
import matplotlib.pyplot as plot

def dctII(arr):
    return dct(dct(arr, axis=0), axis=1)
def iDCT(arr):
    return  idct(idct(arr, axis=0))


#Takes in 3d array of mxn blocks and converts each block to DCT
def DCTCreateArr(segment, image):
    imSize = image.shape
    numOBlocks = segment.shape
    blockNums = numOBlocks[1]
    xBlocks = int(imSize[1] / blockNums)
    yBlocks = int(imSize[0] / blockNums)
    arrDCT = np.zeros(segment.shape)
    fullDCT = np.zeros(imSize)
    for i in range(numOBlocks[0]):
        arrDCT[i, :, :] = dctII(segment[i, :, :])

    #uncomment to show full DCT image
    # print(arrDCT.shape)
    # for i in range(yBlocks):
    #     for j in range(xBlocks):
    #         for y in range(blockNums):
    #             for x in range(blockNums):
    #                 posy = int(y + (blockNums * i))
    #                 posx = int(x + (blockNums * j))
    #                 fullDCT[posy, posx] = arrDCT[i + j, y, x]
    # plot.imshow(fullDCT, cmap='gray', vmax=np.max(fullDCT)*0.005, vmin=0)  # , vmin=0, vmax=255)
    # plot.show()

    return arrDCT


def ZigZag(DCTBlock):
    DCTSize = DCTBlock.shape
    length = DCTSize[0]*DCTSize[1]
    Vector = np.zeros(length)
    x = 0
    y = 0
    diagonal = False
    adiagonal = False
    while (x+1)*(y+1) < length:
        while adiagonal:
            Vector[x + y] = DCTBlock[y, x]
            x -= 1
            y += 1
            if x == 0 or y == DCTSize[0]-1:
                    adiagonal = False
        while diagonal:
            Vector[x + y] = DCTBlock[y, x]
            y -= 1
            x += 1
            if y == 0 or x == DCTSize[1] - 1:
                diagonal = False
        if x == DCTSize[1]-1:
            Vector[x + y] = DCTBlock[y, x]
            y += 1
            adiagonal = True
        if y == DCTSize[0]-1:
            Vector[x + y] = DCTBlock[y, x]
            x += 1
            diagonal = True
        if x == 0:
            Vector[x+y] = DCTBlock[y, x]
            y += 1
            diagonal = True
        if y == 0:
            Vector[x + y] = DCTBlock[y, x]
            x += 1
            adiagonal = True


    return Vector


#can trim less significant bits
def trimVector(DCTVector, num):
    length = DCTVector.shape[0]
    outArr = np.zeros([length, num])
    for i in range(length):
        outArr[i, :] = DCTVector[i, 0:num]
    return outArr


def DCTImage(image, trim=-1):
    segment = imageblocking(image, 8)
    DCTArr = DCTCreateArr(segment, image)
    numBlocks = DCTArr.shape[0]
    DCTVector = np.zeros([numBlocks, 64])
    for i in range(DCTArr.shape[0]):
        DCTVector[i, :] = ZigZag(DCTArr[i, :, :])
    if trim > 0:
        DCTVector = trimVector(DCTVector, trim)
    return DCTVector

