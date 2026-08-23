/*
✅ Q11. Sort Words Lexicographically
Problem: Sort all words in dictionary (alphabetical) order.
Input: hello i am java developer
Output: am developer hello i java
*/

import java.util.*;;

class SortWord{
	public static void main(String er[]){
		String str = "hello i am java developer";

        	// Split sentence into words
        	String words[] = str.split(" ");

        	// Sort the words
        	Arrays.sort(words);

        	// Print sorted words
        	for(String word : words) {
            		System.out.print(word + " ");
        	}

	}
	
}
