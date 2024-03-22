import java.util.Scanner;

public class slogan {
    public static void print(int n) {
        for(int i =0;i<n;i++){
            System.out.println("Hello Coder Army");
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the number for slogan print  = ");
        int n = scanner.nextInt();

        print(n);

        scanner.close();
    }
}

