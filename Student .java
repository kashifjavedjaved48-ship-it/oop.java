class Student {
    public int studentId;
    public String name;
    public String department;
    public int semester;
    public double cgpa;

    public void displayInfo() {
        System.out.println(name + " (ID: " + studentId + ")");
        System.out.println(department + ", Semester " + semester);
        System.out.println("CGPA: " + cgpa);
    }
}

public class StudentDemo {
    public static void main(String[] args) {
        Student student1, student2;

        student1 = new Student();
        student1.studentId = 101;
        student1.name = "Ali Raza";
        student1.department = "Software Engineering";
        student1.semester = 3;
        student1.cgpa = 3.5;

        System.out.println("student1:");
        student1.displayInfo();

        student2 = new Student();
        student2.studentId = 102;
        student2.name = "Sara Khan";
        student2.department = "Computer Science";
        student2.semester = 5;
        student2.cgpa = 3.8;

        System.out.println("student2:");
        student2.displayInfo();
    }
}