import mysql.connector as sql


mydb = sql.connect(host="127.0.0.1",
                   user="root",
                   password="jacobblue",
                   database="test"
                   )

print(mydb)

mycursor = mydb.cursor()

#mycursor.execute("Create DATABASE test")

mycursor.execute("SHOW DATABASES")

for x in mycursor:
    print(x)
mycursor.execute("CREATE TABLE customers (name VARCHAR(255), address VARCHAR(255))")
mycursor.execute("SHOW TABLES")

for x in mycursor:
    print(x)
