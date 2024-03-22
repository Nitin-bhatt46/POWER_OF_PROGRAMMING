#include <iostream>
using namespace std;
int cube(int a){
    int result = a*a*a;
    return result;
    
}
int main() {
    int n;
    cout<<"enter the number to find out its cubic value = ";
    cin>>n;
cout<<cube(n);

    return 0;
}
