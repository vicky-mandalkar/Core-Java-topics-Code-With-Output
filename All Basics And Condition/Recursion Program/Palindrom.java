import java.util.Scanner;
class Palindrom {
  
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
       		System.out.println("reverse of "+num+" Number is  : "+rev);
       		System.out.print((num==rev)?"Is Palindrom":"Not Palindrom");
    	}
}
/*
Enter your Number : 1234321
reverse of 1234321 Number is  : 1234321
Is Palindrom
*/