#include <iostream>
using namespace std;
void interchange(int a,int b,int c){
    int temp;
    temp = a;
        a = b;
        b = c;
        c = temp;


cout<<"value of a is = "<<a<<endl;
cout<<"value of b is = "<<b<<endl;
 cout<<"value of c is = "<<c<<endl;   
}
int main() {
    
    int a,b,c;

cout<<"enter the value of a = ";
cin>>a;
cout<<"enter the value of b = ";
cin>>b;
cout<<"enter the value of c = ";
cin>>c;

interchange(a,b,c);
    return 0;
}
