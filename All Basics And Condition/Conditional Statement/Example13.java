import java.util.Scanner;

class Example13 {
    public static void main(String arg[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n1: ");
        int n1 = sc.nextInt();

        int lastDigit=n1%10;
	System.out.println("lastDigit : "+lastDigit);
    }
}
/*
Enter n1: 12345432
lastDigit : 2
*/