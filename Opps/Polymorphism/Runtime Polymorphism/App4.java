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

class Violin extends Instrument{
	@Override
	void play(){
		//super.play();
	 	System.out.println("Violin playing..");
	 }	
}

class Tabla extends Instrument{
	@Override
	void play(){
		//super.play();
	 	System.out.println("Tabla playing..");
	 }	

}


class App4{

	// Home
	public static void tune(Instrument i1){
		
		i1.play();
	}

	
	public static void main(String[] args) {
		/*
		Instrument i1=new Guitar();  
		Instrument i2=new Flute();  
		Instrument i3=new Violin();  
		*/
		tune(new Guitar());
		tune(new Violin());
		tune(new Flute());
		tune(new Tabla());
		
	}
}