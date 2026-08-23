class Student {
    int studentId;
    String studentName;
    double marks;

    Student(int studentId, String studentName, double marks) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.marks = marks;
    }

    void display() {
        System.out.printf(                studentId, studentName, marks);
    }
}