#include <iostream>
using namespace std;
int main() {
    int n;
    cout<<"Till which number you want to print odd number = ";
    cin>>n;
    for(int i=0;i<=n;i++){
        if(i%2!=0){
        cout<<i<<endl;
    }
    }

    return 0;
}
