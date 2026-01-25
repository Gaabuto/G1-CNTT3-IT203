package nihao;

import java.util.Scanner;

public class Bai1 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("moi ban nhap ma sach: ");
        String bookID = scanner.nextLine();

        System.out.print("Moi ban nhap ten sach: ");
        String bookName = scanner.nextLine();

        System.out.print("Moi ban nhap nam xuat ban: ");
        int publishYear = Integer.parseInt(scanner.nextLine());


        System.out.print("Moi ban nhap ten gia bia: ");
        Double price = Double.parseDouble(scanner.nextLine());


        System.out.println("sach con trong kho khong (true/false): ");
        Boolean inStock = scanner.nextBoolean();


        System.out.printf("\n--- Phiếu thông tin sách ---\n  Ten sach: %s | Tuoi tho: %d \nGia ban: %.2f\nTinh trang: %s", bookName, (2026 - publishYear), price, inStock ? "Còn sách" : "Đã mượn");

    }
}


