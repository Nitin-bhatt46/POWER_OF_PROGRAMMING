import java.util.*;
class Fibonacci {
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.print(" enter the number to het fibonacci series = ");
int n = sc.nextInt();   
int c1 = 0;
int c2 =1;
int c3 =0;    

System.out.println(c1);
System.out.println(c2);
        for(int i=1;i<=n;i++){
            c3 = c1 + c2 ;  // 0 + 1
            System.out.println(c3);
             c1 = c2;
             c2 = c3;  
           
            
        }
