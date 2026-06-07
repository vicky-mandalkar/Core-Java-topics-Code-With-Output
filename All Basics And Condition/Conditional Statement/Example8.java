import java.util.Scanner;
class Example8{
	public static void main(String arg[]){

		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number to find factors :");
		int n=sc.nextInt();


		for(int i=1;i<=n;i++){
			if(n%i==0){
				System.out.println(i);

			}
			
		}
		
	}

}
/*
Enter Number to find factors :1234
1
2
617
1234

*/