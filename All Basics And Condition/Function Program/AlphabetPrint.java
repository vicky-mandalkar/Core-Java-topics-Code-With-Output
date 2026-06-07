import java.util.Scanner;

class AlphabetPrint {

    static void Alpha(char First, char Last) {

        char start = First;

        while(start <= Last) {

            System.out.print(start +" ");

            start++;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First alphabet: ");
        char First = sc.next().charAt(0);

        System.out.print("Enter Last alphabet: ");
        char Last = sc.next().charAt(0);

        Alpha(First, Last);
    }
}
/*
Enter First alphabet: a
Enter Last alphabet: t
a b c d e f g h i j k l m n o p q r s t
*/