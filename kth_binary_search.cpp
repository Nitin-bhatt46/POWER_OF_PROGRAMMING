
#include <iostream>
using namespace std;
int main() {
    int arr[]={2,3,4,7,11};
    
    int find;
    cout<<"enter the number which resemble the missing number count = ";
    cin>>find;
    int n = sizeof(arr)/sizeof(arr[0]);
    int mid;
    int start =0;
    int end=n-1;
    int ans= arr.size();
    
    while(start<=end){
        mid = (start+end)/2;
        
        if(arr[mid]-mid-1>=find){
            ans = mid;
            end = mid -1;
          
        }
        
        else{
            start = mid +1;
        }
    }
    
    cout<<"missing number = "<<ans+find;
    

    return 0;
}
