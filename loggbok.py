import time
import datetime
import os

date = datetime.datetime.now()
def newFile():
    new_file = input("Create a new file or use a file that already excist\nFile: ") + ".txt"
    file_title = input("Title for you file: ").upper()
    file_text = input("Add what you want to your file: ")
    my_file = open(new_file, 'a')
    my_file.write("\n" + file_title + "\n" + file_text + "\n" + str(date))

def removeFile():
    remove_file = input("Which file would you like to remove?\nTitle: ") + ".txt"
    if remove_file.endswith(".txt"):
        os.remove(remove_file)
    else:
        print("Can't remove that file")


def printallLogs():
    read_all_files = ""
    if read_all_files.endswith(".txt"):
        my_file = open(read_all_files, 'r')
        print(my_file.read())

def searchForLogg():
    read_file = input("What file would you like to search for?\nFile:: ") + ".txt"
    if read_file.endswith(".txt"):
        my_file = open(read_file, 'r')
        print(my_file.read())
    else:
        print("You dont have any file with that name")


print("Welcome to your virtual filebook")
isRunning = True
while isRunning:
    try:
        user_input = input("[1] Create a file\n[2] Search for a file that already excist\n[3] Print all saved files\n[4] Remove a saved file\n[5] Close your filebook\nOption:: ")
        if user_input == "1":
            newFile()
        elif user_input == "2":
            searchForLogg()
        elif user_input == "3":
            printallLogs()
        elif user_input == "4":
            removeFile()
        elif user_input == "5":
            print("Closing filebook have a nice day!")
            isRunning = False
    except Exception:
        print("Invalid input")