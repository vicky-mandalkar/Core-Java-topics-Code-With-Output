<<<<<<< HEAD
import java.util.Scanner;

class ShiftLastToFirstWithoutThirdVariable {

    // Input elements
    static void inputElement(int arr[], Scanner sc) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element at index " + i + " : ");
            arr[i] = sc.nextInt();
        }
    }

    // Print array
    static void printElement(int arr[]) {
        System.out.print("Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Shift last element to first position
    static void shiftLastToFirst(int arr[]) {

        int last = arr[arr.length - 1];

        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }

        arr[0] = last;
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

       	System.out.print("Enter array size: ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("\nEnter array elements:");
        inputElement(arr, sc);

        System.out.println("\nBefore Shift:");
        printElement(arr);

        shiftLastToFirst(arr);

        System.out.println("\nAfter Shift:");
        printElement(arr);

        sc.close();
    }
}

/*
Enter Array Size :
5
=========INPUTELEMENT==============
Enter 0th Element :
10
Enter 1th Element :
20
Enter 2th Element :
30
Enter 3th Element :
40
Enter 4th Element :
50
=========PRINT ELEMENT============
Index 0th  Element is : 10
Index 1th  Element is : 20
Index 2th  Element is : 30
Index 3th  Element is : 40
Index 4th  Element is : 50
=========Shift First to Last =======
 Aftar Swap Element
20 30 40 50 10
*/
=======
import java.util.Scanner;

class ShiftLastToFirstWithoutThirdVariable {

    // Input elements
    static void inputElement(int arr[], Scanner sc) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element at index " + i + " : ");
            arr[i] = sc.nextInt();
        }
    }

    // Print array
    static void printElement(int arr[]) {
        System.out.print("Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Shift last element to first position
    static void shiftLastToFirst(int arr[]) {

        int last = arr[arr.length - 1];

        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }

        arr[0] = last;
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

       	System.out.print("Enter array size: ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("\nEnter array elements:");
        inputElement(arr, sc);

        System.out.println("\nBefore Shift:");
        printElement(arr);

        shiftLastToFirst(arr);

        System.out.println("\nAfter Shift:");
        printElement(arr);

        sc.close();
    }
}

/*
Enter Array Size :
5
=========INPUTELEMENT==============
Enter 0th Element :
10
Enter 1th Element :
20
Enter 2th Element :
30
Enter 3th Element :
40
Enter 4th Element :
50
=========PRINT ELEMENT============
Index 0th  Element is : 10
Index 1th  Element is : 20
Index 2th  Element is : 30
Index 3th  Element is : 40
Index 4th  Element is : 50
=========Shift First to Last =======
 Aftar Swap Element
20 30 40 50 10
*/
>>>>>>> 209d7a204d30a9b82fd17bcc52287fc7f1b2cf9a
