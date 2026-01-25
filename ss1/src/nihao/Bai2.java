package nihao;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Moi ban nhap so ngay tre: ");
        int lateDays = Integer.parseInt(scanner.nextLine());

        System.out.print("Moi ban nhap so luong sach muon: ");
        int bookCount = Integer.parseInt(scanner.nextLine());

        double beforeCost = lateDays * bookCount * 5000;
        double totalCost = beforeCost;

        // Giam 20% neu tre > 7 ngay va muon >= 3 sach
        if (lateDays > 7 && bookCount >= 3) {
            totalCost = totalCost * 1.2;
        }

        System.out.printf(
                "\n--- PHIEU TINH TIEN PHAT -- \n So ngay tre: %d \nSo sach muon: %d \nTien phat goc: %.0f VNĐ \nTien phat sau dieu chinh: %.0f VNĐ \nYeu cau khoa the: %s",
                lateDays,
                bookCount,
                beforeCost,
                totalCost,
                totalCost > 50000 ? "true" : "false"
        );;
    }
}
