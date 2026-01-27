package Ex03;

import java.util.Scanner;

public class bai5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] books = {101, 102, 103, 104, 105};
        int n = 5;
        System.out.print("Kho sách ban đầu: [ ");
        for (int i = 0; i < n; i++) System.out.print(books[i] + " ");
        System.out.println("]");

        System.out.print("Nhập mã sách muốn xóa: ");
        int deleteId = Integer.parseInt(sc.nextLine());
        boolean isFound = false;
        for (int i = 0; i < n; i++) {
            if (books[i] == deleteId) {
                for (int j = i; j < n - 1; j++) {
                    books[j] = books[j + 1];
                }
                n--;
                isFound = true;
                System.out.println("Đã xóa sách " + deleteId);
                break;
            }
        }
        if (!isFound) {
            System.out.println("Không tìm thấy sách này!");
        } else {
            System.out.print("Kho sách sau khi xóa: [ ");
            for (int i = 0; i < n; i++) System.out.print(books[i] + " ");
            System.out.println("]");
        }
    }
}