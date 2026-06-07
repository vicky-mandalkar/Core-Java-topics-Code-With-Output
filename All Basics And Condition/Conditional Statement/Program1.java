import java.util.Scanner;

class Program1{
 public static void main(String[] args) {

		int n1,n2,n4,n3;

		Scanner scanner=new Scanner(System.in);

		System.out.println("Enter N1 :");
		n1=scanner.nextInt();

		System.out.println("Enter N2 :");
		n2=scanner.nextInt();
		
		System.out.println("Enter N3 :");
		n3=scanner.nextInt();


		int large=(n1>n2 && n1>n3 || n2>n1 && n2>n3 || n3>n1 && n3>n2 );
		System.out.println("Large from three :"+n1);
		System.out.println("Large from three :"+n2);
		System.out.println("Large from three :"+n3);

			

	}

}