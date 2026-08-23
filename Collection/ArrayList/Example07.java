
import java.util.ArrayList;
public class Example07{
	public static void main(String er[]){


		ArrayList <String> number1=new ArrayList<>();
		number1.add(11);
		number1.add(22);
		number1.add(33);
		number1.add(44);
		number1.add(55);

		ArrayList <Integer> number2=new ArrayList<>();
		number2.add(33);
		number2.add(44);
		number2.add(55);
		number2.add(66);
		number2.add(77);
		
		System.out.println("Number1 : "+number1);
		System.out.println("Number2 : "+number2);

		number1.addAll(number2);
		System.out.println("Number1 : "+number1);

		System.out.println(number1.containsAll(number2));

		number1.removeAll(number2);
		System.out.println("Number1 : "+number1);
		System.out.println("Number2 : "+number2);
				

	}
}