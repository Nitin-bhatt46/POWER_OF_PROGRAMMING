
import java.util.*;
class Search_Rotated_Array {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int arr[]={2,3,4,0,1};
    int mid;
    int start =1;
    int n= arr.length;
    int end=n-1;
    
    System.out.print("enter the number which you want to serach in array. =");
    int target = sc.nextInt();
    
      while(start<=end){
        mid = (start+end)/2;
        
        if(arr[mid]== target){
            System.out.println("Got it ");
            break;
        }
        else if(arr[mid]>arr[0]){  // left side sorted.
            if(arr[mid]>=target && arr[start]<=target ){  
             
             end = mid -1;
        }
        else{
            start = mid+1;
            
        }
        }
        
        
        else {// right side sorted{
            if(arr[mid]<=target && arr[end]>=target){
                start = mid +1;
            }
            else
            {
                end = mid -1;
            }
        }
             
        }
       
    }
    
    }
