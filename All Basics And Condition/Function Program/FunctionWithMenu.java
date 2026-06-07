import java.util.Scanner;

class FunctionWithMenu{

    static Scanner sc = new Scanner(System.in);

    static int countDigits(int num) {
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

        return count;
    }

    static int powerOfTen(int count) {
        int power = 1;

        for (int i = 1; i <= count; i++) {
            power = power * 10;
        }

        return power;
    }

    static void lastDigit() {
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        if (num < 0) {
            num = -num;
        }

        int last = num % 10;

        System.out.println("Last digit = " + last);
    }

    static void secondLastDigit() {
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        if (num < 0) {
            num = -num;
        }

        if (num < 10) {
            System.out.println("Second last digit not available");
            return;
        }

        num = num / 10;
        int secondLast = num % 10;

        System.out.println("Second last digit = " + secondLast);
    }

    static void firstDigit() {
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        if (num < 0) {
            num = -num;
        }

        while (num >= 10) {
            num = num / 10;
        }

        System.out.println("First digit = " + num);
    }

    static void secondDigitFromLeft() {
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        if (num < 0) {
            num = -num;
        }

        if (num < 10) {
            System.out.println("Second digit not available");
            return;
        }

        while (num >= 100) {
            num = num / 10;
        }

        int second = num % 10;

        System.out.println("Second digit from left = " + second);
    }

    static void shiftFirstDigitToLast() {
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        if (num < 0) {
            System.out.println("Enter positive number only");
            return;
        }

        if (num < 10) {
            System.out.println("Result = " + num);
            return;
        }

        int digits = countDigits(num);
        int power = powerOfTen(digits - 1);

        int first = num / power;
        int remaining = num % power;

        int result = remaining * 10 + first;

        System.out.println("Result = " + result);
    }

    static void shiftLastDigitToFirst() {
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        if (num < 0) {
            System.out.println("Enter positive number only");
            return;
        }

        if (num < 10) {
            System.out.println("Result = " + num);
            return;
        }

        int last = num % 10;
        int remaining = num / 10;

        int digits = countDigits(remaining);
        int power = powerOfTen(digits);

        int result = last * power + remaining;

        System.out.println("Result = " + result);
    }

    static void appendOneNumberToAnother() {
        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int digits = countDigits(b);
        int power = powerOfTen(digits);

        int result = a * power + b;

        System.out.println("Result = " + result);
    }

    static void menu() {
        System.out.println();
        System.out.println("========== Q2 MENU ==========");
        System.out.println("1. Find last digit");
        System.out.println("2. Find second last digit");
        System.out.println("3. Find first digit");
        System.out.println("4. Find second digit from left");
        System.out.println("5. Shift first digit to last");
        System.out.println("6. Shift last digit to first");
        System.out.println("7. Append one number to another");
        System.out.println("8. Exit");
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
                    lastDigit();
                    break;

                case 2:
                    secondLastDigit();
                    break;

                case 3:
                    firstDigit();
                    break;

                case 4:
                    secondDigitFromLeft();
                    break;

                case 5:
                    shiftFirstDigitToLast();
                    break;

                case 6:
                    shiftLastDigitToFirst();
                    break;

                case 7:
                    appendOneNumberToAnother();
                    break;

                case 8:
                    System.out.println("Exit");
                    break;

                default:
                    System.out.println("Wrong choice");
            }

        } while (choice != 8);

        sc.close();
    }
}