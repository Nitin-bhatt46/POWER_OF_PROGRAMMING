#include <iostream>
using namespace std;
int main() {

int array[]={9,7,3,1,6};
cout<<"before sorting the values : ";
for ( int i =0;i<5;i++){
    cout<<array[i]<<" ";
}
cout<<endl;
int n = sizeof(array)/sizeof(array[0]);
cout<<"value after sorting the array : ";

for( int i = 0;i<n-1;i++){
int index = i ;  
for( int j =i+1; j<n;j++){
    
    if(array[j]<array[index])
    index = j; 
}

swap(array[ index],array[i]);
}

for(int i =0;i<n;i++){
    cout<<array[i]<<" ";
}
    return 0;
}
