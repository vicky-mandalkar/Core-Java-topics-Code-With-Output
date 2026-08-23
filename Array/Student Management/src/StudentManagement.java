import java.util.Scanner;

class StudentManagement {

    static Student students[] = new Student[10];
    static int count = 0;

    // Add Student
    static void addStudent(Scanner sc) {

        if (count == students.length) {
            System.out.println("Student Array is Full!");
            return;
        }

        System.out.print("Enter Student ID : ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Student Name : ");
        String name = sc.nextLine();

        System.out.print("Enter Marks : ");
        double marks = sc.nextDouble();

        students[count++] = new Student(id, name, marks);

	System.out.println("Student Added Successfully.");
    }

    // Search Student
   	static void searchStudent(Scanner sc) {

        System.out.print("Enter Student ID : ");
        int id = sc.nextInt();

        for (int i = 0; i < count; i++) {

            if (students[i].studentId == id) {

                System.out.println("Student Found");
                students[i].display();
                return;
            }
        }

        System.out.println("Student Not Found.");
    }

    // Update Marks
    static void updateMarks(Scanner sc) {

        System.out.print("Enter Student ID : ");
        int id = sc.nextInt();

        for (int i = 0; i < count; i++) {

            if (students[i].studentId == id) {

                System.out.print("Enter New Marks : ");
                students[i].marks = sc.nextDouble();

                System.out.println("Marks Updated.");
                return;
            }
        }

        System.out.println("Student Not Found.");
    }

    // Delete Student
    static void deleteStudent(Scanner sc) {

        System.out.print("Enter Student ID : ");
        int id = sc.nextInt();

        for (int i = 0; i < count; i++) {

            if (students[i].studentId == id) {

                for (int j = i; j < count - 1; j++) {
                    students[j] = students[j + 1];
                }

                students[count - 1] = null;
                count--;

                System.out.println("Student Deleted.");
                return;
            }
        }

        System.out.println("Student Not Found.");
    }

    // Display All Students
    static void displayAllStudents() {

        if (count == 0) {
            System.out.println("No Students Available.");
            return;
        }

        System.out.printf("%-10s %-20s %-10s\n",
                "ID", "NAME", "MARKS");

        System.out.println("--------------------------------------");

        for (int i = 0; i < count; i++) {
            students[i].display();
        }
    }

    // Highest Marks Student
    static void highestMarksStudent() {

        if (count == 0) {
            System.out.println("No Students Available.");
            return;
        }

        Student highest = students[0];

        for (int i = 1; i < count; i++) {

            if (students[i].marks > highest.marks) {
                highest = students[i];
            }
        }

        System.out.println("Highest Marks Student:");

        highest.display();
    }

    // Average Marks
    static void averageMarks() {

        if (count == 0) {
            System.out.println("No Students Available.");
            return;
        }

        double sum = 0;

        for (int i = 0; i < count; i++) {
            sum += students[i].marks;
        }

        System.out.println("Average Marks = " + (sum / count));
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n===== Student Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. Search Student");
            System.out.println("3. Update Marks");
            System.out.println("4. Delete Student");
            System.out.println("5. Display All Students");
            System.out.println("6. Highest Marks Student");
            System.out.println("7. Average Marks");
            System.out.println("8. Exit");

            System.out.print("Enter Choice : ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    addStudent(sc);
                    break;

                case 2:
                    searchStudent(sc);
                    break;

                case 3:
                    updateMarks(sc);
                    break;

                case 4:
                    deleteStudent(sc);
                    break;

                case 5:
                    displayAllStudents();
                    break;

                case 6:
                    highestMarksStudent();
                    break;

                case 7:
                    averageMarks();
                    break;

                case 8:
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}

