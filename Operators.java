public class OperatorsExample {
    public static void main(String[] args) {
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
        boolean equalTo = a == b;
        boolean notEqualTo = a != b;
        boolean greaterThan = a > b;
        boolean lessThan = a < b;

        // Logical operators
        boolean logicalAnd = (a < 10) && (b > 1);
        boolean logicalOr = (a < 10) || (b < 1);
        boolean logicalNot = !(a == 10);

        // Display results
        System.out.println("Arithmetic Operators:");
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);

        System.out.println("\nBitwise Operators:");
        System.out.println("Bitwise AND: " + bitwiseAnd);
        System.out.println("Bitwise OR: " + bitwiseOr);
        System.out.println("Bitwise XOR: " + bitwiseXor);
        System.out.println("Bitwise Complement of a: " + bitwiseComplementA);
        System.out.println("Bitwise Left Shift: " + bitwiseLeftShift);
        System.out.println("Bitwise Right Shift: " + bitwiseRightShift);

        System.out.println("\nUnary Operators:");
        System.out.println("Unary Minus: " + unaryMinus);
        System.out.println("Unary Plus: " + unaryPlus);
        System.out.println("Unary Increment of a: " + unaryIncrement);
        System.out.println("Unary Decrement of b: " + unaryDecrement);

        System.out.println("\nComparison Operators:");
        System.out.println("Equal To: " + equalTo);
        System.out.println("Not Equal To: " + notEqualTo);
        System.out.println("Greater Than: " + greaterThan);
        System.out.println("Less Than: " + lessThan);

        System.out.println("\nLogical Operators:");
        System.out.println("Logical AND: " + logicalAnd);
        System.out.println("Logical OR: " + logicalOr);
        System.out.println("Logical NOT: " + logicalNot);
    }
}
