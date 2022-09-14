import sys
import os

width = 17  # python will always automatically detect the type
height = 12.0

one = width // 2
two = width / 2.0
three = int(height / 3)
four = 1 + 2 * 5

hours = input("hours ")
rate = input("rate ")

income = int(hours) * float(rate)

print(hours + " hours")
print(float(income), " last week")

