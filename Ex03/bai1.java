package Ex03;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng sách cần quản lý: ");
        int n = Integer.parseInt(sc.nextLine());
        int[] books = new int[n];
        System.out.println("Nhập mã số cho " + n + " cuốn sách:");
        for (int i = 0; i < n; i++) {
            System.out.print("Sách thứ " + (i + 1) + ": ");
            books[i] = Integer.parseInt(sc.nextLine());
        }

        System.out.println("--- KẾT QUẢ ---");
        System.out.print("Danh sách mã sách: ");

        for (int i = 0; i < books.length; i++) {
            System.out.print(books[i]);
            if (i < books.length - 1) {
                System.out.print(",   ");
            }
        }
    }
}