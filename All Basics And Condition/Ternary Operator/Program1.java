import java.util.Scanner;

class Program1{
 public static void main(String[] args) {

		int n1,n2,n3;

		Scanner scanner=new Scanner(System.in);

		System.out.println("Enter N1 :");-->//23
		n1=scanner.nextInt();

		System.out.println("Enter N2 :");-->//34
		n2=scanner.nextInt();
		
		System.out.println("Enter N3 :");-->//11
		n3=scanner.nextInt();


		int large=(n1>n2 && n1>n3)  ? n1 : (n2>n3) ? n2 : n3;
		System.out.print("Large :"+large);
				

			

	}

}