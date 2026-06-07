class FirstAndLastSum{
	public static void main(String args[]){
		int num=3456;
		int firstDigit; 		

		int LastDigit=num%10;

		while(num>=10){
			num=num/10;	
		}
		firstDigit=num;

		System.out.println("First digit is :"+firstDigit);
		System.out.println("Last  digit is :"+LastDigit);
		int sum=firstDigit+LastDigit;
		System.out.println("Sum Of First And Last :"+ sum);
	}
}
/*
First digit is :3
Last  digit is :6
Sum Of First And Last :9
*/