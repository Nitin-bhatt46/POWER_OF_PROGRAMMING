
import java.util.*;
class teen_age {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age  = ");
        int n = sc.nextInt();
        
   if(n%2==0 && n>=0){
       System.out.println("YOu are teenager");
   }
   else{
       System.out.println("YOu are not a teenager ");
   }
    }
}
