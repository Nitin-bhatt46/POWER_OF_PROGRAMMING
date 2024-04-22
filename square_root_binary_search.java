import java.util.*;

class square_root_binary_search {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
    System.out.println("enter the value of root to find its square root  = ");
   int find = sc.nextInt();

    int mid;
    int start =1;
    int end=find;
    int ans;
    
    while(start<=end){
        mid = (start+end)/2;
        if(mid *mid==find){
            System.out.println("The value is =  "+mid); 
            break;
        }
        else if(mid*mid<find){
             ans = mid;
            start = mid+1;
        }
        else{
            end = mid -1;
        }
    }
    }
}
    
