#include <iostream>
using namespace std;
int main() {
    int t;
   cout<<"enter the temperature of pool in Fahrenheit = ";
   cin>>t;
   if(t<90 && t>70){
       cout<<"Suitable for swimming";
   }
   else{
       cout<<"Not suitable for swimming";
   }
    return 0;
}
