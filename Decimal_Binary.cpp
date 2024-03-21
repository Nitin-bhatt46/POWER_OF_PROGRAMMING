#include <iostream>
using namespace std;
int main() {
    int a ;
    int ans =0;
    int result = 0;
    int rem;
    int r;
    cout<<"enter the number to find out the its binary form = ";
    cin>>a;
    
    while(a>0){
        r=a%2;   
        ans = ans*10+r;
       a=a/2;
    }
    
    while ( ans > 0){
        rem = ans % 10;
        result = result*10+rem;
        ans =ans / 10;
        
    }
   cout<<result;
        
    return 0;
}
