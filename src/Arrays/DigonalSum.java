public class DigonalSum{
    public static void DigonalSum(int[][] arr) {
        if (arr.length != arr[0].length) {
            throw new IllegalArgumentException("Matrix must be square");
        }

        int mainDiagonalSum = 0;
        int secondaryDiagonalSum = 0;

        for (int i = 0; i < arr.length; i++) {
            // Main diagonal (top-left to bottom-right)
            mainDiagonalSum += arr[i][i];

            // Secondary diagonal (top-right to bottom-left)
            secondaryDiagonalSum += arr[i][arr.length - 1 - i];
        }

        System.out.println("Main Diagonal Sum: " + mainDiagonalSum);
        System.out.println("Secondary Diagonal Sum: " + secondaryDiagonalSum);
    }

    public static void main(String[] args) {
        // Example usage
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        DigonalSum(matrix);
    }
}