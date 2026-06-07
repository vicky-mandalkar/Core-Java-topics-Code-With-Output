import java.util.Scanner;

class Program4{
 public static void main(String[] args) {

		int num;

		Scanner scanner=new Scanner(System.in);

		System.out.println("Enter Number :");
		num=scanner.nextInt();
			
		String res=(num%2==0)? num+"Number is Even":num+"number is odd ";
		System.out.print(res);

	}

}