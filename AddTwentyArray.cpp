#include <iostream>
using namespace std;

int main() {
    int result = 0;
    int array[20];

    cout << "Enter 20 values: " << endl;

    for (int i = 0; i < 20; i++) {
        cin >> array[i];
    }

    for (int i = 0; i < 20; i++) {
        result += array[i];
    }

    cout << "The sum of array values: " << result << endl;

    return 0;
}
