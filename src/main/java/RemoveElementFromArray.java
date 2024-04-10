//WAP to remove specific element from an array
public class RemoveElementFromArray {
    public static void main(String[] args) {
        // Original array
        int[] array = {1, 2, 3, 4, 5, 6, 7};

        // Element to be removed
        int elementToRemove = 4;

        // Index to keep track of the current position in the array
        int i = 0;

        // Loop through the array elements
        while (i < array.length) {
            // Check if the current element matches the element to be removed
            if (array[i] == elementToRemove) {
                // Shift the elements to the left starting from the index where the element is found
                for (int j = i; j < array.length - 1; j++) {
                    array[j] = array[j + 1];
                }
                // Reduce the size of the array by one
                array[array.length - 1] = 0; // Assuming the default value is 0
            } else {
                // Move to the next element
                i++;
            }
        }

        // Print the modified array
        System.out.print("Array after removing " + elementToRemove + ": ");
        for (int num : array) {
            // Skip printing the default value (0) after removal
            if (num != 0) {
                System.out.print(num + " ");
            }
        }
    }
}
