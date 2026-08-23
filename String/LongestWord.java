/*
✅ Q10. Find the Longest Word
Problem: Print the longest word in a sentence.
Input: welcome to international airport
Output: international
*/

class LongestWord {
    	public static void main(String ar[]) {
        	String sent = "welcome to international airport ";
        	String arr[] = sent.split(" ");
        	String longestWord = "";
        
        	for (int i = 0; i < arr.length; i++) {
            		if (arr[i].length() > longestWord.length()) {
                		longestWord = arr[i];
            		}
        	}
        
        	System.out.println("Output: " + longestWord);
    	}
}
/*
Word Count is : 5
*/