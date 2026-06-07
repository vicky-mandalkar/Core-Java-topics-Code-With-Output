import java.util.Scanner;

class Program5{
 public static void main(String[] args) {

		char ch; 

		Scanner scanner=new Scanner(System.in);

		System.out.println("Enter Number :");
		ch=scanner.next().charAt(0);
			
		String res=(ch>='A' && ch<='Z' || ch>='a' && ch<='z' )? ch+" is character alphabet" : ch+" is Not character alphabet";
		System.out.print(res);

	}

}
/*
Enter Number :
A
A is character alphabet
*/