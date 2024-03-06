// importing library 
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        // Creating a Scanner object
        Scanner scanner = new Scanner(System.in);
        
        // Prompting the user to enter a number
        System.out.println("Enter any number:");
        
        // Taking user input
        int n = scanner.nextInt();
        
        // Printing the entered number
        System.out.println("You entered: " + n);
        
        // Closing the scanner to prevent resource leaks
        scanner.close();
    }
}
