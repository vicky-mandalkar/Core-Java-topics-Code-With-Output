class Example5{
	public static void  main(String args[]){
		int num=53235;
		int original=num;
		int rev=0;

		while(num>0){
			int rem=num%10;
			rev=(rev*10)+rem;
			//sum=sum+rem;
			num=num/10;
			
		}
		if(rev==original){
		System.out.println(rev+" Is Palindrom");
		}

	}

}
//53235 Is Palindrom