class Song{
	String MusicComposer;
	String Singer;
	String Lyricist;
	String Cast;
	String Release ;
	double Duration;
	String Language;
	
	 void getDetails(){
	    System.out.println("MusicComposer : "+MusicComposer);
	    System.out.println("Singer : "+Singer);
	    System.out.println("Lyricist : "+Lyricist);
	    System.out.println("Cast : "+Cast);
	    System.out.println("Release : "+Release);
	    System.out.println("Duration : "+Duration);
	    System.out.println("Language : "+Language);
		
	}

}

class App{
	public static void main(String args[]){
		Song s=new Song();
		s.MusicComposer = "Shashwat Sachdev";
		s.Singer = "Shashwat Sachdev,Jasmine Sandlas,Satinder Sartaaj";
		s.Cast = "Ranveer Singh,R. Madhavan,Sanjay Dutt,Arjun Rampal";
		s.Release = "Mar 17, 2026";
		s.Duration = 03.01;
		s.Language = "Hindi";
		
		System.out.println("All Details of song :: ");
		s.getDetails();
			
	}
}