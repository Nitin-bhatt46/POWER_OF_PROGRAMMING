import java.util.Scanner;

public class func_cube {
    public static int cube(int a) {
        int result;
        result = a * a * a;
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number to find out its cubic value:");
        int a = in.nextInt();
        
        System.out.println("Cubic value: " + cube(a));
        
        in.close(); // Close scanner to prevent resource leak
    }
}
