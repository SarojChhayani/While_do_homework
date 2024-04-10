//WAP to enter array and sort the values in ascending order

//import java.util.Arrays;

import java.util.Arrays;

public class ArraySortAscending {
    public static void main(String[] args) {
        // Define the array with initial values
        int[] array = {5, 2, 9, 1, 3};

        // Print the original array
        System.out.println("Original array: " + Arrays.toString(array));

        // Sort the array using the Arrays.sort() method
        Arrays.sort(array);

        // Print the sorted array
        System.out.println("Sorted array in ascending order: " + Arrays.toString(array));
    }
}
