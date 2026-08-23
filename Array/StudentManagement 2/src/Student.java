class Student{
	int studentId;
	String studentName;
	double marks;

	Student(int studentId,String studentName,double Marks){
		this.studentId=studentId;
		this.studentName=studentName;
		this.marks=marks;
	}

	void display(){
		System.out.printf("%-10d %-20s %-10.2f\n ",studentId,studentName,marks);
	}

}