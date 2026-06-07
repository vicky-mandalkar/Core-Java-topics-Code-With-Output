class Palindrom{
	public static void main(String args[]){

		int num=1123211;
		int original=num;
		int rev =0;

		while(num>0){
			int rem=num%10;
			rev=rev*10+rem;
			num=num/10;
			
			
			
		}
		if(original==rev){

			System.out.print("this number is palindrom...");

		}
		else{
			System.out.print("this number is not palindrom...");

		}
	}
}