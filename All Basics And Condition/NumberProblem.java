class NumberProblem {

    	public static void Countdigit(int num, int cnt){
        	while(num>0){
            		cnt++;
            		num=num/10;
        	}
        	System.out.println("Count is : "+cnt);
    	}

	public static void FirstNumber(int num){
               	while(num>10){
			num=num/10;
		}
		System.out.println("First Number : "+num);        
    	}

	public static void LastNumber(int num){
        	System.out.println("Last Number : "+num%10);
        
    	}

	public static void SumOfFirstAndLastDigit(int num){
        	int last=num%10;
		while(num>10){
			num=num/10;
		}
		System.out.println("Sum First And Last Number : "+(num+last));
    	}

	public static void SumOfDigit(int num){
		int sum=0;
       		while(num>0){
			int rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		System.out.println("Sum of digit : "+sum);
    	}

	public static void ProductOfDigit(int num){
		int pro=1;
       		while(num>0){
			int rem=num%10;
			pro=pro*rem;
			num=num/10;
		}
		System.out.println("Product of digit : "+pro);
    	}

	public static void ReverseNum(int num){
		int rev=0;
       		while(num>0){
			int rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		System.out.println("Reverse of digit : "+rev);
    	}




    	public static void main(String[] args){
        	int num=21234;
        	int cnt=0;
        	Countdigit(num,cnt);
		FirstNumber(num);
		LastNumber(num);
		SumOfFirstAndLastDigit(num);
		SumOfDigit(num);
		ProductOfDigit(num);
		ReverseNum(num);
		
    	}
}