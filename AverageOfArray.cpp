#include <iostream>
using namespace std;

int main() {
    int result = 0;
    int array[18];

    cout << "Enter 20 values: " << endl;

    for (int i = 0; i < 18; i++) {
        cin >> array[i];
    }

    for (int i = 0; i < 18; i++) {
        result += array[i];
    }

    cout << "The sum of array values: " << result / 18 << endl;

// instead of 18 we can use sizeof(array) / sizeof(array[])
    return 0;
}
