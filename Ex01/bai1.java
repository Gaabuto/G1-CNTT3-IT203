package Ex01;
import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mã sách: ");
        String bookID = scanner.nextLine();
        System.out.print("Nhập tên sách: ");
        String bookName = scanner.nextLine();
        System.out.print("Nhập năm xuất bản: ");
        int publishYear = scanner.nextInt();
        System.out.print("Nhập giá bìa: ");
        double price = scanner.nextDouble();
        System.out.print("Sách còn trong kho (true/false): ");
        boolean isAvailable = scanner.nextBoolean();
        int bookAge = 2026 - publishYear;
        String bookNameUpper = bookName.toUpperCase();
        String status = isAvailable ? "Còn sách" : "Đã mượn";
        System.out.println("\n--- PHIẾU THÔNG TIN SÁCH ---");
        System.out.println("Tên sách: " + bookNameUpper);
        System.out.printf("Mã số: %s | Tuổi thọ: %d năm\n", bookID, bookAge);
        System.out.printf("Giá bán: %.2f VNĐ\n", price);
        System.out.println("Tình trạng: " + status);
    }
}