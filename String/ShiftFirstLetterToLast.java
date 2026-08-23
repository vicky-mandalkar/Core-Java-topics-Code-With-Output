/*
✅ Q16. Shift First Letter of Each Word to the End

Problem: Move first character of every word to the end.

Input: hello i am java developer

Output: elloh i ma avaj eveloperd

*/
class ShiftFirstLetterToLast{

	static void Shifting(String word[]){
		for(int i=0;i<word.length;i++){
			//(word[i].charAt(0))
			System.out.print((word[i].substring(1))+(word[i].charAt(0))  +"\t");

		}

	}

	public static void main(String ar[]){
		String sent="hello i am java developer";
		String word[]=sent.split(" ");
		Shifting(word);

	}

}
/*
h       i       a       j       d
ello            m       ava     eveloper
*/