// Online Java Compiler
import java.util.Scanner;
class Example10 {
	public static void main(String arg[]) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number  :");
		int n = sc.nextInt();


		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				System.out.println("is not");
				break;
			} else {
				System.out.println("is prime");
				break;
			}
		}

	}

}
/*

Enter Number  :11
is prime
*/