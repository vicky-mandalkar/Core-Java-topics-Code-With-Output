import java.util.Scanner;

class SubtractTwoMatrixUsingFunction {

    // Input Matrix
    public static void inputMatrix(int matrix[][], Scanner sc) {
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                System.out.print("matrix[" + i + "][" + j + "] = ");
                matrix[i][j] = sc.nextInt();
            }
        }
    }

    // Display Matrix
    public static void displayMatrix(int matrix[][]) {
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // Subtract Matrices
    public static void subtractMatrix(int matrix1[][],
                                      int matrix2[][],
                                      int result[][]) {

        for(int i = 0; i < matrix1.length; i++) {
            for(int j = 0; j < matrix1[i].length; j++) {
                result[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Row: ");
        int row = sc.nextInt();

        System.out.print("Enter Col: ");
        int col = sc.nextInt();

        int matrix1[][] = new int[row][col];
        int matrix2[][] = new int[row][col];
        int result[][] = new int[row][col];

        System.out.println("\n===== Enter Matrix 1 =====");
        inputMatrix(matrix1, sc);

        System.out.println("\n===== Enter Matrix 2 =====");
        inputMatrix(matrix2, sc);

        System.out.println("\n===== Matrix 1 =====");
        displayMatrix(matrix1);

        System.out.println("\n===== Matrix 2 =====");
        displayMatrix(matrix2);

        subtractMatrix(matrix1, matrix2, result);

        System.out.println("\n===== Result after subtracting Matrix =====");
        displayMatrix(result);

        sc.close();
    }
}