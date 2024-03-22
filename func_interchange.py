def interchange(a, b, c):
    temp = a
    a = b
    b = c
    c = temp

    print("Value of a is =", a)
    print("Value of b is =", b)
    print("Value of c is =", c)

if __name__ == "__main__":
    a = int(input("Enter the value of a: "))
    b = int(input("Enter the value of b: "))
    c = int(input("Enter the value of c: "))

    interchange(a, b, c)
