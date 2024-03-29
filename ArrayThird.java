import java.util.Arrays;

class ThirdSmallestElement {
    public static void main(String[] args) {
        int[] array = {7, 2, 8, 1, 4, 5}; // Sample array
        Arrays.sort(array); // Sort the array in ascending order
        int thirdSmallest = array[2]; // Access the element at index 2 (3rd smallest)
        System.out.println("Third smallest element in the array: " + thirdSmallest);
    }
}
