/*
✅ Q1. Shift First Character to Last
Problem: Move the first character of the string to the end.
Input: India
Output: ndiaI
*/
import java.*;
class ShiftFirstCharToLast{
	
	
	public static void main(String ar[]){
		String str="India";
		String res=str.substring(1)+str.charAt(0);
		System.out.println("India -------> :  "+res);
	}
}
/*
India -------> :  ndiaI
*/