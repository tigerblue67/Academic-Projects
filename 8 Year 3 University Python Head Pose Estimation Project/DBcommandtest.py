import mysql.connector as sql

CSC3002db = sql.connect(host="127.0.0.1",
                        user="root",
                        password="jacobblue",
                        database="csc3002")

CSCcursor = CSC3002db.cursor()

CSCcursor.execute("SELECT * FROM imageclass")

for x in CSCcursor:
    print(x)