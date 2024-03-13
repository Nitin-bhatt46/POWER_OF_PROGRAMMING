import java.util.*;
class cusum {
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the till you need square sum = ");
int n = sc.nextInt();    
    int sum =0;    
        for(int i=1;i<=n;i++){
            sum += i*i*i;
        }
        
        System.out.println(sum);
    }
    
    }
