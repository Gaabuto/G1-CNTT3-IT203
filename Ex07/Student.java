package Ex07;

public class Student {
    // 1. Thuộc tính Instance (Riêng biệt cho từng đối tượng)
    private String id;
    private String name;

    // 2. Thuộc tính Static (Dùng chung cho cả lớp)
    // static final: Hằng số, không đổi, dùng chung (Tên trường)
    public static final String SCHOOL_NAME = "Rikkei Academy";

    // static: Biến dùng chung, giá trị thay đổi được (Biến đếm)
    public static int studentCount = 0;

    // 3. Constructor (Hàm khởi tạo)
    public Student(String id, String name) {
        this.id = id;
        this.name = name;
        studentCount++;
    }

    // 4. Getter / Setter
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // 5. Phương thức hiển thị thông tin
    public void displayInfo() {
        System.out.println("---------------------------------");
        System.out.println("Mã SV: " + id);
        System.out.println("Tên SV: " + name);
        System.out.println("Trường: " + SCHOOL_NAME);
    }

    // 6. Phương thức Static (Hiển thị tổng số lượng)
    public static void showTotalStudent() {
        System.out.println("==> TỔNG SỐ SINH VIÊN HIỆN CÓ: " + studentCount);
    }
}