/*
✅ Q9. Count Words in a Sentence
Problem: Count the number of words in a sentence.
Input: hello i am java developer
Output: 5



✅ Q10. Find the Longest Word
Problem: Print the longest word in a sentence.
Input: welcome to international airport
Output: international
*/

class  WordCount{
	public static void main(String ar[]){
		String sent="hello i am java developer";
		int count=0;
		String arr[]=sent.split(" ");

		for(int i=0;i<arr.length;i++){
			count++;
		}
		System.out.println("Word Count is : "+count);	
	}
}
/*
Word Count is : 5
*/