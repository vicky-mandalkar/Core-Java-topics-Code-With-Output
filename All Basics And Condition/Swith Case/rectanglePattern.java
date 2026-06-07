import java.util.Scanner;

class rectanglePattern {
    public static void main(String[] args) {
        char letter;
        int choice , n;
        Scanner sc = new Scanner(System.in);
    do{
        System.out.print("Enter row: ");
        n = sc.nextInt();

        System.out.println("1. Hollow Square \n2. Right Mirrored Rhombus \n3. Left Mirrored Rhombus \n4. Hollow Mirrored Rhombus \n5. Reverse Hollow Mirrored Rhombus \n ");
       
        System.out.print("Enter your choice: ");
        choice = sc.nextInt();

        switch(choice) {

            case 1:
                for(int i = 1; i <= n; i++) {
                    for(int j = 1; j <= n + 1; j++) {

                        if(i == 1 || i == n || j == 1 || j == n + 1) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
                break;

            case 2:
                for(int i = 1; i <= n; i++) {

                    for(int j = 1; j <= n - i; j++) {
                        System.out.print(" ");
                    }

                    for(int j = 1; j <= n; j++) {
                        System.out.print("*");
                    }

                    System.out.println();
                }
                break;

            case 3:
                for(int i = 1; i <= n; i++) {

                    for(int j = 1; j < i; j++) {
                        System.out.print(" ");
                    }

                    for(int j = 1; j <= n; j++) {
                        System.out.print("*");
                    }

                    System.out.println();
                }
                break;

            case 4:
                for(int i = 1; i <= n; i++) {

                    for(int j = 1; j <= n - i; j++) {
                        System.out.print(" ");
                    }

                    for(int j = 1; j <= n; j++) {

                        if(i == 1 || i == n || j == 1 || j == n) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }

                    System.out.println();
                }
                break;

            case 5:
                for(int i = 1; i <= n; i++) {

                    for(int j = 1; j < i; j++) {
                        System.out.print(" ");
                    }

                    for(int j = 1; j <= n; j++) {

                        if(i == 1 || i == n || j == 1 || j == n) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }

                    System.out.println();
                }
                break;

            default:
                System.out.println("Invalid Choice");
        }
        System.out.println("do you want to continue if yes enter (Y or y)");
        letter =sc.next().charAt(0);

	}
	
	while(letter =='Y' || letter =='y');
	
    }

}


/*
Enter row: 6
1. Hollow Square
2. Right Mirrored Rhombus
3. Left Mirrored Rhombus
4. Hollow Mirrored Rhombus
5. Reverse Hollow Mirrored Rhombus

Enter your choice: 5
******
 *    *
  *    *
   *    *
    *    *
     ******
do you want to continue if yes enter (Y or y)
*/