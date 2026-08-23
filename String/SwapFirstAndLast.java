/*
✅ Q17. Swap First and Last Letter of Each Word
Problem: Swap the first and last character of each word.
Input: hello i am java developer
Output: oellh i ma avaj revelopd
(Note: Your example was a little off. The output should reflect actual swap.)
*/

class SwapFirstAndLast {
    	static void swapping(String words[]) {
        	for (int i = 0; i < words.length; i++) {
            		// If the word has only one character, print it as it is.
            		if (words[i].length() == 1) {
                		System.out.print(words[i] + " ");
            		} else {
                		System.out.print(
                        		words[i].charAt(words[i].length() - 1)
                        		+ words[i].substring(1, words[i].length() - 1)
                        		+ words[i].charAt(0)	+ "\t");
            }
        }
    }
    public static void main(String args[]) {
        String sentence = "hello i am java developer";
        String words[] = sentence.split(" ");
        swapping(words);
    }
}
/*
oellh   i ma    aavj    reveloped
*/