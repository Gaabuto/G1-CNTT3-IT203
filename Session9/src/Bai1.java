class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Họ tên: " + name);
        System.out.println("Tuổi: " + age);
    }
}

class Student extends Person {
    private int studentId;
    private double averageScore;

    public Student(String name, int age, int studentId, double averageScore) {
        super(name, age);
        this.studentId = studentId;
        this.averageScore = averageScore;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Mã sinh viên: " + studentId);
        System.out.println("Điểm trung bình: " + averageScore);
    }
}

public class Bai1 {
    public static void main(String[] args) {
        Student sv = new Student("Nguyễn Văn A",20,1,7.8);

        sv.displayInfo();
    }
}