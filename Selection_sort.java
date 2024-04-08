public class HelloWorld {
    
    public static void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {5, 6, 3, 4, 2};
        int n = arr.length;

        System.out.print("Array before sorting: ");
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        for(int i = 0; i < n - 1; i++) {
            int index = i;
            for(int j = i + 1; j < n; j++) {
                if(arr[j] < arr[index]) {
                    index = j;
                }
            }
            swap(arr, index, i);
        }

        System.out.print("Array after sorting: ");
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
