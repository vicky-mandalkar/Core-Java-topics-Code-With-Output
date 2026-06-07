class Example4{
	public static void  main(String args[]){
		int num=5434;
		
		int rev=0;

		while(num>0){
			int rem=num%10;
			rev=(rev*10)+rem;
			//sum=sum+rem;
			num=num/10;
			
		}
		System.out.println("reverse NUmber : "+rev);
		

	}

}
//reverse NUmber : 4345