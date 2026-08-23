import java.util.ArrayList;
public class Example03{
	public static void main(String er[]){
		ArrayList<Integer>list=new ArrayList<>();
		list.add(11);
		list.add(22);
		list.add(33);
		list.add(11);
		list.add(44);
	
		System.out.println(list);

		for(int i=0;i<list.size();i++)
			System.out.println(list.get(i));	
		

		for(Integer num : list)
			System.out.println(num);

		System.out.println("isEmpty "+list.isEmpty());

		System.out.println(list.contains(11));

		System.out.println(list.remove(Integer.valueOf(11)));
		

	}
}