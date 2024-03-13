#include <iostream>
using namespace std;
int main() {
    int n;
    int c1 = 0;
    int c2 =1;
    int c3 =0;  
    cout<<"enter the number to het fibonacci series = ";
    cin>>n;
  

cout<<(c1)<<endl;
cout<<(c2)<<endl;
        for(int i=1;i<=n;i++){
            c3 = c1 + c2 ;  // 0 + 1
            cout<<c3<<endl;
             c1 = c2;
             c2 = c3;  
             
    
}
return 0;
}
