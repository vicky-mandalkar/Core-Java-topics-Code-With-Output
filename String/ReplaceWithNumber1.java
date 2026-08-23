/*
✅ Q6. Replace Vowels in Reverse with Vowel Count
Problem: Replace vowels (right to left) with the order they appear.
Input: International
Output: 6nt5rn4t32n1l
*/

class ReplaceWithNumber1 { 
	public static void main(String ar[]) { 
		StringBuilder sb=new StringBuilder();
        	String str = "International".toUpperCase();
		int count=0;
		char ch;
        	for(int i=0;i<str.length();i++){
			ch=str.charAt(i);
			if(ch=='A' || ch=='E'|| ch=='I' || ch=='O' || ch=='U'){
				count++;
			}
		}
		System.out.println("Count Is : "+count);

		for(int i=0;i<str.length();i++){
			ch=str.charAt(i);
			if(ch=='A' || ch=='E'|| ch=='I' || ch=='O' || ch=='U'){
				sb.append(count--);
			}else{
				sb.append(ch);
			}
			
		}
		System.out.println(str+" ----> "+sb);
   	} 
}

/*
Count Is : 6
INTERNATIONAL ----> 6NT5RN4T32N1L
*/