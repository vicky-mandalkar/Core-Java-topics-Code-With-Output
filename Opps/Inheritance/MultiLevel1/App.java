class Art{
	Art(){
		super();//refer to parent constructor
		System.out.println("Art Cons");
	}
}
class Drawing extends Art{
	Drawing(){
		super();//refer to parent constructor
		System.out.println("Drawing Cons");
	}
}
class Cartoon extends Drawing{
	Cartoon(){
		super();//refer to parent constructor
		System.out.println("Cartoon Cons");
	}
}


public class App{
	public static void main(String ar[]){
		Art A=new Art();
		System.out.println("-----------------------");
		Drawing D=new Drawing();
		System.out.println("-----------------------");
		Cartoon C=new Cartoon();

		
	}
}
/*
Art
-----------------------
Art
Drawing
-----------------------
Art
Drawing
Cartoon
*/
