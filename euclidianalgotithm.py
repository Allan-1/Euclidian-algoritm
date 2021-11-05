def gcd(a, b):
    '''Uses euclidian algorithm to compute the gcd of two numbers
    a and b
    '''
    if b > a:
        # swap inorder to remove zero divison error
       temp = b
       b = a
       a = temp

    while True :
        if a % b == 0:
            # checks if it is comptely divisible
            return a // b
        x = a % b
        y = b % x 
        if x == 0:
            return y    
        elif y == 0:
            return x 
        x = x % y
        y = y % x

print(gcd(18, 24))