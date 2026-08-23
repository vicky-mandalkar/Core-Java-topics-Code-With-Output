/*
✅ Q15. Append Length of Each Word

Problem: Add length of each word at the end of the word.

Input: hello i am java developer

Output: hello5 i1 am2 java4 developer9

*/
class AppendWithLength{

	static void AppendLength(String word[]){
		for(int i=0;i<word.length;i++){
			System.out.print(word[i] + word[i].length()+"\t");
		}
	}
	

	public static void main(String ar[]){
		String sent="hello i am java developer";
		String word[]=sent.split(" ");
		AppendLength(word);
	}
}
/*
hello5  i1      am2     java4   developer9
*/