package nihao;

import java.util.Scanner;

public class Bai5 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Moi ban nhap ma sach(4 chu so): ");
        int bookID = Integer.parseInt(scanner.nextLine());
        if(bookID >= 1000 && bookID <= 9999){
            int thousands =bookID / 1000;
            int hundreds = (bookID / 100) % 10;
            int dozens = (bookID / 10) % 10;
            int units = bookID % 10;
            int sumOfFirstThreeNumber  = thousands + hundreds + dozens;
            if (sumOfFirstThreeNumber % 10 == units) {
                System.out.println("Kết quả kiểm tra: đúng mã");
            } else {
                System.out.println("Kết quả kiểm tra: sai mã");
            }
        } else {
            System.out.println("Kết quả kiểm tra: sai mã");
        }

    }
}
