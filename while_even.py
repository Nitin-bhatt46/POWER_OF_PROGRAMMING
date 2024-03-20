a = 1
n = int(input("Enter the number till you need even numbers: "))
while n > a:
    if a % 2 == 0:
        print(a)
    a += 1  # Increment a by 1
