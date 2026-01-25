import java.util.Scanner;

public class baitap2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so ngay cham tre (n): ");
        int n = sc.nextInt();

        System.out.print("Nhap so luong sach muon (m): ");
        int m = sc.nextInt();

        double total = n * m * 5000;

        if (n > 7 && m >= 3) {
            total = total * 1.2;
        }

        boolean blockCard = total > 50000;

        System.out.println("\n===== PHIEU TINH TIEN PHAT =====");
        System.out.println("So ngay tre   : " + n);
        System.out.println("So sach muon  : " + m);
        System.out.printf("Tong tien phat: %.0f VND\n", total);
        System.out.println("Yeu cau khoa the: " + blockCard);

        sc.close();
    }
}
