#include <iostream>
using namespace std;
int main() {
    int arr[]={2,3,4,5,6};
    
    int find;
    cout<<"enter the number to find in the array = ";
    cin>>find;
    int n = sizeof(arr)/sizeof(arr[0]);
    int mid;
    int start =0;
    int end=n-1;
    
    while(start<=end){
        mid = (start+end)/2;
        if(arr[mid]==find){
            cout<<"got it the index is"<<" "<<mid; 
            break;
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
