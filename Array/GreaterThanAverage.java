/*
Array Case 6: Elements Greater than Average
 
Find the average of the array, and then display all elements that are greater than this average.
 
Example Input:
Array = [3, 7, 9, 2, 6]
 
Step 1: Average = (3+7+9+2+6)/5 = 27/5 = 5.4
Step 2: Elements greater than 5.4 â†’ 7, 9, 6
 
Expected Output:
Average = 5.4
Elements greater than average = 7 9 6

*/


import java.util.Scanner;

class GreaterThanAverage {

    // Enter input elements in array
    static void inputArray(int arr[], Scanner sc) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter " + i + " Array Element : ");
            arr[i] = sc.nextInt();
        }
    }

    // Print array elements
    static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Index " + i + " Element is : " + arr[i]);
        }
    }

    // Calculate Average
    static double Average(int arr[]) {

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        System.out.println("Sum Of Array Elements : " + sum);

        double avg = (double) sum / arr.length;

        System.out.println("Average Of Array Elements : " + avg);

        return avg;
    }

    // Elements Greater Than Average
    static void GreaterAverage(double avg, int arr[]) {

        System.out.print("Elements Greater Than Average : ");

        boolean found = false;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > avg) {
                System.out.print(arr[i] + " ");
                found = true;
            }
        }

        if (!found) {
            System.out.print("No Elements Found");
        }

        System.out.println();
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Array Size : ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("\n=========== INPUT ELEMENTS ===========");
        inputArray(arr, sc);

        System.out.println("\n=========== ARRAY ELEMENTS ===========");
        print(arr);

        System.out.println("\n=========== AVERAGE ===========");
        double avg = Average(arr);

        System.out.println("\n=========== GREATER THAN AVERAGE ===========");
        GreaterAverage(avg, arr);

        sc.close();
    }
}
/*
Enter Array Size :
6

=========== INPUT ELEMENTS ===========
Enter 0 Array Element : 1
Enter 1 Array Element : 2
Enter 2 Array Element : 3
Enter 3 Array Element : 4
Enter 4 Array Element : 5
Enter 5 Array Element : 6

=========== ARRAY ELEMENTS ===========
Index 0 Element is : 1
Index 1 Element is : 2
Index 2 Element is : 3
Index 3 Element is : 4
Index 4 Element is : 5
Index 5 Element is : 6

=========== AVERAGE ===========
Sum Of Array Elements : 21
Average Of Array Elements : 3.5

=========== GREATER THAN AVERAGE ===========
Elements Greater Than Average : 4 5 6
*/