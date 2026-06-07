
import java.util.Scanner;

class Example12 {
    public static void main(String arg[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n1: ");
        int n1 = sc.nextInt();

        System.out.print("Enter n2: ");
        int n2 = sc.nextInt();

	int hcf=1;
        for(int i = 1; i <= n1 && i<=n2; i++) {

            if(n1 % i == 0 && n2 % i == 0) {
		hcf=i;
          
            }
		   
        }
	System.out.println("HCF := " + hcf);
    }
}
/*

Enter n1: 16
Enter n2: 20
HCF := 4
*/