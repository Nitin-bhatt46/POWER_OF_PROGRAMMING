import java.util.Scanner;

public class Armstrong {
    
    public static void armstrong(int fin) {
        int original = fin;
        int arms = 0;
        while (fin > 0) {
            int digit = fin % 10;
            arms += digit * digit * digit;
            fin /= 10;
        }
        if (original == arms) {
            System.out.println("Armstrong number");
        } else {
            System.out.println("Not an Armstrong number");
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a number to check if it's an Armstrong number: ");
        int fin = scanner.nextInt();
        armstrong(fin);
        
        scanner.close();
    }
}
