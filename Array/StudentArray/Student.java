public class Student{
	private int id;
	private String name;
	private String student[]=new String[5];
	private int marks[]=new int[5];

	public Student(int id,String name,String [] student,int []marks){
		this.id=id;
		this.name=name;
		this.student=student;
		this.marks=marks;
	}
	
	public int getId(){
		return id;
	}
	public String getName(){
		return name;
	}
	public String [] getstudent(){
		return student;
	}
	public int [] getMarks(){
		return marks;
	}

	public void setId(int id){
		this.id=id;
	}
	public void setNamw(String name){
		this.name=name;
	}
	public void setId(String [] student){
		this.student=student;
	}
	public void setId(int [] marks){
		this.marks=marks;
	}
}