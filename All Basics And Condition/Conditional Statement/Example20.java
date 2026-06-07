import java.util.Scanner;

class Example20 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        int temp = n;
        int count = 0;

        // Count digits
        while(temp > 0) {
            temp = temp / 10;
            count++;
        }

        // Find divisor
        int divisor = 1;

        for(int i = 1; i < count; i++) {
            divisor = divisor * 10;
        }

        // Find first digit
        int first = n / divisor;
	
        // Remove first digit
        int remaining = n % divisor;
        System.out.println("remaining: " + remaining);
        // Shift first digit to last
        int answer = remaining * 10 + first;

        System.out.println("Output: " + answer);

        sc.close();
    }
}