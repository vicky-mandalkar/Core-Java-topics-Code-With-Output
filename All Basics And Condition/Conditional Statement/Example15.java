import java.util.Scanner;

class Example15 {
    public static void main(String arg[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n1: ");
        int n = sc.nextInt();

	//int rem=1;
	while(n>10){
		//int rem=n1%10;
		n=n/10;
	}
	System.out.println("First digit is : "+n);

	
        
	
    }
}
/*
Enter n1: 12345
First digit is : 1
*/