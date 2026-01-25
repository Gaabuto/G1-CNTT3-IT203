import java.util.Scanner;
public class LibraryManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Khai báo

        // Nhập dữ liệu
        System.out.print("Nhập mã sách: ");
        int bookID = sc.nextInt();
        sc.nextLine(); // next...(); để đọc dữ liệu

        System.out.print("Nhập tên sách: ");
        String title = sc.nextLine();

        System.out.print("Nhập giá nhập: ");
        double price = sc.nextDouble();

        System.out.print("Nhập số lượng: ");
        int quantity = sc.nextInt();

        System.out.print("Sách còn trong kho? (true/false): ");
        boolean isAvailable = sc.nextBoolean();

        // Xử lý
        double totalValue = price * quantity;
        boolean isLargeStock = quantity > 100;
        boolean canBorrow = isAvailable && quantity > 0;

        // Xuất kết quả
        // printIn để in dữ liệu ra màn hình, tự động xuống dòng sau khi in
        System.out.println("\n==== BÁO CÁO TÌNH TRẠNG SÁCH ====");
        System.out.println("Mã sách: " + bookID);
        System.out.println("Tên sách: " + title);
        System.out.printf("Giá nhập: %.2f\n", price); // printf để in dữ liệu theo định dạng
        System.out.println("Số lượng: " + quantity);
        System.out.printf("Tổng giá trị kho: %.2f\n", totalValue);
        System.out.println("Kho còn (>100 sách): " + isLargeStock);
        System.out.println("Trạng thái: " + (canBorrow ? "Còn hàng" : "Hết hàng"));
        System.out.println("Có thể mượn: " + canBorrow);
    }
}