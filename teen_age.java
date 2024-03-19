
import java.util.*;
class teen_age {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age  = ");
        int n = sc.nextInt();
        
   if(n<=19 && n>=13){
       System.out.println("YOu are teenager");
   }
   else{
       System.out.println("YOu are not a teenager ");
   }
    }
}
