// Write a   Java  program to count the total number of even and odd elements in an array.

import java.util.ArrayList;
class FindEvenOddCount{

	public static void EvenOddCount(ArrayList<Integer> a1){
		int evenCnt=0;
		int oddCnt=0;
		for(int i=0;i<a1.size();i++){
			if(a1.get(i) % 2 ==0){
			    evenCnt++;
			} 
			else{
			    oddCnt++;
			}
		}
		System.out.println("Even Count: "+evenCnt);
		System.out.println("Odd Count : "+oddCnt);
	}

	public static void main(String ar[]){
		ArrayList<Integer> a1=new ArrayList<>();
		a1.add(11);
		a1.add(22);
		a1.add(33);
		a1.add(44);
		a1.add(55);
	    a1.add(66);
	    a1.add(77);
	    a1.add(88);
		//System.out.print(a1.get(0));
		EvenOddCount(a1);
	}
}
// Even Count: 4
// Odd Count : 4