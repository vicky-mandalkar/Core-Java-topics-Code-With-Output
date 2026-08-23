/*
✅ Q2. Shift Last Character to First
Problem: Move the last character of the string to the front.
Input: India
Output: aIndi
*/
class MoveLastCharToFirst{
	public static void main(String ar[]){
		String str="India";
		String res=str.charAt(4)+str.substring(0,4);
		System.out.println("India -------> :  "+res);
	}
}
/*
India -------> :  aIndi
*/