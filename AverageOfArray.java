
import java.util.*;
class AverageOfArray {
    
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in) ;
    int result = 0 ;
    int ans;
       int[] array = new int[18]; 
       
       System.out.println("enter 18 values. :");
       
       for(int i =0;i<18;i++){
           array[i] = sc.nextInt();
       }
       
      for(int i =0;i<18;i++){
           
           result += array[i];
       }
       
       ans = result/18;
       // instread of array size 18 we can use name_of_array.length 
       System.out.println("The sum of array values. : "+ans);
       
       
    }
}
