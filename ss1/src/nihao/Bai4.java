package nihao;

import java.util.Scanner;

public class Bai4 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời nhập giá sách - USD: ");
        double bookPriceUSD = Double.parseDouble(scanner.nextLine());
        System.out.println("Mời nhập tỷ giá USD - VND: ");
        float exchangeRate = Float.parseFloat(scanner.nextLine());
        long bookPriceVND = (long) (bookPriceUSD * exchangeRate);
        System.out.printf("Giá làm tròn sau quy đổi: %d VND", bookPriceVND);
    }
}
