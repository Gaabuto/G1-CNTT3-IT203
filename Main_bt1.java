package baitap1;

public class Main_bt1 {
    public static void main(String[] args) {

        Student sv1 = new Student("SV001", "Nguyễn Văn A");
        Student sv2 = new Student("SV002", "Trần Thị B");
        Student sv3 = new Student("SV003", "Lê Văn C");

        // Hiển thị thông tin từng sinh viên
        sv1.displayInfo();
        sv2.displayInfo();
        sv3.displayInfo();

        // Hiển thị tổng số sinh viên
        Student.showTotalStudent();
    }
}
