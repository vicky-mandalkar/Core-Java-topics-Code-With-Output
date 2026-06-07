import java.util.Scanner;

class Program3{
 public static void main(String[] args) {

		int year;

		Scanner scanner=new Scanner(System.in);

		System.out.println("Enter Year:");
		year=scanner.nextInt();

		String Msg=(year % 400 ==0)||(year % 4 ==0 && year%100 != 0) ? "leap year" : "Not leap year";
		System.out.print(Msg);
			

	}

}