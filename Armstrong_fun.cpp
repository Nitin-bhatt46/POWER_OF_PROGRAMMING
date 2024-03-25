#include <iostream>
using namespace std;
// method
void armstrong(int fin){  //void is return type.
    int match = fin;
    int r ;
    int arms = 0;
    while(fin>0){
        r = fin % 10;
        arms +=(r * r * r);
        fin=fin/10;
    }
    if( match == arms){
        cout<<"Armstrong number";
    }
    else{
        cout<<"not a Armstrong number";
    }

}

// main function 
int main() {
  
    int n;

    cout<<"enter the nummber for finding the amstrong ";
    cin>>n;
    armstrong(n);
   
    return 0;
}
