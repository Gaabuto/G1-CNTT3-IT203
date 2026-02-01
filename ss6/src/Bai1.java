

class Student{
    String studentId;
    String studentName;
    int yearBirth;
    double score;

    public Student(String studentId, String studentName, int yearBirth, double score) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.yearBirth = yearBirth;
        this.score = score;
    }

    public void displayInfor() {
        System.out.println("Mã SV: " + studentId);
        System.out.println("Họ tên: " + studentName);
        System.out.println("Năm sinh: " + yearBirth);
        System.out.println("Điểm TB: " + score);
        System.out.println("--------------------");
    }
}

public class Bai1 {

    public static void main(String[] args) {
        Student sv1 = new Student("SV001", "Nguyễn Tiến Thành", 2006, 8.5);
        Student sv2 = new Student("SV002", "Nguyễn Trần Khánh Trắng", 2002, 7.8);

        sv1.displayInfor();
        sv2.displayInfor();
    }
}