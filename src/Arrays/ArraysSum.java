package Arrays;

public class ArraysSum {
    // Static array
    static int arr[] = {2, 3, 4, 6, 5};

    // Method to calculate sum of elements
    static int sum() {
        int sum = 0;

        // Loop through array to calculate sum
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return sum;
    }

    public static void main(String args[]) {
        // Display the sum
        System.out.println("Sum of the given array is: " + sum());
    }
}
