//WAP to enter any String and count total number of 'a' in that String.
public class CharacterCount {
    public static void main(String[] args) {
        // Example string
        String inputString = "Test Programme.";

        // Convert the input string to lowercase to make the comparison case-insensitive
        inputString = inputString.toLowerCase();

        // Initialize count variable to store the count of 'a'
        int count = 0;

        // Initialize index for the do-while loop
        int i = 0;

        // Perform a do-while loop to iterate through each character of the string
        do {
            // Check if the current character is 'a'
            if (inputString.charAt(i) == 'a') {
                // If yes, increment the count
                count++;
            }
            // Move to the next character
            i++;
        } while (i < inputString.length());

        // Print the count of 'a' in the string
        System.out.println("Total number of 'a' in the string: " + count);
    }
}
