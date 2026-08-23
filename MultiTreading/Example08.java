

class Harry extends Thread{
        @Override
        public void run(){
		for(int i=1;i<=5;i++){
			System.out.println(Thread.currentThread().getName() +"  "+(5*i));
		}
	}
}

class Potter extends Thread{
	  @Override
        public void run(){
		for(int i=1;i<=5;i++){
			System.out.println(Thread.currentThread().getName() +"  "+(11*i));
		}
	}
	
}


class Emma extends Thread{
	  @Override
        public void run(){
		for(int i=1;i<=5;i++){
			System.out.println(Thread.currentThread().getName() +"  "+(13*i));
		}
	}
	
}

public class Example08{
	public static void main(String[] args) {

		Harry h1=new Harry();
		h1.setName("Harry");
		Potter p1=new Potter();
		p1.setName("Potter");
		Emma e1=new Emma();
		e1.setName("Emma");


		h1.setPriority(10);
		p1.setPriority(9);
		e1.setPriority(7);

		h1.start();
		p1.start();
		e1.start();


		System.out.println("*****THANK YOU *****");

		
	}
}