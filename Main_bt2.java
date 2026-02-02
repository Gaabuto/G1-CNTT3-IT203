package baitap2;

public class Main_bt2 {
    public static void main(String[] args) {

        System.out.println("===== SO SÁNH BIẾN NGUYÊN THỦY =====");
        int a = 10;
        int b = a;   // gán giá trị

        b = 20;      // thay đổi b

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        System.out.println("\n===== SO SÁNH BIẾN THAM CHIẾU =====");
        Student sv1 = new Student("Nguyễn Văn A");
        Student sv2 = sv1;   // gán tham chiếu

        sv2.name = "Trần Thị B"; // thay đổi qua sv2

        System.out.println("Tên sv1: " + sv1.name);
        System.out.println("Tên sv2: " + sv2.name);
    }
}
