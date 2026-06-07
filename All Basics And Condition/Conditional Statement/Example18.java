import java.util.Scanner;

class Example18 {
    public static void main(String arg[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();
	int sum=0;
	int cnt=0;
	while(n>0){
	int rem=n%10;
	sum=sum+rem;
	n=n/10;
	cnt++;
	}
	System.out.println("the Sum is : "+sum);
	System.out.println("Count is : "+cnt);
	System.out.println("Average is  : "+(sum/cnt));

  }
}
/*
Enter n: 12345
the Sum is : 15
Count is : 5
Average is  : 3
*/