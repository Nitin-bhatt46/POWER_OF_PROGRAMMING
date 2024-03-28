import java.util.*;

class IndexFinder {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = 0;
        int ans;
        int[] array = {1, 2, 3, 4, 5}; 
        boolean found = false; // Initialize found to false
        
        System.out.println("Enter any number to find out if it is present in the array list: ");
        int n = sc.nextInt();
        
        for (int i = 0; i < 5; i++) {
            if (n == array[i]) {
                System.out.println("The index is " + i);
                found = true;
                break;
            }
        }
        
        if (!found) {
            System.out.println("-1");
        }
    }
}
