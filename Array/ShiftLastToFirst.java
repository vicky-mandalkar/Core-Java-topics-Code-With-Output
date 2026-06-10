import java.util.Scanner;

class ShiftLastToFirst {

    // Input function
    static void input(int arr[], Scanner sc) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element at index " + i + ": ");
            arr[i] = sc.nextInt();
        }
    }

    // Shift last element to first
    static void shift(int arr[]) {

        int last = arr[arr.length - 1];

        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }

        arr[0] = last;
    }

    static void print(int arr[]) {
    	for (int i = 0; i < arr.length; i++) {
        	System.out.print(arr[i] + " ");
    	}
    	System.out.println();
  }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("\nEnter array elements:");
        input(arr, sc);

        System.out.print("\nBefore: ");
        print(arr);

        shift(arr);

        System.out.print("After : ");
        print(arr);

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
C:\Java Practice Program (VM)\Array>javac ShiftLastToFirst.java

C:\Java Practice Program (VM)\Array>java

C:\Java Practice Program (VM)\Array>java ShiftLastToFirst
Enter array size: 5

Enter array elements:
Enter element at index 0: 10
Enter element at index 1: 20
Enter element at index 2: 30
Enter element at index 3: 40
Enter element at index 4: 50

Before: 10 20 30 40 50
After : 50 10 20 30 40
*/