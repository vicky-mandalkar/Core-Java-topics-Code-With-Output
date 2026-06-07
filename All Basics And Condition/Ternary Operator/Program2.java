import java.util.Scanner;

class Program2{
 public static void main(String[] args) {

		int n1,n2,n3 ,n4;

		Scanner scanner=new Scanner(System.in);

		System.out.println("Enter N1 :");
		n1=scanner.nextInt();

		System.out.println("Enter N2 :");
		n2=scanner.nextInt();
		
		System.out.println("Enter N3 :");
		n3=scanner.nextInt();

		System.out.println("Enter N4 :");
		n4=scanner.nextInt();


		int large=(n1>n2 && n1>n3 && n1>n4) ? n1 : (n2>n3 && n2> n4 ) ? n2 : (n3>n4) ? n3 : n4 ;
		System.out.print("Large :"+large);
				

			

	}

}