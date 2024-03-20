
#include <iostream>
using namespace std;
int main() {
    
 int n;
 cout<<"enter the number  till u need even number = ";
 cin>>n;
 
 while(n>0){
     if(n%3==0 || n%5==0){
         n--;
         continue;
     }
     
     cout<<n<<endl;
     
     n--;
 }
 
    return 0;
}
