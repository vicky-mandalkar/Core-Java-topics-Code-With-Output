class MyThread extends Thread {

    @Override
    public void run() {

        System.out.println("Current Thread 1: "
                + Thread.currentThread().getName());
System.out.println("Current Thread 2: "
                + Thread.currentThread().getName());

    }

}

public class Example04 {

    public static void main(String[] args) {

        MyThread t = new MyThread();

        t.setName("Banti");

        t.start();

        System.out.println("Main Thread : "
                + Thread.currentThread().getName());

    }

}