import java.util.Scanner;

public class Bai3 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng sách trả muộn");
        int lateBooks = Integer.parseInt(scanner.nextLine());
        int feePerBook = 5000;
        int totalFee = 0;
        for ( int i = 1; i <= lateBooks; i++) {
            System.out.println("Mời bạn nhập số ngày trễ của cuốn sách thứ " + i + ": ");
            int lateDays = Integer.parseInt(scanner.nextLine());
            totalFee += lateDays * feePerBook;
        }
        System.out.println("Tổng phí phạt là: " + (totalFee) + " VND");
    }
}
