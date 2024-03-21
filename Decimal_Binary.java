import java.util.*;
class Decimal_Binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find the its binary form");
    int a = sc.nextInt();
    int ans =0;
    int result = 0;
    int rem;
    
    int r;
    while(a>0){
        r=a%2;   
        ans = ans*10+r;
       a=a/2;
    }
    
    while ( ans > 0){
        rem = ans % 10;
        result = result*10+rem;
        ans =ans / 10;
        
    }
    System.out.println(result);
        
    }
        
}
