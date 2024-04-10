//Write a Java program to find the common elements between two arrays (string values).
public class CommonElementsFinder {
    public static void main(String[] args) {
        // Define two string arrays
        String[] array1 = {"1", "2", "3", "4", "5"};
        String[] array2 = {"1", "2", "3", "7", "6"};

        // Initialize variables to keep track of the elements found in both arrays
        String commonElements = "";

        // Loop through each element in the first array
        int i = 0;
        do {
            // Loop through each element in the second array for comparison
            int j = 0;
            do {
                // Check if the current element of array1 exists in array2
                if (array1[i].equals(array2[j])) {
                    // Add the common element to the string
                    commonElements += array1[i] + " ";
                    break; // Break the inner loop since the element is found
                }
                j++;
            } while (j < array2.length);

            i++;
        } while (i < array1.length);

        // Print the common elements
        if (!commonElements.isEmpty()) {
            System.out.println("Common elements: " + commonElements);
        } else {
            System.out.println("No common elements found.");
        }
    }
}
