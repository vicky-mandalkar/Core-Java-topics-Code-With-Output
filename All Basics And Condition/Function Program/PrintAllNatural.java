import java.util.Scanner;

class PrintAllNatural {

    static void naturalNum(int num) {

        int i = 1;

        while(i <= num) {

            System.out.println(i);

            i++;
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
Enter your number: 7
1
2
3
4
5
6
7
*/