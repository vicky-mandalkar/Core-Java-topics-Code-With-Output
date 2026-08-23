import java.util.List;
import java.util.ArrayList;
public class Example06{
	public static void main(String er[]){

		ArrayList <Integer> number1=new ArrayList<>();
		number1.add(11);
		number1.add(22);
		number1.add(33);
		number1.add(44);
		number1.add(55);

		//Array
		//ArrayList  --> Object[]
		//Object[] toArray()


		Object arr[]=number1.toArray();

		for(Object ol:arr)
			System.out.println(ol);

		System.out.println("--------------------------");
						

		Integer a[]=new Integer[number1.size()];
		Integer b[]=number1.toArray(a);

		for(Integer x:a)
			System.out.println(x);

		System.out.println("--------------------------");

		for(Integer x:b)
			System.out.println(x);

	}
}