// Parent Class
class Cycle {

    public void ride() {
        System.out.println("Riding a Cycle");
    }
}

// Child Class 1
class Unicycle extends Cycle {

    @Override
    public void ride() {
        System.out.println("Riding a Unicycle");
    }
}

// Child Class 2
class Bicycle extends Cycle {

    @Override
    public void ride() {
        System.out.println("Riding a Bicycle");
    }
}

// Child Class 3
class Tricycle extends Cycle {

    @Override
    public void ride() {
        System.out.println("Riding a Tricycle");
    }
}

// Main Class
public class CycleMain {

    // Method demonstrating Upcasting
    public static void ride(Cycle c) {
        c.ride();
    }

    public static void main(String[] args) {

        Cycle c1 = new Unicycle();   // Upcasting
        Cycle c2 = new Bicycle();    // Upcasting
        Cycle c3 = new Tricycle();   // Upcasting

        ride(c1);
        ride(c2);
        ride(c3);
    }
}