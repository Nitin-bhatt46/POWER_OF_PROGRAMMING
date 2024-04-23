#include <iostream>
using namespace std;
int main() {
    int arr[]={3,4,5,6,1,2};
    int mid;
    int start =1;
    int n= sizeof(arr)/sizeof(arr[0]);
    int end=n-1;
    int target;
    cout<<"which number you want to find =";
    cin>>target;
    while(start<=end){
        mid = (start+end)/2;
        
        if(arr[mid]==target ){  
               cout<<"got it ";
               break;
        }
        else if (arr[mid]>=arr[0]){ // left side sorted
            
         if(arr[start]<arr[0] && arr[mid]>= target){  
            end = mid-1;
        }
        else {  // right side sorted.
            if(arr[mid]<=target && arr[end]>=target){
                start = mid +1;
            }
            else
            {
                end = mid-1;
            }
        }
        }
       
    }
