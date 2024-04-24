import java.util.*;
class kth {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int arr[]={2,3,4,7,11};
    int mid;
    int start =1;
    int n= arr.length;
    int end=n-1;
    int ans=arr.length;
    int anser;
    System.out.print("enter the number which resemble the missing number count = ");
    int target = sc.nextInt();
    
      while(start<=end){
       mid = (start+end)/2;
        
        if(arr[mid]-mid-1>=target){
            ans = mid;
            end = mid -1;
          
        }
        
        else{
            start = mid +1;
        }
    }
    anser = ans + target;
    System.out.println("missing number = "+ anser);
        }
}
