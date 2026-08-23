/*
Q3. Swap First and Last Characters
Problem: Swap the first and last characters of the string.
Input: India
Output: andiI
*/
class SwapFirstToLast{
	public static void main(String ar[]){
		String str="India";
		//String res=str.charAt(4)+str.substring(1,4)+str.charAt(0);
		String res=str.charAt(4)+str.substring(1,4)+str.charAt(0); 
		System.out.println("India -------> :  "+res);
	}
}
/*
India -------> :  andiI
*/