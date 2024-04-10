//WAP to find the common element so between two string arrays
public class CommonElements {
    public static void main(String[] args) {
        // Define two arrays of string values
        String[] array1 = {"apple", "banana", "orange", "kiwi"};
        String[] array2 = {"banana", "orange", "grape", "kiwi"};

        // Initialize variables for indices of both arrays
        int i = 0, j;

        // Outer loop: iterate through each element of array1
        do {
            j = 0; // Reset the index for array2 for each iteration of array1

            // Inner loop: iterate through each element of array2
            do {
                // Check if the current element of array1 equals the current element of array2
                if (array1[i].equals(array2[j])) {
                    // If equal, print the common element
                    System.out.println("Common element: " + array1[i]);
                }
                j++; // Move to the next element of array2
            } while (j < array2.length);

            i++; // Move to the next element of array1
        } while (i < array1.length);
    }
}

