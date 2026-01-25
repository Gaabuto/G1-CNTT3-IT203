import java.util.Scanner;

public class baitap1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap ma sach: ");
        String bookID = sc.nextLine();

        System.out.print("Nhap ten sach: ");
        String bookName = sc.nextLine();

        System.out.print("Nhap nam xuat ban: ");
        int publishYear = sc.nextInt();

        System.out.print("Nhap gia tien: ");
        double price = sc.nextDouble();

        System.out.print("Tinh trang con sach (true/false): ");
        boolean isAvailable = sc.nextBoolean();

        int bookAge = 2026 - publishYear;

        System.out.println("\n===== PHIEU THONG TIN SACH =====");
        System.out.println("Ma sach      : " + bookID);
        System.out.println("Ten sach     : " + bookName.toUpperCase());
        System.out.println("Nam xuat ban : " + publishYear);
        System.out.println("Tuoi tho sach: " + bookAge + " nam");
        System.out.printf("Gia tien     : %.2f VND\n", price);
        System.out.println("Tinh trang   : " + (isAvailable ? "Con sach" : "Da muon"));

        sc.close();
    }
}
