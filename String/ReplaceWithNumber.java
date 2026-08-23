/*
✅ Q5. Replace Vowels with Vowel Count
Problem: Replace vowels with the order they appear.
Input: International
Output: 1nt2rn3t45n6l
*/

class ReplaceWithNumber { 
	public static void main(String ar[]) { 
		StringBuilder sb=new StringBuilder();
        	String str = "International".toUpperCase();
		int count=1;
		char ch;
        
		for(int i=0;i<str.length();i++){
			ch=str.charAt(i);
			if(ch=='A' || ch=='E'|| ch=='I' || ch=='O' || ch=='U'){
				sb.append(count++);
			}else{
				sb.append(ch);
			}
			
		}
		System.out.println(str+" ----> "+sb);
   	} 
}

/*
INTERNATIONAL ----> 1NT2RN3T45N6L
*/