import fnmatch
import os

from DBPopulate import populate
from SQLDBcreate import DBcreate


#The below function will search through all the images in the dataset folders then call the DBcreate and DBpopulate


def importDBFiles():
    #Below command will create a list of all directories in the ExtYaleBCrops directory
    listDirectoriesOnly = os.listdir('ExtYaleBCrops')
    print(listDirectoriesOnly)
    #below variable needs to be adjusted for the fnmatch to not include ambient pgm files
    fileExt = "*.pgm"
    fileNames = []
    DBcreate()
    #This for loop will iterate through each subdirectory
    for i in range(len(listDirectoriesOnly)):
        subDirectory = 'ExtYaleBCrops/' + listDirectoriesOnly[i] # gives the subdirectory for each folder e.g. ExtYaleBcrops/yaleB29
        if os.path.isdir(subDirectory):
            filelist = os.listdir(subDirectory)
            print("fileList is:")
            print(filelist)
            #iterates through each file in each subdirectory
            for name in filelist:
                #ensures each file is a pgm file
                if fnmatch.fnmatch(name, fileExt):
                    filePath = subDirectory+'/'+name
                    print(filePath)
                    fileNames.append(filePath)

    populate(fileNames)


importDBFiles()