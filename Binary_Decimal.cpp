#include <iostream>
#include <cmath>
using namespace std;
int main() {
    int a ;
    int ans =0;
    int result = 0;
    int rem;
    int r;
    int count =0;
    cout<<"enter the number to find out the its binary form = ";
    cin>>a;
    
    while(a>0){
        r=a%10;   
        ans = ans+r*pow(2,count);
       a=a/10;
       count++;
    }
    
    
   cout<<ans;
        
    return 0;
}
