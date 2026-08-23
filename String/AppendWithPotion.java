/*
✅ Q14. Append Word Position to Each Word

Problem: Append word number (starting from 1) to each word.

Input: hello i am java developer

Output: hello1 i2 am3 java4 developer5

*/
class AppendWithPotion{

	static void Append(String word[]){
		int cnt=0;
		for(int i=0;i<word.length;i++){
			System.out.print(word[i]+(++cnt)+"\t");
		}

	}
	public static void main(String er[]){

		String sent="hello i am java developer";
		String word[]=sent.split(" ");
		Append(word);
	}

}