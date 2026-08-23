class Example01{
	/*
	void f1(int x ,int y){
		System.out.println("void f1(int x ,int y)");
		 System.out.println(x+"  "+y);

	}
	

	void f1(long x ,long y){
		System.out.println("void f1(long x ,long y)");
		 System.out.println(x+"  "+y);

	}
	*/

		void f1(double x ,double y){
		System.out.println("void f1(double x ,double y)");	
		 System.out.println(x+"  "+y);

	}




	void f1(float x ,float y){
		System.out.println("void f1(float x ,float y)");
		 System.out.println(x+"  "+y);

	}



	public static void main(String[] args) {
		Example01 ex=new Example01();	
		// int --> long
		ex.f1(111111,22111222);  // ex.f1(11.0,22.0)
		ex.f1(11.11,22.22);

		ex.f1('A','B');

	}
}