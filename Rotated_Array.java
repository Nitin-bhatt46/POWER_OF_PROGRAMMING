class Rotated_Array {
    public static void main(String[] args) {
        int arr[]={3,4,5,6,1,2};
    int mid;
    int start =1;
    int n= arr.length;
    int end=n-1;
    int ans =0;
      while(start<=end){
        mid = (start+end)/2;
        
        if(arr[mid]>=arr[0] ){  // left side sorted.
               start = mid+1;
        }
        else if(arr[mid]<arr[0]){  // right side sorted
             ans = arr[mid];
            end = mid-1;
        }
       
    }
    
    System.out.println("the smallest value = "+ans) ;
    
   
    }
}
