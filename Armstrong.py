
def armstrong(fin):
    match = fin
    result = 0
    while(fin>0):
        r = fin%10
        result = result +( r*r*r)
        fin = fin//10
    if(match == result):
        print("Armstrong Number")
    else:
        print("not a Armstrong NUmber")
    
a = int (input("enter the number to find out it is armstrong or not = "))    
armstrong(a)
    
    
