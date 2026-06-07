
import java.util.Scanner;

class Example11 {
    public static void main(String arg[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n1: ");
        int n1 = sc.nextInt();

        System.out.print("Enter n2: ");
        int n2 = sc.nextInt();

        for(int i = 2; i <= n1 * n2; i++) {

            if(i % n1 == 0 && i % n2 == 0) {
                System.out.println("LCM = " + i);
                break;
            }
        }
    }
}
/*

Enter n1: 4
Enter n2: 6
LCM = 12
*/