package Ex02;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập tuổi: ");
        int age = Integer.parseInt(scanner.nextLine());

        System.out.print("Nhập sách đang giữ: ");
        int booksHeld = Integer.parseInt(scanner.nextLine());

        if (age >= 18 && booksHeld < 3) {
            System.out.println("Được phép mượn sách");
        } else {
            System.out.println("Không được phép mượn.");
            System.out.println("Lý do:");
            if (age < 18) {
                System.out.println("Bạn chưa đủ tuổi.");
            }
            if (booksHeld >= 3) {
                System.out.println("Bạn đã mượn quá số lượng.");
            }
        }
    }
}