/*
✅ Q12. Sort Words by Length
Problem: Sort words based on their length (shortest to longest).
Input: hello i am java developer
Output: i am java hello developer
*/

import java.util.*;
class SortLenght{
	public static void main (String args[]){
		String str="hello i am java developer";
		String word[] = str.split(" ");
        	String temp;
		
		for(int i=0;i<word.length;i++){
			for(int j=i+1;j<word.length;j++){
				if(word[j].length() < word[i].length()){
					temp=word[j];
					word[j]=word[i];
					word[i]=temp;
				}
			}
		}

		for(int i=0;i<word.length;i++){
			System.out.println(word[i]+"\t");
		}
	}
}
/*
i
am
java
hello
developer
*/