#include <iostream>
using namespace std;
int main() {
   
        for (char i = 'D'; i >= 'A'; i--) {
            for (char j = 'A'; j <= i; j++) {
               cout<<j<<" ";
            }
          cout<<endl;
        }
    
    return 0;
}
