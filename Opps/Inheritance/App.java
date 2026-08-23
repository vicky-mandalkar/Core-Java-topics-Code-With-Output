class Animal{
	//field
	//method
	void eat(){
		System.out.println("Eating..........!");
	}

}
class Bird extends Animal{
	//field
	//method
	void fly(){
		System.out.println("Flying..........!");
	}

}
class App{
	public static void main(String ar[]){
		Animal A=new Animal();
		A.eat();
		
		Bird B=new Bird();
		B.eat();
		B.fly();

	}
}
/*
Compile : javac App.java
Run: java App
Eating..........!
Eating..........!
Flying..........!
*/
