import java.util.Scanner;

class Example17 {
    public static void main(String arg[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();
	int sum=0;
	
	while(n>0){
	int rem=n%10;
	sum=sum+rem;
	n=n/10;
	}
	System.out.print("the Sum is : "+sum);
        
    
  }
}
/*
Enter n: 12345
the Sum is : 15
*/