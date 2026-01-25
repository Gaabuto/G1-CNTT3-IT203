import java.util.Scanner;
public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Khai báo và nhập từ bàn phím các biến
        System.out.print("Nhập mã sách: ");
        String bookID = sc.nextLine();

        System.out.print("Nhập tên sách: ");
        String bookName = sc.nextLine();

        System.out.print("Nhập năm xuất bản: ");
        int publishYear = sc.nextInt();

        System.out.print("Nhập giá bìa: ");
        double price = sc.nextDouble();

        System.out.print("Sách còn trong kho (true/false): ");
        boolean isAvailable = sc.nextBoolean();

        // Xử lý
        int bookAge = 2026 - publishYear;
        String bookNameUpper = bookName.toUpperCase();
        String status = isAvailable ? "Còn sách" : "Đã mượn";

        // Xuất phiếu thông tin
        System.out.println("\n--- PHIẾU THÔNG TIN SÁCH ---");
        System.out.println("Tên sách: " + bookNameUpper);
        System.out.println("Mã số: " + bookID + " | Tuổi thọ: " + bookAge + " năm");
        System.out.printf("Giá bán: %.2f VNĐ\n", price);
        System.out.println("Tình trạng: " + status);
    }
}
