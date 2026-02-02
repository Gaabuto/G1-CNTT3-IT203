package btth;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("S001", "Alice Ngu");
        Student student2 = new Student("S002", "Bob Vu");
        Student student3 = new Student("S003", "Charlie Nguyen");
        Student.studentCount = 3;
        student1.display();
        student2.display();
        student3.display();
    }

}
