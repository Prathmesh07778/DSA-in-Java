import java.util.Arrays;
import java.util.Scanner;

public class code{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Accept array input
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Step 2: Sort the array
        Arrays.sort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));

        // Step 3: Search for an element using binary search
        System.out.print("Enter the element to search: ");
        int key = scanner.nextInt();
        int index = Arrays.binarySearch(arr, key);
        if (index >= 0) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found!");
        }

        // Step 4: Reverse the array
        reverseArray(arr);
        System.out.println("Reversed Array: " + Arrays.toString(arr));

        // Step 5: Find the second largest element
        int secondLargest = findSecondLargest(arr);
        System.out.println("Second Largest Element: " + secondLargest);

        scanner.close();
    }

    // Function to reverse an array
    public static void reverseArray(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    // Function to find the second largest element in an array
    public static int findSecondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num < largest) {
                secondLargest = num;
            }
        }
        return secondLargest;
    }
}
