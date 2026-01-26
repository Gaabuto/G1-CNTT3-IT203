package Ex02;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        int n;
        int daysLate;
        long total = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong tra muon: ");
        n = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= n; i++) {
            System.out.println("Nhap so ngay tre cua cuon thu  " + i + ": ");
            daysLate = Integer.parseInt(sc.nextLine());
            total += daysLate * 5000;
        }
        System.out.println("===> Tong so tien phat: " + total + " VND");
    }
}