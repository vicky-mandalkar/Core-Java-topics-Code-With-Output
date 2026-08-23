/*
✅ Q4. Count Vowels in a String
Problem: Count the number of vowels in the string.
Input: Education
Output: 5
*/

class CountVowel { 
	public static void main(String ar[]) { 
        	String str = "Education".toLowerCase(); // Convert entire string up front
        	int count = 0; 
        
        	for (int i = 0; i < str.length(); i++) { 
           		char ch = str.charAt(i); 
            		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') { 
                		count++; 
            		} 
        	} 
    		System.out.println("Output: " + count); 
   	} 
}

/*
Output: 5
*/