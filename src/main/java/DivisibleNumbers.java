//WAP to print the numbers between 1 to 100 which can be divided by 3 and 5 separately
public class DivisibleNumbers {
    public static void main(String[] args) {
        // Initialize variables
        int number = 1; // Starting number

        // Print numbers divisible by 3
        System.out.println("Numbers divisible by 3:");
        do {
            // Check if the number is divisible by 3
            if (number % 3 == 0) {
                // If divisible, print the number
                System.out.println(number);
            }
            // Increment the number
            number++;
        } while (number <= 100); // Repeat until the number reaches 100

        // Reset number for the next loop
        number = 1;

        // Print numbers divisible by 5
        System.out.println("\nNumbers divisible by 5:");
        do {
            // Check if the number is divisible by 5
            if (number % 5 == 0) {
                // If divisible, print the number
                System.out.println(number);
            }
            // Increment the number
            number++;
        } while (number <= 100); // Repeat until the number reaches 100
    }
}
