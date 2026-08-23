
class Ram extends Thread{
	@Override
	public void run(){
		for(int i=1;i<=5;i++){
			System.out.println(Thread.currentThread().getName() +"  "+(5*i));
			
		}
		
	}

}
class Shyam implements Runnable{
	@Override
	public void run(){
		for(int i=1;i<=5;i++){
			System.out.println(Thread.currentThread().getName() +"  "+(11*i));
			
		}
		
	}

}


public class Example07{
	public static void main(String ae[]){

		Ram r1=new Ram();
		r1.setName("ram");

		Shyam s1=new Shyam();
		Thread t=new Thread(s1);
		t.setName("shyam");

		r1.start();
		try {
    			r1.join();
		} catch (InterruptedException e) {
    			e.printStackTrace();
		}

		t.start();
		try {
    			t.join();
		} catch (InterruptedException e) {
    			e.printStackTrace();
		}

		for(int i=1;i<=5;i++){
			System.out.println(Thread.currentThread().getName() +"  "+(55*i));

			try{
				Thread.sleep(1000); 
			}catch(InterruptedException e){
				
			} 		
		}
	}
}

/*
with out using join theen we can get random output like this 
main  55
ram  5
ram  10
main  110
main  165
ram  15
shyam  11
shyam  22
shyam  33
shyam  44
ram  20
main  220
ram  25
shyam  55
main  275

IF WE ARE USING THE join() METHOD THEN OUTPUT LIKE THIS

shyam  11
shyam  22
shyam  33
shyam  44
shyam  55
ram  5
ram  10
ram  15
ram  20
ram  25
main  55
main  110
main  165
main  220
main  275
*/