
import java.util.*;
class pos_even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number = ");
        int n = sc.nextInt();
        
   if(n%2==0 && n>=0){
       System.out.println("number is +ve and even also");
   }
   else{
       System.out.println("Number is odd or -ve ");
   }
    }
}

