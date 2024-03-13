#include <iostream>
using namespace std;
int main() {
    int n;
    int sum =0;
    cout<<"enter the till you need square sum = ";
    cin>>n;
    
    for(int i=1;i<=n;i++){
        sum += i * i * i ;
            
    }
    cout<<sum;
    return 0;
}
