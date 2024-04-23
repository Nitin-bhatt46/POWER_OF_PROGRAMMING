#include <iostream>
using namespace std;
int main() {
    int arr[]={3,4,5,6,1,2};
    int mid;
    int start =1;
    int n= sizeof(arr)/sizeof(arr[0]);
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
    
    cout<<"the smallest value = "<<ans ;
    
   
    return 0;
}
