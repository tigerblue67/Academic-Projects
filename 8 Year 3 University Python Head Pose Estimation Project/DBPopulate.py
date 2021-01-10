import mysql.connector as sql


#Below function is to split each string into its different parameters from the simple filename
def splitstr(strFile):
    try:
        subject = int(strFile[19:21])
        pose = int(strFile[31:33])
        azimuth = int(strFile[34:38])
        elevation = int(strFile[39:42])
        print(subject, pose, azimuth, elevation)
        return strFile, subject, pose, azimuth, elevation

    except:
        print("Not expected format")
        return "Exception", "incorrect Format"

#Below function will
def populate(fileList):
    CSC3002db = sql.connect(host="127.0.0.1",
                            user="root",
                            password="jacobblue",
                            database="csc3002")

    CSCcursor = CSC3002db.cursor()
    for file in fileList:
        print(file)
        variables = splitstr(file)
        print(variables)
        if type(variables[1]) == int:
            sqlCommand = "INSERT into imageclass (FilePath, Subject, Pose, Azimuth, Elevation) VALUES " + str(variables)
            CSCcursor.execute(sqlCommand)
            print(sqlCommand)
        else:
            print(type(variables[1]))

    CSC3002db.commit()


# teststring = ["ExtYaleBCrops/yaleB49/yaleB49_P00A-130E+20.pgm", "ExtYaleBCrops/yaleB48/yaleB48_P00A-130E+20.pgm"]
# populate(teststring)
