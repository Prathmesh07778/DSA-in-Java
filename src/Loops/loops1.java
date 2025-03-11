package Loops;

public class loops1 {
    public static void main(String args[]) {
        int n = 4; // Number of rows
        int m = 5; // Number of columns

        for (int i = 0; i < n; i++) {  // Runs for 4 rows (0 to 3)
            for (int j = 0; j < m; j++) {  // Runs for 5 columns (0 to 4)
                System.out.print("* ");  // Print star without moving to a new line
            }
            System.out.println();  // Move to the next line after each row

            //If you write System.out.println("* ");

            //Then it will print  4 * 6 soild reactangle
        }
    }
}
