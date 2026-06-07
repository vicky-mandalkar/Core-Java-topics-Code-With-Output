class ProductOfNum{

	public static void  main(String args[]){


		int num=23451;
		int rem;
		int pro=1;
		while(num>0){
			rem=num%10;
			pro=pro*rem;
			num=num/10;
			
		}
		System.out.print("Product of number is :"+pro);
	}
}
//Product of number is :120