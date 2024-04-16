#include <iostream>
using namespace std;
int main() {
    int arr[]={2,3,3,4,4,5,6};
    
    int find;
    cout<<"enter the number to find in the array = ";
    cin>>find;
    int n = sizeof(arr)/sizeof(arr[0]);
    int mid;
    int start =0;
    int end=n-1;
    int first =-1;
    int last =-1;
    
    while(start<=end){
        mid = (start+end)/2;
        if(arr[mid]==find){
           
           first = mid;
            end = mid-1;
        }
        else if(arr[mid]<find){
            start = mid+1;
        }
        else{
            end = mid -1;
        }
    }
    
    
    start =0;
    end = n-1;
    while(start<=end){
        mid = (start+end)/2;
        if(arr[mid]==find){
           
           last = mid;
            start = mid+1;
        }
        else if(arr[mid]<find){
            start = mid+1;
        }
        else{
            end = mid -1;
        }
    }
    
    

    return 0;
}
