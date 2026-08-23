<<<<<<< HEAD
import java.util.Scanner;

class TwoDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int arr[][] = new int[rows][cols];

        // Input elements
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                System.out.print("Enter element [" + i + "][" + j + "]: ");
                arr[i][j] = sc.nextInt();
            }
        }

        // Display elements
        System.out.println("\nArray Elements:");

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }


	/* arr[1][2] = 999;
        // Display elements
        System.out.println("\nAfter update");

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        } */

    }
}
/*
Enter number of rows: 3
Enter number of columns: 3
Enter element [0][0]: 11
Enter element [0][1]: 22
Enter element [0][2]: 33
Enter element [1][0]: 44
Enter element [1][1]: 55
Enter element [1][2]: 66
Enter element [2][0]: 77
Enter element [2][1]: 88
Enter element [2][2]: 99

Array Elements:
11      22      33
44      55      66
77      88      99
=======
import java.util.Scanner;

class TwoDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int arr[][] = new int[rows][cols];

        // Input elements
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                System.out.print("Enter element [" + i + "][" + j + "]: ");
                arr[i][j] = sc.nextInt();
            }
        }

        // Display elements
        System.out.println("\nArray Elements:");

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
/*
Enter number of rows: 3
Enter number of columns: 3
Enter element [0][0]: 11
Enter element [0][1]: 22
Enter element [0][2]: 33
Enter element [1][0]: 44
Enter element [1][1]: 55
Enter element [1][2]: 66
Enter element [2][0]: 77
Enter element [2][1]: 88
Enter element [2][2]: 99

Array Elements:
11      22      33
44      55      66
77      88      99
>>>>>>> 209d7a204d30a9b82fd17bcc52287fc7f1b2cf9a
*/