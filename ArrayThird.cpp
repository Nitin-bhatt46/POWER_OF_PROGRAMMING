#include <iostream>
#include <algorithm> // for sort function
using namespace std;

int main() {
    int array[] = {7, 2, 8, 1, 4, 5}; // Sample array
    int n = sizeof(array) / sizeof(array[0]); // Calculate the size of the array
    sort(array, array + n); // Sort the array in ascending order

    int thirdSmallest = array[2]; // Access the element at index 2 (3rd smallest)
    cout << "Third smallest element in the array: " << thirdSmallest << endl;

    return 0;
}
