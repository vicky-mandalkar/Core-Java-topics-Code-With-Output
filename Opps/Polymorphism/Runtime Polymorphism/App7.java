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
class App7{

	public static void tune(Instrument i){
		i.play();
	}
	public static void orchestra(Instrument []arr){

		for(  Instrument i: arr)
			tune(i);

	}


	public static void main(String ar[]){
		Instrument []arr={new Guitar(),new Violin(),new Tabla(),new Flute()};

		orchestra(arr);
	}
}