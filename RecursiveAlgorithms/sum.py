# Precondition: int l < int r
def sumRange(l,r):
    if(r == l):
        return l
    return r + sumRange(l, r -1)
x = int(input("Enter a value x "))
y = int(input("Enter a value y so that y > x "))
print(str(sumRange(x,y)))