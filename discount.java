import java.util.*;
class discount{
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
    
 
 System.out.println("Enter you age to find the discount eligiblilty");
 int age=sc.nextInt();
 
 if(age>65 || age<12){
     System.out.println("Yes");
 }
 else{
     System.out.println("NO");
 }
    }
}
