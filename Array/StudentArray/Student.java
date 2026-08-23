<<<<<<< HEAD
public class Student{
	private int id;
	private String name;
	private String Student[]=new String[5];
	private int Marks[]=new int[5];

	public Student(int id,String name,String [] Student,int []Marks){
		this.id=id;
		this.name=name;
		this.Student=Student;
		this.Marks=Marks;
	}
	
	public int getId(){
		return id;
	}
	public String getName(){
		return name;
	}
	public String [] getstudent(){
		return Student;
	}
	public int [] getMarks(){
		return Marks;
	}

	public void setId(int id){
		this.id=id;
	}
	public void setName(String name){
		this.name=name;
	}
	public void setStudent(String [] Student){
		this.Student=Student;
	}
	public void setMarks(int [] Marks){
		this.Marks=Marks;
	}

	public void PrintStudentInfo(){
		System.out.println("--------------Student Details--------------");
		System.out.printf("%5s","ID");
		System.out.printf("%10s","NAME");
		System.out.printf("%10s","SUBJECT");
		System.out.printf("%10s\n","MARKS");
		System.out.println("------------------------------------------");

		System.out.printf("%5d",this.id);
		System.out.printf("%10s",this.name);
		System.out.println();
		for(int i=0;i<Student.length;i++){
			System.out.printf("%20s : %5d \n",Student[i],Marks[i]);

		}
		System.out.println("=========================================");	

	}
}
=======
public class Student{
	private int id;
	private String name;
	private String Student[]=new String[5];
	private int Marks[]=new int[5];

	public Student(int id,String name,String [] Student,int []Marks){
		this.id=id;
		this.name=name;
		this.Student=Student;
		this.Marks=Marks;
	}
	
	public int getId(){
		return id;
	}
	public String getName(){
		return name;
	}
	public String [] getstudent(){
		return Student;
	}
	public int [] getMarks(){
		return Marks;
	}

	public void setId(int id){
		this.id=id;
	}
	public void setName(String name){
		this.name=name;
	}
	public void setStudent(String [] Student){
		this.Student=Student;
	}
	public void setMarks(int [] Marks){
		this.Marks=Marks;
	}

	public void PrintStudentInfo(){
		System.out.println("--------------Student Details--------------");
		System.out.printf("%5s","ID");
		System.out.printf("%10s","NAME");
		System.out.printf("%10s","SUBJECT");
		System.out.printf("%10s\n","MARKS");
		System.out.println("------------------------------------------");

		System.out.printf("%5d",this.id);
		System.out.printf("%10s",this.name);
		System.out.println();
		for(int i=0;i<Student.length;i++){
			System.out.printf("%20s : %5d \n",Student[i],Marks[i]);

		}
		System.out.println("=========================================");	

	}
}
>>>>>>> 209d7a204d30a9b82fd17bcc52287fc7f1b2cf9a
