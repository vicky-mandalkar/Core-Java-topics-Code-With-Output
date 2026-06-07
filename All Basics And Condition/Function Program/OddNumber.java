import java.util.Scanner;

class OddNumber {

    static void odd(int n) {
        int i=1;
        while(i <= n) {
            if(i%2 !=0){
                System.out.print(i+" ");
            }
            i++;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter  number: ");

        int num = sc.nextInt();

        odd(num);
    }
}
/*
Enter  number: 20
1 3 5 7 9 11 13 15 17 19 
*/