class MyRunnable implements Runnable {

    @Override
    public void run() {

        System.out.println("Current Thread : "
                + Thread.currentThread().getName());

    }

}

public class Example05 {

    public static void main(String[] args) {

        MyRunnable task = new MyRunnable();

        Thread t = new Thread(task);

        t.setName("Banti");

        t.start();

 	System.out.println("Current Thread : "
                + Thread.currentThread().getName());


    }

}