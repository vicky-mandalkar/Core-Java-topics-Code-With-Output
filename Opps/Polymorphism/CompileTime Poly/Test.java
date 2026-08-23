// is it method Overloading?
// can we overload static method ?

class Operation{
	static void doAdd(int x ,int y){
		System.out.println(x+y);
	}

	static void doAdd(int x ,int y,int z){
		System.out.println(x+y+z);
	}

	static void doAdd(int x,double y){
		System.out.println(x+y);
	}

	static void doAdd(double x,int y){
		System.out.println(x+y);
	}
}

class Test{
	public static void main(String[] args) {
		Operation op=new Operation();
		op.doAdd(11,22);
		op.doAdd(11,22,33);
		op.doAdd(11,22.22);
		op.doAdd(11.11,22);

		// Operation.doAdd(11,22)  

	}
}