import java.util.Scanner;

public class BinaryConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number to find out its binary form: ");
        int a = scanner.nextInt();

        int ans = 0;
        int count = 0;
        while (a > 0) {
            int r = a % 10;
            ans += r * Math.pow(2, count);
            a /= 10;
            count++;
        }

        System.out.println("Binary form: " + ans);
        scanner.close();
    }
}
