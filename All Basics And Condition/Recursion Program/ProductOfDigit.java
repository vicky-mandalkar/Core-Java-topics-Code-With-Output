import java.util.Scanner;
class ProductOfDigit {
  
    	static int res,rem;
    	static int pro=1;
    
	static int product(int n){
       		if(n==0)
            		return 1;
        
       		 return (n%10) * product(n/10);
   	}
    
	public static void main(String[] args) {
        	Scanner sc=new Scanner(System.in);
      		 System.out.print("Enter your Number : ");
      		 int num=sc.nextInt();
       		int c=product(num);
       		System.out.print("product of "+num+" Number is  : "+c);
    	}
}
/*
Enter your Number : 555
product of 555 Number is  : 125
*/