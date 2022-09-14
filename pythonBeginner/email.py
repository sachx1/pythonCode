import sys
import os

firstName = input("enter your first name ") #takes firstname as string
lastName = input("enter your last name ") #takes lastname as string

#this while loop checks to see if the student id is more than 3 numbers, 
#if it isnt, go back to the top, if it is break the loop and proceed
while True: 

    studentIDNumber = input("enter student id number ")
    stIDList = list(studentIDNumber) #splits string into list
    intList = [int(i) for i in stIDList] #converts string list into int list

    #checks to see if the length of the int list is less than or greater than 3
    if len(intList) < 3:
        print("invalid id, must be longer than 3 characters ")
    elif len(intList) >= 3:
        break


#this while loop checks to see if the students fav movie is more than 3 characters
#if it isnt, go back to the top, if it is break the loop and proceed
while True:

    favMovie = input("enter your fav movie ")

    #checks to see if the length of the string is less than or greater than 3
    if len(favMovie) < 3:
        print("choose a movie with a name of 3 characters or longer ")
    elif len(favMovie) >= 3:
        break

#emailID uses .join which gets individual strings and joins them together as one string
emailID = "".join([firstName, ".", lastName, "@TRSM.ca"]) 

#password uses .join which gets the first 2 letters of firstName, the last two characters of lastname and fav movie
#and joins them together
password = "".join([firstName[:2], lastName[-2:], favMovie[-2:]])

#prints final outcome
print(emailID, " and password is ", password)

