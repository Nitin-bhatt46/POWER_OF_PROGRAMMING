import java.util.*;
public class fac_while {
 
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int sum=1;
        int n;
        System.out.print("enter any number till you need even number = ");
        n = sc.nextInt();
            while(n>0){
     sum =sum * n;
     n--;
 }
 System.out.println(sum);
        }
    }
