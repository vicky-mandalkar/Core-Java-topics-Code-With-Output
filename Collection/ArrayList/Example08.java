
import java.util.ArrayList;
public class Example08{
	public static void main(String er[]){


		ArrayList <String> movie1=new ArrayList<>();
		ArrayList <String> movie2=new ArrayList<>();

		movie1.add("300");
		movie1.add("500");
		movie1.add("Dhurander");
		movie1.add("Welcome");
		movie1.add("Animal");

		movie2.add("Murder");
		movie2.add("Gajani");
		movie2.add("Welcome");
		movie2.add("Sirf Tum");
		movie2.add("500");
		
		System.out.println("movie1 : "+movie1);
		System.out.println("movie2 : "+movie2);
		movie1.retainAll(movie2);
		System.out.println("movie1 : "+movie1);

		
				

	}
}
/*
movie1 : [300, 500, Dhurander, Welcome, Animal]
movie2 : [Murder, Gajani, Welcome, Sirf Tum, 500]
movie1 : [500, Welcome]

*/