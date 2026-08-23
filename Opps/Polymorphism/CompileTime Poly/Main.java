class Calculator {
    void add(int x, long y) {
        System.out.println("Method A");
    }

    void add(long x, int y) {
        System.out.println("Method B");
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        //c.add(5, 5); 
        c.add(5, 5l);
        c.add(5l, 5); 
    }
}