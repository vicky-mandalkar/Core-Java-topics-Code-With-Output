class Example02{

	static void f1(double d){
		System.out.println(d);
	}
	
	public static void main(String[] args) {
		//boolean flag=true;
		byte val=11;
		f1(val);

		double my_var=val;  // Widening

		//val ---> double

		float x=11.11f;

		int y=(int)x;  // (int)11.11  --> 11   // Narrowing
		
	}
}