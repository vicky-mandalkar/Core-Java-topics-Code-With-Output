/*
✅ Q8. Sort All Characters Alphabetically
Problem: Sort characters of string alphabetically.
Input: international
Output: aaeiilnnnortt
*/

import java.util.*;

class SortCharacters {
    	public static void main(String[] args) {

        	String str = "international";

        	// Convert String to char array
        	char arr[] = str.toCharArray();

        	// Sort the array
        	Arrays.sort(arr);

        	// Convert back to String
        	String sorted = new String(arr);

        	System.out.println("international ----->  :  "+sorted);
    	}
}
/*
international ----->  :  aaeiilnnnortt
*/