#include <iostream>
using namespace std;
// method
void small_cap(int fin){  //void is return type.
    char result;
    
      if(fin>='a' && fin<='z'){
        
        result = fin- 'a' + 'A';
    }
    
    cout<<result;
}

// main function 
int main() {
  
    char fin ;

    cout<<"enter any small letter alphabet ";
    cin>>fin;
    small_cap(fin);
   
