import java.util.ArrayList;
import java.util.Iterator;
public class IteratorEx01{
	public static void main(String er[]){


		ArrayList <String> movie1=new ArrayList<>();
		
		movie1.add("300");
		movie1.add("500");
		movie1.add("Dhurander");
		movie1.add("Welcome");
		movie1.add("Animal");

		Iterator<String> itr=movie1.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());	
		}		
		
		
				

	}
}
