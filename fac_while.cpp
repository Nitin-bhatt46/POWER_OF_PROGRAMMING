#include <iostream>
using namespace std;
int main() {
    
 int n,sum=1;
 cout<<"enter the number  till u need even number = ";
 cin>>n;
 
 while(n>0){
     sum *= n;
     n--;
 }
 cout<<sum;
    return 0;
}
