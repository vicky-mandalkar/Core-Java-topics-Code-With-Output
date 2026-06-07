import java.util.Scanner;

class Calculator {
    public static void main(String[] args) {

        double n1, n2, res;
        char choice, letter;

        Scanner scanner = new Scanner(System.in);

        do {

            System.out.println("Enter Number n1 :");
            n1 = scanner.nextDouble();

            System.out.println("Enter Number n2 :");
            n2 = scanner.nextDouble();

            System.out.println("***MENU***");
            System.out.println(" + ");
            System.out.println(" - ");
            System.out.println(" * ");
            System.out.println(" / ");

            System.out.println("Enter Your Symbol :");
            choice = scanner.next().charAt(0);

            switch (choice) {

                case '+':
                    res = n1 + n2;
                    System.out.println("Num1 = " + n1);
                    System.out.println("Num2 = " + n2);
                    System.out.printf("Result = %.2f\n", res);
                    break;

                case '-':
                    res = n1 - n2;
                    System.out.println("Num1 = " + n1);
                    System.out.println("Num2 = " + n2);
                    System.out.printf("Result = %.2f\n", res);
                    break;

                case '*':
                    res = n1 * n2;
                    System.out.println("Num1 = " + n1);
                    System.out.println("Num2 = " + n2);
                    System.out.printf("Result = %.2f\n", res);
                    break;

                case '/':
                    res = n1 / n2;
                    System.out.println("Num1 = " + n1);
                    System.out.println("Num2 = " + n2);
                    System.out.printf("Result = %.2f\n", res);
                    break;

                default:
                    System.out.println("Enter Valid Input...");
            }

            System.out.println("DO YOU WANT TO CONTINUE... Y OR y");
            letter = scanner.next().charAt(0);

        } while (letter == 'Y' || letter == 'y');

        System.out.println("******** END ********");
    }
}
/*
Enter Number n1 :
12
Enter Number n2 :
23
***MENU***
 +
 -
 *
 /
Enter Your Symbol :
*
Num1 = 12.0
Num2 = 23.0
Result = 276.00
DO YOU WANT TO CONTINUE... Y OR y
no
******** END ********
*/