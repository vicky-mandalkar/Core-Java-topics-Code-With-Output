<<<<<<< HEAD
class Operation{
	void doAdd(int x ,int y){
		System.out.println(x+y);
	}

	void doAdd(int x ,int y,int z){
		System.out.println(x+y+z);
	}

	void doAdd(int x,double y){
		System.out.println(x+y);
	}

	void doAdd(double x,int y){
		System.out.println(x+y);
	}
}

class App{
	public static void main(String[] args) {
		Operation op=new Operation();
		op.doAdd(11,22);
		op.doAdd(11,22,33);
		op.doAdd(11,22.22);
		op.doAdd(11.11,22);

	}
=======
class Operation{
	void doAdd(int x ,int y){
		System.out.println(x+y);
	}

	void doAdd(int x ,int y,int z){
		System.out.println(x+y+z);
	}

	void doAdd(int x,double y){
		System.out.println(x+y);
	}

	void doAdd(double x,int y){
		System.out.println(x+y);
	}
}

class App{
	public static void main(String[] args) {
		Operation op=new Operation();
		op.doAdd(11,22);
		op.doAdd(11,22,33);
		op.doAdd(11,22.22);
		op.doAdd(11.11,22);

	}
>>>>>>> 209d7a204d30a9b82fd17bcc52287fc7f1b2cf9a
}