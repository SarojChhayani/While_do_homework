//WAP to input the 5 digit number and then reverse it
public class ReverseNumber {
    public static void main(String[] args) {
        // Example number
        int number = 12345;

        // Initialize variables
        int reversedNumber = 0;
        int remainingDigits = number;

        // Reverse the number using a do-while loop
        do {
            // Extract the last digit of the remaining number
            int digit = remainingDigits % 10;

            // Add the digit to the reversed number (shift previous digits to the left and add the new digit)
            reversedNumber = (reversedNumber * 10) + digit;

            // Remove the last digit from the remaining digits
            remainingDigits /= 10;
        } while (remainingDigits != 0);

        // Print the reversed number
        System.out.println("Reversed number: " + reversedNumber);
    }
}
