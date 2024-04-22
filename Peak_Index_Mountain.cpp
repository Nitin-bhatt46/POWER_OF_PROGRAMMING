#include <iostream>
using namespace std;
int main() {
    int arr[]={2,4,6,8,10,8,5};
    int find;
    int mid;
    int start =1;
    int n= sizeof(arr)/sizeof(arr[0]);
    int end=n-1;
    
    while(start<=end){
        mid = (start+end)/2;
        
        if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){
            cout<<"The highest index  is = "<<" "<<mid; 
            break;
        }
        else if(arr[mid]>arr[mid-1]){
             
            start = mid+1;
        }
        else{
            end = mid -1;
        }
    }
   
    return 0;
}
