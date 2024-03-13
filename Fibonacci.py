n = int(input("enter the number to het fibonacci series = "))
c1 = 0
c2 = 1
c3 = 0
print(c1)
print(c2)
for i in range(1,n+1):
    c3 = c1+c2
    print(c3)
    c1 = c2
    c2 = c3
