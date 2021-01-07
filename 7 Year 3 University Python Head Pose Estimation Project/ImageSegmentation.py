import numpy as np


#takes in 2d image array and list of the number of height blocks and number of width blocks ie 3,3 for a 3x3 block image
def imageblocking(imageIn, blockNums):
    imSize = imageIn.shape
    blockHeight = int(imSize[0]/blockNums[0])
    blockWidth = int(imSize[1]/blockNums[1])
    currentImage = np.ones([1, blockHeight, blockWidth])
    counter = 0
    for i in range(blockNums[0]):
        for j in range(blockNums[1]):
            for y in range(blockHeight):
                for x in range(blockWidth):
                    currentImage[0, y, x] = imageIn[y+(blockHeight*i), x+(blockWidth*j)]

            if counter == 0:
                imageOut = np.array(currentImage)
            else:
                imageOut = np.append(imageOut, currentImage, axis=0)
            counter += 1
    return imageOut


