#include <iostream>
using namespace std;
int main() {
    

    // Outer loop for rows
    for (char i = 'A'; i <= 'E'; ++i) {
        // Inner loop for printing numbers
        for (char j = 'A'; j <=i; ++j) {
            cout << j << " ";
        }
        cout << endl;
    }

    return 0;
}
