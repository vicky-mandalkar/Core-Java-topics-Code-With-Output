import java.util.Scanner;

class Example16 {
    public static void main(String arg[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        // Keep only first two digits
        while(n >= 100) {
            n = n / 10;
        }

        int secondDigit = n % 10;

        System.out.println("Second digit from left is: " + secondDigit);

        sc.close();
    }
}
/*
Enter number: 12345
Second digit from left is: 2
*/