import re

forward = re.compile(r"forward")
up = re.compile(r"up")
down = re.compile(r"down")

forwardValue = 0
verticalValue = 0
aim = 0

file = open("C:/Users/erins/Documents/GitHub/2021-advent-of-code/Day2/inputDay2.txt", "r")

for line in file:
    res = [int(i) for i in line.split() if i.isdigit()]
    value = res[0]
    if forward.search(line):
        forwardValue += value
        verticalValue += aim * value
    elif up.search(line):
        aim -= value
    elif down.search(line):
        aim += value

        
result = forwardValue * verticalValue
print(str(result))