package Ex07;

public class Main {
    public static void main(String[] args) {

        System.out.println("Trước khi tạo sinh viên:");

        Student.showTotalStudent();

        System.out.println("Khởi tạo sinh viên");

        Student s1 = new Student("SV001", "Nguyễn Văn A");
        Student s2 = new Student("SV002", "Trần Thị B");
        Student s3 = new Student("SV003", "Lê Văn C");
        System.out.println("Hiển thị thông tin từng sinh viên:");

        s1.displayInfo();
        s2.displayInfo();
        s3.displayInfo();

        System.out.println("Kiểm tra biến dùng chung (Static):");

        Student.showTotalStudent();

        System.out.println("Tên trường của s1: " + s1.SCHOOL_NAME);
        System.out.println("Tên trường của s2: " + s2.SCHOOL_NAME);
        System.out.println("Tên trường truy cập trực tiếp: " + Student.SCHOOL_NAME);
    }
}
