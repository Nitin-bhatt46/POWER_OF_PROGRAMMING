
n=int(input("enter the number till you need even number."))
while(n>0):
    
    if n%3==0 or n%5==0:
        n-=1
        continue
    print(n)
    n-=1
