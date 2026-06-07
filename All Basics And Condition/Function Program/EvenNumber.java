import java.util.Scanner;

class EvenNumber {

    static void Even(int n) {
        int i=1;
        while(i <= n) {
            if(i%2==0){
                System.out.print(i+" ");
            }
            i++;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter  number: ");

        int num = sc.nextInt();

        Even(num);
    }
}
/*
Enter  number: 100
2 4 6 8 10 12 14 16 18 20 22 24 26 28 30 32 34 36 38 40 42 44 46 48 50 52 54 56 58 60 62 64 66 68 70 72 74 76 78 80 82 84 86 88 90 92 94 96 98 100
*/