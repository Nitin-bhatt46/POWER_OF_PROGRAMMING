#include <iostream>
using namespace std;
int main() {
   
   char alpha[26];
    
    for(int i =0;i<=26;i++){
       alpha[i]=i +'a';
    }
    
    for(int i=0;i<26;i++){
        cout<<alpha[i]<<endl;
    }


    return 0;
}
