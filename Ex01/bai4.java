package Ex01;

import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập giá sách (USD - kiểu double): ");
        double bookPrice = Double.parseDouble(scanner.nextLine());
        System.out.print("Nhập tỷ giá (VNĐ - kiểu float): ");
        float exchangeRate = Float.parseFloat(scanner.nextLine());
        double totalVND = bookPrice * exchangeRate;
        long roundedVND = (long) totalVND;
        System.out.println("Giá chính xác (số thực): " + totalVND);
        System.out.println("Giá làm tròn để thanh toán (long): " + roundedVND);
    }
}