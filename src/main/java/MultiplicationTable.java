//Printing multiplication table using do while loop
//1 2 3
//2 4 6
//3 6 9
public class MultiplicationTable {
    public static void main(String[] args) {
        int n = 3; // Size of the table (3x3)

        int i = 1; // Row counter

        // Outer do-while loop to iterate through rows
        do {
            int j = 1; // Column counter

            // Inner do-while loop to iterate through columns
            do {
                // Print the product of i and j, followed by a space
                System.out.print((i * j) + " ");
                j++; // Increment column counter
            } while (j <= n); // Repeat until j is greater than n

            System.out.println(); // Move to the next line after printing a row
            i++; // Increment row counter
        } while (i <= n); // Repeat until i is greater than n
    }
}
