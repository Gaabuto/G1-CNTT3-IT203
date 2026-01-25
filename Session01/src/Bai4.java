import java.util.Scanner;
public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập giá sách
        System.out.print("Nhập giá sách (USD - kiểu double): ");
        double priceUSD = sc.nextDouble();

        System.out.print("Giá chính xác (số thực): ");
        float exchangeRate = sc.nextFloat();

        // Tính tổng tiền
        double exactVND = priceUSD * exchangeRate;

        // Ép kiểu sang long để thanh toán
        long roundedVND = (long) exactVND;

        // Xuất kết quả
        System.out.printf("Giá chính xác (số thực): %.3E%n", exactVND);
        System.out.println("Giá làm tròn để thanh toán (long): " + roundedVND);
    }
}