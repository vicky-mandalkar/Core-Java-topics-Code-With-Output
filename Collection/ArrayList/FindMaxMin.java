//Write a   Java  program to find maximum and minimum elements in an array.     
  

import java.util.ArrayList;
class FindMaxMin{

	public static void MaxFind(ArrayList<Integer> a1){
		int max=a1.get(0);
		for(int i=1;i<a1.size();i++){
			if(max<a1.get(i)){
			    max=a1.get(i);
			} 
		}
		System.out.println("Max : "+max);
	}

	public static void MinFind(ArrayList<Integer> a1){
		int min=a1.get(0);
		for(int i=1;i<a1.size();i++){
			if(min>a1.get(i)){
			    min=a1.get(i);
			} 
		}
		System.out.println("Min : "+min);
	}
 
	public static void main(String ar[]){
		ArrayList<Integer> a1=new ArrayList<>();
		a1.add(11);
		a1.add(22);
		a1.add(33);
		a1.add(44);
		a1.add(55);
		//System.out.print(a1.get(0));
		MaxFind(a1);
		MinFind(a1);
	
				
	
	}
}
