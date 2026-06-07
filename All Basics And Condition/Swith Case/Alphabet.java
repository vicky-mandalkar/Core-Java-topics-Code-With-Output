import java.util.Scanner;

class Alphabet{
 public static void main(String[] args) {

		char alpha;

		Scanner scanner=new Scanner(System.in);


		System.out.println("Enter Day Number:");
		alpha = scanner.next().charAt(0);
		
		if(!(alpha >='a' && alpha <='z'  || alpha >='A' && alpha <='Z')){
			System.out.println("You entered invalid input");
			System.out.println("Thank You..");
			System.exit(0);
		}

		switch(alpha){

			case 'A' :
				System.out.println("vowel..!");
				break;

			case 'E' :
				System.out.println("vowel..!");
				break;

			case 'I':
				System.out.println("vowel..!");
				break;

			case 'O' :
				System.out.println("vowel..!");
				break;

			case 'U' :
				System.out.println("vowel..!");
				break;
			case 'a' :
				System.out.println("vowel..!");
				break;

			case 'e' :
				System.out.println("vowel..!");
				break;

			case 'i':
				System.out.println("vowel..!");
				break;

			case 'o' :
				System.out.println("vowel..!");
				break;

			case 'u' :
				System.out.println("vowel..!");
				break;
			
			default :
				System.out.println("  Consonant ..!"+alpha);

		}
					

	}

}