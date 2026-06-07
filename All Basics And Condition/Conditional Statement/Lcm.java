import java.util.Scanner;

class Lcm{
 public static void main(String[] args) {

		int n1,n2;

		Scanner scanner=new Scanner(System.in);

		System.out.println("Enter N1 :");

		n1=scanner.nextInt();

		System.out.println("Enter N2 :");

		n2=scanner.nextInt();

		System.out.println("Calculate CLM FOR  "+n1 + "  "+n2);

		// step 2 find large num

		int large;

		if(n1>n2)

			large=n1;

		else

			large=n2;

		// Whos Largest Value large

		int i=1;

		int sum=0;

		//or: incompatible types: int cannot be converted to boolean

		// C C++  while(1)

		while(true){

 

			sum=large*i;

			if(sum%n1==0 && sum%n2==0)

				break;

			i++;

		}

		System.out.println("LCM  "+sum);	

	}

}