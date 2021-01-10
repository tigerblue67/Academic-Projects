import numpy as np

def rgb2gray(image):
    size = image.shape
    if size[2] == 3:
        imout = np.zeros([size[0], size[1]])
        imout[:, :] = image[:, :, 1]
        return imout
    else:
        print("wrong image format")
        return image