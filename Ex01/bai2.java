package Ex01;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số ngày chậm trễ: ");
        int n = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập số lượng sách mượn: ");
        int m = Integer.parseInt(scanner.nextLine());
        double baseFine = n * m * 5000;
        double finalFine = baseFine;
        if (n > 7 && m >= 3) {
            finalFine = baseFine + (baseFine * 0.20);
        }
        boolean isLocked = finalFine > 50000;
        System.out.printf("Tiền phạt gốc: %.1f VNĐ\n", baseFine);
        System.out.printf("Tiền phạt sau điều chỉnh: %.1f VNĐ\n", finalFine);
        System.out.println("Yêu cầu khóa thẻ: " + isLocked);
    }
}