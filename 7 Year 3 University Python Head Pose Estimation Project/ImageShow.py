import netpbmfile as pgmage
import numpy as np
import matplotlib.pyplot as plot


# image = pgmage.imread('ExtYaleBCrops/yaleB01/yaleB01_P00A+000E+00.pgm')
# imageplot = plot.imshow(image, cmap='gray', vmin=0, vmax=255)
# plot.show()
filePath = "ExtYaleBCrops/yaleB01/yaleB01_P00A+000E+00.pgm"
file = open(filePath, encoding="ANSI")


def fileprocess(fileIn):
    magicNumber = fileIn.readline().strip()
    if magicNumber == 'P5':
        widthHeight = fileIn.readline().split()
        maxGray = fileIn.readline().strip()
        width = int(widthHeight[0])
        height = int(widthHeight[1])
        print(width)
        print(height)
        image = np.zeros([height, width])
        data = fileIn.read()
        datalen = len(data)
        datadecimal = []
        for i in range(datalen):
            datadecimal.append(ord(data[i]))

        print(len(datadecimal))
        counter = 0
        for i in range(height):
            for j in range(width):
                if datadecimal[counter] > 255:
                    image[i, j] = 255
                else:
                    image[i, j] = datadecimal[counter]
                counter += 1
        plot.imshow(image, cmap="gray")
        plot.show()


fileprocess(file)

