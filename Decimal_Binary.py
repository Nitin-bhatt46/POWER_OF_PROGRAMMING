ans = 0
result = 0

a = int(input("Enter the number to find out its binary form: "))

while a > 0:
    r = a % 2
    ans = ans * 10 + r
    a = a // 2

while ans > 0:
    rem = ans % 10
    result = result * 10 + rem
    ans = ans // 10

print("Binary form:", result)
