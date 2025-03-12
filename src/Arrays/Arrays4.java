package Arrays;
import java.util.Scanner;


//Find the largest Element in Array

public class Arrays4 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        // Taking array size input
        System.out.print("Enter the number of elements: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        // Taking array elements input
        System.out.println("Enter the  elements :");
        for( int i=0 ; i<size; i++){

            arr[i]= sc.nextInt();
        }

        // Finding the largest element
        int max =arr[0];// Assume first element is the largest
        for(int i=1;i<size;i++){
            if(arr[i] >max){
                max = arr[i];// Update max if a larger value is found
            }

        }

        // Displaying the largest element
        System.out.println("The Largest from Array is : " + max);

        Scanner clos;
    }


}
