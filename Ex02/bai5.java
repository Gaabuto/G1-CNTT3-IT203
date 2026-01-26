package Ex02;

import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        int reputation = 100;
        int daysLate;
        Scanner sc = new Scanner(System.in);
        System.out.println("--- HE THONG DANH GIA DOC GIA ---");
        System.out.println("(Nhap so ngay tre. Nhap 999 de ket thuc)");
        System.out.println("So ngay tre cua lan nay: ");
        while (true) {
            daysLate = Integer.parseInt(sc.nextLine());
            if (daysLate == 999) {
                break;
            }
            if (daysLate <= 0) {
                reputation += 5;
            } else {
                reputation -= daysLate * 2;
            }
            System.out.println("-> Tra tre " + daysLate + " ngay: -" + (daysLate * 2) + "diem\n");
            System.out.println("Nhap so ngay tre cua lan nay: ");
        }
        System.out.println("Tong diem uy tin: " + reputation);
        if (reputation > 120) {
            System.out.println("Xep loai: DOC GIA THAN THIET");
        } else if (reputation >= 80) {
            System.out.println("Xep loai: DOC GIA TIEU CHUAN");
        } else {
            System.out.println("Xep loai: DOC GIA CAN LUU Y");
        }
    }
}