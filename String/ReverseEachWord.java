/*
 Q13. Reverse Each Word in Sentence
Problem: Reverse each individual word in the sentence.
Input: hello i am java developer
Output: olleh i ma avaj repoleved
*/

class ReverseEachWord {

    	public static void main(String args[]) {

        	StringBuilder str = new StringBuilder("hello i am java developer");

        	// Convert StringBuilder to String and split
        	String words[] = str.toString().split(" ");
        	for (int i = 0; i < words.length; i++) {
            		StringBuilder sb = new StringBuilder(words[i]);
            		System.out.print(sb.reverse() + " ");
        	}
    	}
}
/*
olleh i ma avaj repoleved
*/