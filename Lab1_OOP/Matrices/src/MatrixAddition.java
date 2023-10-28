public class MatrixAddition {
    public static void main(String[] args) {
        
        int[][] matrix1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] matrix2 = {
            {6, 8, 7},
            {8, 5, 4},
            {3, 5, 1}
        };

        
        if (matrix1.length != matrix2.length || matrix1[0].length != matrix2[0].length) {
            System.out.println("Matrices must have the same dimensions for addition.");
            return;
        }

        int rows = matrix1.length;
        int columns = matrix1[0].length;

        int[][] sumMatrix = new int[rows][columns];

        
        addMatrices(matrix1, matrix2, sumMatrix);

        
        System.out.println("Matrix 1:");
        displayMatrix(matrix1);
        System.out.println("Matrix 2:");
        displayMatrix(matrix2);
        System.out.println("Resultant matrix after addition:");
        displayMatrix(sumMatrix);
    }

    public static void addMatrices(int[][] matrix1, int[][] matrix2, int[][] result) {
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
    }

    public static void displayMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
