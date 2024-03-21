a = int(input("Enter the number to find out its binary form: "))

ans = 0
count = 0
while a > 0:
    r = a % 10
    ans += r * (2 ** count)
    a //= 10
    count += 1

print("Binary form:", ans)
