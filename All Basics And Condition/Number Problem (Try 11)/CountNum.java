import java.util.Scanner;
class CountNum{

	public static void  main(String args[]){
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter N:");
		num=sc.nextInt();
		int cnt=0;
		while(num>0){
					
			num=num/10;
			cnt++;
			
		}
		System.out.print("count is :"+cnt);
	}
}
// Enter N:123456
// count is :6