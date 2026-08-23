class MyThread extends Thread{
	//@Override
	public void run(){
		for(int i=1;i<=5;i++){
			System.out.println(5*i +" "+Thread.currentThread().getName());
		}
	}

}

public class Example02{
	public static void main(String ar[]){

		MyThread t1=new MyThread();
		t1.setName("Banti");
		t1.start();

		for(int i=1;i<=5;i++){
			System.out.println(11*i +" "+Thread.currentThread().getName());
		}		
	}

}

 /*
 
public class Thread implements Runnable{
	 Thread()
	 public Thread currentThread()
	 public void setName(String name)
	 public String getName()
}

*/