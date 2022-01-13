import re

forward = re.compile(r"forward")
up = re.compile(r"up")
down = re.compile(r"down")

forwardValue = 0
verticalValue = 0

file = open("C:/Users/erins/Documents/GitHub/2021-advent-of-code/Day2/inputDay2.txt", "r")

for line in file:
    res = [int(i) for i in line.split() if i.isdigit()]
    value = res[0]
    print(str(value))
    if forward.search(line):
        forwardValue += value
    elif up.search(line):
        verticalValue -= value
    elif down.search(line):
        verticalValue += value

        
result = forwardValue * verticalValue
print(str(result))