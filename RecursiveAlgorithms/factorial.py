# -1 is returned if recursiveNum recieves a negative integer for the parameter
def recursiveNum(start):
    if(start == 0):
        return 1
    elif(start < 0):
        return -1
    return start * recursiveNum(start-1)

val = int(input("Enter the value you would like to get the factorial of  "))
print ("The factorial of " + str(val) + " is " + str(recursiveNum(val)))