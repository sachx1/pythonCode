import sys

# Compare two arrays and see if it has the same contents irrespective of order
animals = ['birds', 'cat', 'dog']
animals2 = ['cat', 'dog', 'birds', 'snake']

animals.sort()
animals2.sort()

animalSize = len(animals)
animalSize2 = len(animals2)

if animalSize == animalSize2:
    if (animals == animals2):
        print("true")
    else: 
        print("false")
else: 
    print("not the same size")

    