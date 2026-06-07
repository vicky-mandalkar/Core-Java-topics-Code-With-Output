class SumOfDigit{
	public static void main(String args[]){

		int num=4321;
		
		int sum=0;
		while(num>0){
			int rem=num%10;
			num=num/10;
			
			sum=sum+rem;		
		}
		System.out.print("sum of digit:"+sum);
	}
}
//sum of digit:10