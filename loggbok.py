import time
import datetime
from bok import bok
import os

datum = datetime.datetime.now()
loggtitel = ""
loggtext = ""
my_list = []
def logg():
    nyfil = input("Skapa ny fil eller använd en existerande fil för spara din logg\nAvsluta filnamnet med .txt\nFil: ")
    if nyfil.endswith(".txt"):
        loggtitel = input("Titel till din logg: ").upper()
        loggtext = input("Implementera vad du vill i din logg: ")
        my_list.append(loggtitel + " " + loggtext + " " + str(datum))
        myfile = open(nyfil, 'a')
        myfile.write("\n" + loggtitel + "\n" + loggtext + "\n" + str(datum))
        print(my_list.count(loggtitel))
    else:
        print("Avsluta filnamnet med .txt")

def taBort():
    tabortfil = input("Vilken logg vill du ta bort?\nTitel: ")
    if tabortfil.endswith(".txt"):
        os.remove(tabortfil)
    else:
        print("Kan inte ta bort den filen!")


def printallLogs():
    #lasfil = input("Vilken fil vill du läsa?\nFil:: ")
    #if:
     #   myfile = open(lasfil, 'r')
      #  print(myfile.read())

def searchForLogg():
    lasfil = input("Vilken fil vill du läsa?\nFil:: ")
    if lasfil.endswith(".txt"):
        myfile = open(lasfil, 'r')
        print(myfile.read())
     else:
        print("Du har ingen fil sparad vid det namnet eller avsluta inte med .txt")

def welcomeLogg():
    print("Välkommen till din virtuella loggbok")
    isRunning = True
    while isRunning:
        sok = input("[1] Skapa en logg\n[2] Sök bland existerande loggar\n[3] Printa alla sparade loggar\n[4] Ta bort en sparad logg\n[5] Stäng loggboken\nOption:: ")
        if sok == "1":
            logg()
        elif sok == "2":
            searchForLogg()
        elif sok == "3":
            printallLogs()
        elif sok == "4":
            taBort()
        elif sok == "5":
            print("Stänger loggboken ha de gött")
            isRunning = False
welcomeLogg()