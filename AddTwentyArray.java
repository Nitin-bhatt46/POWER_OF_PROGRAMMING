
import java.util.*;
class AddTwentyArray {
    
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in) ;
    int result = 0 ;
       int[] array = new int[20]; 
       
       System.out.println("enter 20 values. :");
       
       for(int i =0;i<20;i++){
           array[i] = sc.nextInt();
       }
       
      for(int i =0;i<20;i++){
           
           result += array[i];
       }
       
       System.out.println("The sum of array values. : "+result);
       
       
    }
}
