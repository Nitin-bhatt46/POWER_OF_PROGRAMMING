class ArraySecondaryElement {
    public static void main(String[] args) {
        int[] alpha = {1, 2, 3, 4, 5};
        int max = Integer.MIN_VALUE; // Initialize max to smallest possible value
        int result = Integer.MIN_VALUE; // Initialize result to smallest possible value
        
        // Finding the maximum element in the array
        for(int i = 0; i < 5; i++) {
            if(alpha[i] > max) {
                max = alpha[i];
            }
        }
        
        // Finding the second largest element in the array
        for(int i = 0; i < 5; i++) {
            if(alpha[i] < max && alpha[i] > result) {
                result = alpha[i];
            }
        }
        
        System.out.println("Second largest element in array: " + result);
    }
}
