class MyRunnable implements Runnable {
	@Override
	public void run(){
		for(int i=1;i<=5;i++){
			System.out.println(5*i +" "+Thread.currentThread().getName()+"\t");
			System.out.println(Thread.currentThread().getId());
		}
	}

}

public class Example03{
	public static void main(String ar[]){

		MyRunnable myrun=new  MyRunnable();//work  Bricks
		Thread t1=new Thread(myrun);//Worker  Donkey
		t1.setName("Banti");
		t1.start();

		for(int i=1;i<=5;i++){
			System.out.println(11*i +" "+Thread.currentThread().getName()+"\t");
			System.out.println(Thread.currentThread().getId());
		}		
	}
}
/*
11 main
5 Banti
1
22 main
1
10
10 Banti
10
33 main
1
15 Banti
10
44 main
1
55 main
1
20 Banti
10
25 Banti
10
*/
