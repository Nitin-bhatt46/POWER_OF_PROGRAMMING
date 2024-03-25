import java.util.Scanner;

public class SmallCapital {
    
    public static void small_cap(char fin) {
        if (fin >= 'a' && fin <= 'z') {
            // Convert the lowercase letter to uppercase
            fin = (char) (fin - 'a' + 'A');
        }
        
        System.out.println(fin);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter any lowercase letter: ");
        char fin = scanner.next().charAt(0);
        
        small_cap(fin);
        
        scanner.close();
    }
}
