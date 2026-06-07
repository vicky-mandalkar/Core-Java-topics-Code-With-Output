class FirstAndLastDigit{

	public static void  main(String args[]){

		int num=23451;
		
		int last=num%10;
		
		while(num>=10){
			num=num/10;
		}
		int first=num;
	
		System.out.println("First digit is :"+first);
		System.out.println("Last Digit is  :"+last);
		
	}
}
//First digit is :2
//Last Digit is  :1