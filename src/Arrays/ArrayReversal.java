package Arrays;

public class ArrayReversal {

    public static void reverseArray(int[] arr) {
        // Check if array is null or empty
        if (arr == null || arr.length <= 1) {
            return; // Nothing to reverse
        }

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            // Swap elements at left and right indices
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            // Move indices toward the center
            left++;
            right--;
        }
    }

    // Method to print array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Main method with test case
    public static void main(String[] args) {
        // Create and initialize test array
        int[] testArray = {1, 2, 3, 4, 5};

        System.out.println("Original array:");
        printArray(testArray);

        // Call the reverseArray method
        reverseArray(testArray);

        System.out.println("Reversed array:");
        printArray(testArray);

        // Add another test with even number of elements
        int[] testArray2 = {10, 20, 30, 40, 50, 60};

        System.out.println("\nOriginal array 2:");
        printArray(testArray2);

        // Call the reverseArray method
        reverseArray(testArray2);

        System.out.println("Reversed array 2:");
        printArray(testArray2);
    }
}