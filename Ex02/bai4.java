package Ex02;

import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        int bookID;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhap ma ID sach moi (phai > 0): ");
            bookID = Integer.parseInt(sc.nextLine());

            if (bookID <= 0) {
                System.out.println("Loi: ID phai la so duong. Moi nhap lai!");
            }
        } while (bookID <= 0);
        System.out.println("Xac nhan: Ma sach " + bookID + " da duoc ghi nhan");
    }
}
