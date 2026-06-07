import java.util.Scanner;

class FunctionWithSwichCase {

    static Scanner sc = new Scanner(System.in);

    static void countDigits() {
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        if (num < 0) {
            num = -num;
        }

        int count = 0;

        if (num == 0) {
            count = 1;
        }

        while (num > 0) {
            count++;
            num = num / 10;
        }

        System.out.println("Count = " + count);
    }

    static void firstLastDigit() {
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        if (num < 0) {
            num = -num;
        }

        int last = num % 10;
        int first = num;

        while (first >= 10) {
            first = first / 10;
        }

        System.out.println("First digit = " + first);
        System.out.println("Last digit = " + last);
    }

    static void sumFirstLastDigit() {
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        if (num < 0) {
            num = -num;
        }

        int last = num % 10;
        int first = num;

        while (first >= 10) {
            first = first / 10;
        }

        int sum = first + last;

        System.out.println("Sum = " + sum);
    }

    static void sumOfDigits() {
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        if (num < 0) {
            num = -num;
        }

        int sum = 0;

        while (num > 0) {
            int rem = num % 10;
            sum = sum + rem;
            num = num / 10;
        }

        System.out.println("Sum of digits = " + sum);
    }

    static void productOfDigits() {
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        if (num < 0) {
            num = -num;
        }

        int product = 1;

        if (num == 0) {
            product = 0;
        }

        while (num > 0) {
            int rem = num % 10;
            product = product * rem;
            num = num / 10;
        }

        System.out.println("Product of digits = " + product);
    }

    static void reverseNumber() {
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int temp = num;
        int rev = 0;

        if (temp < 0) {
            temp = -temp;
        }

        while (temp > 0) {
            int rem = temp % 10;
            rev = rev * 10 + rem;
            temp = temp / 10;
        }

        if (num < 0) {
            rev = -rev;
        }

        System.out.println("Reverse = " + rev);
    }

    static void checkPalindrome() {
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        if (num < 0) {
            System.out.println("Not palindrome");
            return;
        }

        int temp = num;
        int rev = 0;

        while (temp > 0) {
            int rem = temp % 10;
            rev = rev * 10 + rem;
            temp = temp / 10;
        }

        if (num == rev) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome");
        }
    }

    static void findFactorial() {
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int fact = 1;

        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }

        System.out.println("Factorial = " + fact);
    }

    static void findFactors() {
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        System.out.println("Factors are:");

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.println(i);
            }
        }
    }

    static void menu() {
        System.out.println();
        System.out.println("========== Q1 MENU ==========");
        System.out.println("1. Count number of digits");
        System.out.println("2. Find first and last digit");
        System.out.println("3. Sum of first and last digit");
        System.out.println("4. Sum of digits");
        System.out.println("5. Product of digits");
        System.out.println("6. Reverse a number");
        System.out.println("7. Check palindrome");
        System.out.println("8. Find factorial");
        System.out.println("9. Find factors of a number");
        System.out.println("10. Exit");
        System.out.println("=============================");
    }

    public static void main(String[] args) {
        int choice;

        do {
            menu();

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    countDigits();
                    break;

                case 2:
                    firstLastDigit();
                    break;

                case 3:
                    sumFirstLastDigit();
                    break;

                case 4:
                    sumOfDigits();
                    break;

                case 5:
                    productOfDigits();
                    break;

                case 6:
                    reverseNumber();
                    break;

                case 7:
                    checkPalindrome();
                    break;

                case 8:
                    findFactorial();
                    break;

                case 9:
                    findFactors();
                    break;

                case 10:
                    System.out.println("Exit");
                    break;

                default:
                    System.out.println("Wrong choice");
            }

        } while (choice != 10);

        sc.close();
    }
}