class Example2{
	public static void  main(String args[]){
		int num=5434;
		int last=num%10;
  		System.out.println("Number is :  :"+num);
		System.out.println("Last DIgit :"+last);

		while(num>10){
			num=num/10;
			
		}
		System.out.println("First Digit "+num);
		

	}

}
//Last DIgit :1234
//First Digit 1