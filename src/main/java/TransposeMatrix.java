//WAP to transpose matrix of 2-D array
public class TransposeMatrix {
    public static void main(String[] args) {
        // Define a 2D array representing a matrix
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        // Get the number of rows and columns of the matrix
        int rows = matrix.length;
        int columns = matrix[0].length;
        // Transpose the matrix
        int i = 0;
        do {
            int j = i;
            do {
                // Swap matrix[i][j] with matrix[j][i]
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
                j++;
            } while (j < columns);
            i++;
        } while (i < rows);
        // Print the transposed matrix
        System.out.println("Transposed Matrix:");
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
