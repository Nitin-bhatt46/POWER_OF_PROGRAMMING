#include <iostream>
using namespace std;

int main() {
    int a = 5, b = 3;

    // Arithmetic operators
    int sum = a + b;
    int difference = a - b;
    int product = a * b;
    int quotient = a / b;
    int remainder = a % b;

    // Bitwise operators
    int bitwiseAnd = a & b;
    int bitwiseOr = a | b;
    int bitwiseXor = a ^ b;
    int bitwiseComplementA = ~a;
    int bitwiseLeftShift = a << 1;
    int bitwiseRightShift = a >> 1;

    // Unary operators
    int unaryMinus = -a;
    int unaryPlus = +a;
    int unaryIncrement = a++;
    int unaryDecrement = b--;

    // Comparison operators
    bool equalTo = a == b;
    bool notEqualTo = a != b;
    bool greaterThan = a > b;
    bool lessThan = a < b;

    // Logical operators
    bool logicalAnd = (a < 10) && (b > 1);
    bool logicalOr = (a < 10) || (b < 1);
    bool logicalNot = !(a == 10);

    // Display results
    cout << "Arithmetic Operators:" << endl;
    cout << "Sum: " << sum << endl;
    cout << "Difference: " << difference << endl;
    cout << "Product: " << product << endl;
    cout << "Quotient: " << quotient << endl;
    cout << "Remainder: " << remainder << endl;

    cout << "\nBitwise Operators:" << endl;
    cout << "Bitwise AND: " << bitwiseAnd << endl;
    cout << "Bitwise OR: " << bitwiseOr << endl;
    cout << "Bitwise XOR: " << bitwiseXor << endl;
    cout << "Bitwise Complement of a: " << bitwiseComplementA << endl;
    cout << "Bitwise Left Shift: " << bitwiseLeftShift << endl;
    cout << "Bitwise Right Shift: " << bitwiseRightShift << endl;

    cout << "\nUnary Operators:" << endl;
    cout << "Unary Minus: " << unaryMinus << endl;
    cout << "Unary Plus: " << unaryPlus << endl;
    cout << "Unary Increment of a: " << unaryIncrement << endl;
    cout << "Unary Decrement of b: " << unaryDecrement << endl;

    cout << "\nComparison Operators:" << endl;
    cout << "Equal To: " << equalTo << endl;
    cout << "Not Equal To: " << notEqualTo << endl;
    cout << "Greater Than: " << greaterThan << endl;
    cout << "Less Than: " << lessThan << endl;

    cout << "\nLogical Operators:" << endl;
    cout << "Logical AND: " << logicalAnd << endl;
    cout << "Logical OR: " << logicalOr << endl;
    cout << "Logical NOT: " << logicalNot << endl;

    return 0;
}
