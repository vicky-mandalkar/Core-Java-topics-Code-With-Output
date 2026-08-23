//Write a   Java  program to find the sum of all array elements.   

import java.util.ArrayList;
class SumOfArrayList{
	public static void main(String ar[]){
		ArrayList<Integer> a1=new ArrayList<>();
		a1.add(11);
		a1.add(22);
		a1.add(33);
		a1.add(44);
		a1.add(55);
		
		int sum=0;
		for(int i=0;i<a1.size();i++){
			sum=sum+a1.get(i);
		}
		System.out.print("Sum : "+sum);

	}
	
	

}