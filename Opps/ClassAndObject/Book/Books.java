import java.util.Scanner;

class Book {

    String bookName;
    String authorName;
    double price;
    int pages;
    String publisher;

    void getDetails() {

        System.out.println("Book Name   : " + bookName);
        System.out.println("Author Name : " + authorName);
        System.out.println("Price       : " + price);
        System.out.println("Pages       : " + pages);
        System.out.println("Publisher   : " + publisher);
    }
}
public class Books{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        Book b = new Book();

        System.out.println("Enter Book Name : ");
        b.bookName = sc.nextLine();

        System.out.println("Enter Author Name : ");
        b.authorName = sc.nextLine();

        System.out.println("Enter Price : ");
        b.price = sc.nextDouble();

        System.out.println("Enter Pages : ");
        b.pages = sc.nextInt();

        

        System.out.println("Enter Publisher : ");
        b.publisher = sc.nextLine();

        System.out.println("\n===== Book Details =====");

        b.getDetails();
    }
}
/*
Enter Book Name :
shyam chi aai
Enter Author Name :
sane guruji
Enter Price :
120
Enter Pages :
200
Enter Publisher :
sanket prakashan

===== Book Details =====
Book Name   : shyam chi aai
Author Name : sane guruji
Price       : 120.0
Pages       : 200
Publisher   : sanket prakashan
*/