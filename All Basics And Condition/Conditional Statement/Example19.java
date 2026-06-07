import java.util.Scanner;

class Example19 {
    public static void main(String arg[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();
	int temp=n;
	int sum=0;
	
	while(n>0){
	int rem=n%10;
	sum=sum+rem;
	n=n/10;
	}
	System.out.println("the Sum is : "+sum);
        System.out.println("after append sum at last : "+temp+sum);
    	 System.out.println("after append sum at Beginning : "+sum+temp);
  }
}
/*
Enter n: 12345
the Sum is : 15
after append sum at last : 1234515
after append sum at Beginning : 1512345
*/