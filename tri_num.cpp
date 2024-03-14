#include <iostream>
using namespace std;
int main() {
    

    // Outer loop for rows
    for (int i = 1; i <= 7; ++i) {
        // Inner loop for printing numbers
        for (int j = 1; j <= i; ++j) {
            if(j>6) continue;
            cout << j << " ";
        }
        cout << endl;
    }

    return 0;
}
