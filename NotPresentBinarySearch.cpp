#include <iostream>
using namespace std;
int main() {
    int arr[]={2,3,4,6};
    
    int find;
    cout<<"enter the number to find in the array = ";
    cin>>find;
    int n = sizeof(arr)/sizeof(arr[0]);
    int mid;
    int start =0;
    int end=n-1;
    int index = n;
    
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
            index = mid;
            end = mid -1;
        }
    }
    
    cout<<"Index number "<<mid<<endl;
    cout<<"value is "<<arr[mid];
    
    

    return 0;
}
