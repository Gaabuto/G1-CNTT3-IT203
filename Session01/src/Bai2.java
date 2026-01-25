import java.util.Scanner;
public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập dữ liệu
        System.out.print("Nhập số ngày chậm trễ: ");
        int n = sc.nextInt();

        System.out.print("Nhập số lượng sách mượn: ");
        int m = sc.nextInt();

        // Tính tiền phạt gốc
        double originalFine = n * m * 5000;

        // Điều chỉnh tiền phạt nếu quá hạn lâu và mượn nhiều
        double adjustedFine = originalFine;
        if (n > 7 && m >= 3) {
            adjustedFine = originalFine * 1.2; // tăng 20%
        }

        // Kiểm tra yêu cầu khóa thẻ
        boolean lockCard = adjustedFine > 50000;

        // Xuất kết quả
        System.out.println("Tiền phạt gốc: " + originalFine + " VND");
        System.out.println("Tiền phạt sau điều chỉnh: " + adjustedFine + " VND");
        System.out.println("Yêu cầu khóa thẻ: " + lockCard);
    }
}
