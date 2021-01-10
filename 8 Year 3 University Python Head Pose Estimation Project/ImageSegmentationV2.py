import numpy as np

#todo add padding to image for non exact matches od division

#takes in 2d image array and list of the number of height blocks and number of width blocks ie 3,3 for a 3x3 block image
def imageblocking(imageIn, blockNums):
    imSize = imageIn.shape
    currentImage = np.ones([1, blockNums, blockNums])
    counter = 0
    for i in range(int(imSize[0]/blockNums)):
        for j in range(int(imSize[1]/blockNums)):
            for y in range(blockNums):
                for x in range(blockNums):
                    currentImage[0, y, x] = imageIn[y+(blockNums*i), x+(blockNums*j)]
            if counter == 0:
                imageOut = np.array(currentImage)
            else:
                imageOut = np.append(imageOut, currentImage, axis=0)
            counter += 1
    return imageOut

