#include <iostream>
using namespace std;
int main() {
    

    // Outer loop for rows
    for (int i = 10 ; i <= 15; ++i) {
        // Inner loop for printing numbers
        for (int j = 10 ; j <=i; ++j) {
            cout << j << " ";
        }
        cout << endl;
    }

    return 0;
}
