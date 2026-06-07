import java.util.Scanner;
class SumOfDigit {
  
    	static int res,rem;
    	//static int pro=1;
    
	static int sum(int n){
       		if(n==0)
            		return 0;
        
       		 return (n%10) + sum(n/10);
   	}
    
	public static void main(String[] args) {
        	Scanner sc=new Scanner(System.in);
      		 System.out.print("Enter your Number : ");
      		 int num=sc.nextInt();
       		int c=sum(num);
       		System.out.print("sum of "+num+" Number is  : "+c);
    	}
}
/*
Enter your Number : 23456
sum of 23456 Number is  : 20
*/