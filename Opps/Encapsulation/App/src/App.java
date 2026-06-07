public class App{
	public static void main(String args[]){
	
		Watch w1=new Watch();
		w1.displayClock();
		System.out.println("=================================");
		Watch w2=new Watch(10,20,30);
		w2.displayClock();
		System.out.println("=================================");
		Watch w3=new Watch(12,10);
		w3.displayClock();

		System.out.println("=================================");
		System.out.println("After hr seting : ");
		w2.setHr(12);
		w2.displayClock();
	
	}

}
/*
Hr  : 10
Min : 10
Sec : 10
=================================
Hr  : 10
Min : 20
Sec : 30
=================================
Hr  : 12
Min : 10
Sec : 0
=================================
After hr seting :
Hr  : 12
Min : 20
Sec : 30
*/