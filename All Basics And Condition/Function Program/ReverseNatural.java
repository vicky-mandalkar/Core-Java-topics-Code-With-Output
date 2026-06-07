import java.util.Scanner;

class ReverseNatural {

    static void naturalNum(int num) {

        int i = 1;

        while(i <= num) {

            System.out.println(num);

            num--;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your number: ");

        int n = sc.nextInt();

        naturalNum(n);
    }
}
/*
Enter your number: 5
5
4
3
2
1
*/