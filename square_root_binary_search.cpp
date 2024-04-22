#include <iostream>
using namespace std;
int main() {
    
    int find;
    cout<<"enter the value of root to find its square root  = ";
    cin>>find;

    int mid;
    int start =1;
    int end=find;
    int ans;
    
    while(start<=end){
        mid = (start+end)/2;
        if(mid *mid==find){
            cout<<"The value is = "<<" "<<mid; 
            break;
        }
        else if(mid*mid<find){
             ans = mid;
            start = mid+1;
        }
        else{
            end = mid -1;
        }
    }
   
    return 0;
}
