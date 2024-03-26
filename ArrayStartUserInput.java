import java.util.*;
class ArrayStartUserInput {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
      // decleration of array.

      int[] a = new int[5] ;
     
     for(int i =0;i<5;i++){
         System.out.print("enter the array value. = ");
         a[i]= sc.nextInt();
     }
      
        for(int i =0;i<5;i++){
         System.out.print(a[i]);
     }
      
      
    }
}
