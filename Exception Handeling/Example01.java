import java.util.*;;
class Example01{
	public static void main(String arg[]){
		int a=10,b=0,c;
		try{
			c=a/b;
		}catch(Exception e){
			//System.out.println(e);
			//e.printStackTrace();//java.lang.ArithmeticException: / by zero
						//at Example01.main(Example01.java:6) 
			//System.out.println(e.toString());//java.lang.ArithmeticException: / by zero
			System.out.println(e.getMessage());// by zero
		}
		 
		System.out.println("End");

	}

}