import mysql.connector as sql


def tableCreate():
    CSC3002db = sql.connect(host="127.0.0.1",
                            user="root",
                            password="jacobblue",
                            database="csc3002")

    CSCcursor = CSC3002db.cursor()

    CSCcursor.execute("SHOW TABLES")
    tableExists = False
    for x in CSCcursor:
        if "imageclass" in str(x):
            tableExists = True

    if tableExists:
        CSC3002db.close()
        return
    else:
        CSCcursor.execute("CREATE TABLE `imageclass` (`FilePath` VARCHAR(1000) NOT NULL, `Subject` INT(2) NOT NULL, "
                          "`Pose` INT(2) NOT NULL, `Azimuth` INT(3) NOT NULL, `Elevation` INT(3) NOT NULL);")
        CSC3002db.close()
        return


def DBcreate():
    mydb = sql.connect(host="127.0.0.1",
                       user="root",
                       password="jacobblue")
    print(mydb)
    mycursor = mydb.cursor()

    mycursor.execute("SHOW DATABASES")
    DBexists = False
    for x in mycursor:
        if "csc3002" in str(x):
            DBexists = True

    if DBexists:
        tableCreate()
    else:
        mycursor.execute("Create DATABASE csc3002")
        tableCreate()
    mydb.close()
    return

