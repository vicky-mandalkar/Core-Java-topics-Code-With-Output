/*
✅ Q7. Move Vowels to End (Sorted), Keep Consonants First
Problem: Separate consonants and vowels. Keep consonants in order and append sorted vowels.
Input: International
Output: ntrntnlAaeio

*/
import java.util.*;
import java.util.*;

class MoveVowelToLast {

    	public static void main(String args[]) {

        	StringBuilder vowel = new StringBuilder();
        	StringBuilder consonant = new StringBuilder();

        	String str = "International".toUpperCase();
	
        	for(int i = 0; i < str.length(); i++) {

            		char ch = str.charAt(i);

            		if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
                		vowel.append(ch);
            		else
                		consonant.append(ch);
        	}

        	// Convert StringBuilder to char array
        	char arr[] = vowel.toString().toCharArray();

        	// Sort vowels
        	Arrays.sort(arr);

        	// Final Answer
        	StringBuilder ans = new StringBuilder();

        	ans.append(consonant);

        	for(char c : arr)
            		ans.append(c);

        	System.out.println("International --->  :  "+ans);
    	}
}
/*
International --->  :  NTRNTNLAAEIIO
*/