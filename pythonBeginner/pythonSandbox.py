import sys

#thisTuple = ("apple", "banana", "cherry")
#print(thisTuple)
choice = input("Choose rpg maker or regular things 1 or 2: ")
exit1 = int()

thisdict = {
    "brand": "Fineman",
    "Clothing store": "Mango Man",
    "Age": "21"
}

if choice == '1':
    print("Welcome to the life rpg")
    print("You have 4 skills, Magic, Speech, Attack, Defence")
    print("There are 32 skill points available")
    print("Races are human, elf, half-breed, mutant")
    skillPoints = 32
    pointsLeft = skillPoints

    magicPoints = int()
    speechPoints = int()
    attackPoints = int()
    defencePoints = int()

    #magicCnt = magicPoints
    #speechCnt = speechPoints
    #attackCnt = attackPoints
    #defenceCnt = defencePoints


    username = input("Enter username: ")

    while True:
        race = input("Enter your race: ")
        if race == 'human' or race == 'elf' or race == 'half-breed' or race == 'mutant':
            break
        elif race != 'human' or race != 'elf' or race != 'half-breed' or race != 'mutant':
            print("not a valid race")

    while skillPoints > 0:
        skills = input("Enter which skill you want: ")
        if skills == 'magic':
            points = int(input("how many points: "))
            pointsLeft = skillPoints - points
            skillPoints = pointsLeft 
            magicPoints += points
            print("You have ", + pointsLeft, " left")
        elif skills == 'speech':
            points = int(input("how many points: "))
            pointsLeft = skillPoints - points
            skillPoints = pointsLeft 
            speechPoints += points
            print("You have ", + pointsLeft, " left")
        elif skills == 'attack':
            points = int(input("how many points: "))
            pointsLeft = skillPoints - points 
            skillPoints = pointsLeft
            attackPoints += points
            print("You have ", + pointsLeft, " left")
        elif skills == 'defence':
            points = int(input("how many points: "))
            pointsLeft = skillPoints - points 
            skillPoints = pointsLeft
            defencePoints += points
            print("You have ", + pointsLeft, " left")
    
    print("------------------------------------------------")

    print("Your RPG Character")
    print("Username is: " + username)
    print("Your race is: " + race)
    print("Skillpoints breakdown")
    print("Magic", + magicPoints)
    print("Speech", + speechPoints)
    print("Attack", + attackPoints)
    print("Defence", + defencePoints)

#print ("Username is: " + username)

if choice == '2':
    while exit1 <= 1:
        value1 = input("enter the first value to enter in the dictionary: ")
        value2 = input("enter the second value to enter in the dictionary: ")

        thisdict[value1] = value2
        print(thisdict)

        exit1 = int(input("would you like to continue? Press 1 to continue press 2 to exit: "))



