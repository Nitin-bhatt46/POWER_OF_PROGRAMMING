
class Peak_Index_Mountain {
    public static void main(String[] args) {
      
    int arr[]={2,4,6,8,10,8,5};
    int n = arr.length;
    int mid;
    int start =1;
    int end=n;
    int ans;
    
    while(start<=end){
        mid = (start+end)/2;
        if(arr[mid]>arr[mid-1]&& arr[mid]>arr[mid+1]){
            System.out.println("The index is =  "+mid); 
            break;
        }
        else if(arr[mid]>arr[mid-1]){
            start = mid+1;
        }
        else{
            end = mid -1;
        }
    }
    }
}
