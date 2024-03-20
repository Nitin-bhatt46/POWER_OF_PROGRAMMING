import java.util.*;
public class even_while {
 
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int a =1;
        int n;
        System.out.print("enter any number till you need even number = ");
        n = sc.nextInt();
        while(a<n){
            if(a%2==0){
                System.out.println(a);
            }
            a++;
        }
    }
}
