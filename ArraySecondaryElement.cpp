#include <iostream>
using namespace std;
int main() {
   int max =0;
   int num[5]={5,6,7,8,9};
    int result;
    for(int i =0;i<5;i++){
       if (num[i]>max){
           
           max = num[i];
       }
    }
    
    for(int i =0;i<5;i++){
    if (max>num[i]){
        result = num[i];
    }
    }
    cout<<result;
    

    return 0;
}
