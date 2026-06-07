import java.util.Scanner;
class ReverseOfNum {
  
    	//static int res,rem;
    	//static int pro=1;
    static int rev=0;
	static void reverse(int n){
       		if(n==0)
            		return ;
        
            rev=rev*10+(n%10);
       		reverse(n/10);
   	}
    
	public static void main(String[] args) {
        	Scanner sc=new Scanner(System.in);
      		 System.out.print("Enter your Number : ");
      		 int num=sc.nextInt();
       		reverse(num);
       		System.out.print("reverse of "+num+" Number is  : "+rev);
    	}
}
/*
Enter your Number : 12345
reverse of 12345 Number is  : 54321
*/