import java.util.Scanner;

public class Interchange {
    public static void interchange(int a, int b, int c) {
        int temp = a;
        a = b;
        b = c;
        c = temp;

        System.out.println("Value of a is = " + a);
        System.out.println("Value of b is = " + b);
        System.out.println("Value of c is = " + c);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of a: ");
        int a = scanner.nextInt();

        System.out.print("Enter the value of b: ");
        int b = scanner.nextInt();

        System.out.print("Enter the value of c: ");
        int c = scanner.nextInt();

        interchange(a, b, c);
        
        scanner.close();
    }
}
