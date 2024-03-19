import java.util.*;
class Temperature_range {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the temperature of pool in Fahrenheit = ");
        int t = sc.nextInt();
        
   if(t<90 && t>70){
       System.out.println("Suitable for swimming");
   }
   else{
       System.out.println("Not suitable for swimming");
   }
    }
}
