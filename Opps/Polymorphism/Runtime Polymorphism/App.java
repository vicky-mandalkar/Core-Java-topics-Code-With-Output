class Instrument{
	int x;
	// memebers 
	 void play(){
	 	System.out.println("Instrument playing..");
	 }
}

class Guitar extends Instrument{
	int y;
	// memebers
	// @Override  Annotation 
	// tells compiler as well Programmer using this method from parent class
	@Override
	void play(){
		//super.play();
	 	System.out.println("Guitar playing..");
	 }
}

class Flute extends Instrument{
	@Override
	void play(){
		//super.play();
	 	System.out.println("Flute playing..");
	 }	
}
class App{
	public static void main(String[] args) {
		Instrument i1=new Instrument();
		i1.play();
		Guitar g1=new Guitar();
		g1.play();
		Instrument i2=new Guitar();  // UPCasting
		// Parent ref is pointing to child class Object
		i2.play();
		// Decision of binding of methid call decides at run time called as RuntimePolymprphism
		// Dynamic Polymorphism
		// Late Binding

	}
}