import java.util.*;
public class con_div {
 
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int sum=1;
        int n;
        System.out.print("enter any number till you need even number = ");
        n = sc.nextInt();
            while(n>0){
                if(n%3==0 || n%5==0){
                    n--;
                    continue;
                    
                }
     System.out.println(n);
     n--;
 }

        }
    }
