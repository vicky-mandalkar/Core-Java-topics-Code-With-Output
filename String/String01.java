class String01{
	public static void main(String er[]){
		String str="Viki Mandalkar ";

		String s1="Java";
		String s2="Java";
		String s3="  JAVA";

		System.out.println(str.length());//--------------> Returns the total number of characters.
		System.out.println(str.charAt(2));//-------------> Returns character at a given index.
		System.out.println(str.indexOf('i'));//----------> Returns first occurrence.
		System.out.println(str.lastIndexOf('i'));//--------> Returns last occurrence.
		System.out.println(str.contains("dal"));//---------> Checks whether string contains another string.
		System.out.println(s1.equals(s2));//-------------> Compares values.
		System.out.println(s1.equalsIgnoreCase(s3));//---> Ignores uppercase/lowercase.
		System.out.println("Apple".compareTo("Banana"));//-> 0 → Equal / Negative → First is smaller / Positive → First is greater
		System.out.println(s1.concat("World"));
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println(str.trim());
		System.out.println(str.startsWith("Viki"));

		System.out.println(str.substring(3));//----> i Mandalkar 
		System.out.println(str.substring(3,7));//--> i Ma
		System.out.println(s1.replace('a','o'));//Jovo
		String s4="Java123"; System.out.println(s4.replaceAll("[0-9]",""));//--> Java
		String s5="one one one"; System.out.println(s5.replaceFirst("one","two"));

		/*
		String s6="Apple,Mango,Banana";
		String arr[]=s6.split(",");
		for(String x:arr)
			System.out.println(x);
		*/
		/*
		for(int i=0;i<str.length();i++){
			System.out.print(str.charAt(i)+"\t");
		} 
  		*/
		
	}

}