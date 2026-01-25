import java.util.Scanner;

public class baitap4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập giá sách (USD): ");
        double priceUSD = sc.nextDouble();

        System.out.print("Nhập tỷ giá (VND/USD): ");
        float rate = sc.nextFloat();

        double totalVND = priceUSD * rate;

        long totalVNDRound = (long) totalVND;
        System.out.println("Tổng tiền VNĐ: " + totalVNDRound + " VND");

        sc.close();
    }
}
