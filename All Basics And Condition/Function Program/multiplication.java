import java.util.Scanner;
class multiplication {
    static void  Table(int t) {
        int n=10;
        for(int i=1;i<=10;i++){
            System.out.println(t+" * "+i+" = "+(t*i));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("which table do you want to print : ");
        int T = sc.nextInt();
        Table(T);
       
    }
}
/*
which table do you want to print : 12
12 * 1 = 12
12 * 2 = 24
12 * 3 = 36
12 * 4 = 48
12 * 5 = 60
12 * 6 = 72
12 * 7 = 84
12 * 8 = 96
12 * 9 = 108
12 * 10 = 120
*/