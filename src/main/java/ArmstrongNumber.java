//WAP to input any number and find out if its Armstrong number or not?
public class ArmstrongNumber {
    public static void main(String[] args) {
        // Example number
        int number = 153;

        // Store the original number in a separate variable
        int originalNumber = number;

        // Calculate the number of digits in the number
        int numberOfDigits = 0;
        int tempNumber = number;
        do {
            numberOfDigits++; // Increment the count of digits
            tempNumber /= 10; // Remove the last digit from the number
        } while (tempNumber != 0);

        // Calculate the sum of the digits raised to the power of the number of digits
        int sum = 0;
        tempNumber = number; // Reset the tempNumber variable

        do {
            // Extract the last digit
            int digit = tempNumber % 10;

            // Add the digit raised to the power of numberOfDigits to the sum
            sum += Math.pow(digit, numberOfDigits);

            // Remove the last digit from the number
            tempNumber /= 10;
        } while (tempNumber != 0);

        // Check if the sum equals the original number
        boolean isArmstrong = (sum == originalNumber);

        // Print the result
        if (isArmstrong) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }
    }
}
