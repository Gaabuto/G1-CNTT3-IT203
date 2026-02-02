package Ex07.bai1;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Bàng Trọng Tú");
        Student s2 = new Student(2, "Trần Anh Dũng");
        Student s3 = new Student(3, "Nguyễn Tiến Thành");
        Student s4 = new Student(4, "Nguyễn Trần Bảo Khánh");

        s1.displayInfor();
        s2.displayInfor();
        s3.displayInfor();
        s4.displayInfor();
        Student.displayInforTotal();
    }
}