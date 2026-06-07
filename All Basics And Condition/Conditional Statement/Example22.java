import java.util.Scanner;

class Example22 {
    public static void main(String args[]) {
	int year;
	System.out.print("Enter Year: ");


        Scanner sc = new Scanner(System.in);
        year = sc.nextInt();

        if(year%400==0  ){
		System.out.print(" it Leap year");
	}
	else{
		if(year%100!=0 && year %4==0  ){
			System.out.print(" it Leap year");
		}
		else{
			System.out.print(" Not Leap year");

		}
	}



        //sc.close();
    }
}