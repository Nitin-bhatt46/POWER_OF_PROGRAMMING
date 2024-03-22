import java.util.Scanner;

public class func_rev {
    public static int reverse(int n) {
        int result = 0;
        boolean isNegative = false;

        // Check if the number is negative
        if (n < 0) {
            isNegative = true;
            n = -n; // Convert negative number to positive for reversal
        }

        // Reverse the number
        while (n != 0) {
            int digit = n % 10;
            result = result * 10 + digit;
            n /= 10;
        }

        // Convert back to negative if original number was negative
        if (isNegative) {
            result = -result;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to reverse: ");
        int number = scanner.nextInt();

        int reversedNumber = reverse(number);
        System.out.println("Reversed number: " + reversedNumber);

        scanner.close();
    }
}

