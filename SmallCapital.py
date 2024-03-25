def small_cap(fin):
    if(fin>='a' and fin<='z'):
        result = chr(ord(fin) - ord('a') + ord('A'))
    print(result)
    
    
small_cap(fin = str(input("enter the small letter alphabet = ")))
    
