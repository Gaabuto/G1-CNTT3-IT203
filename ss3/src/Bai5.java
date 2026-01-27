import java.util.Scanner;

public class Bai5 {

    public static int deleteBook(int[] arr, int n, int bookId) {
        int i;
        for (i = 0; i < n; i++) {
            if (arr[i] == bookId) {
                break;
            }
        }

        if (i == n) {
            System.out.println("Khong tim thay sach co ma so: " + bookId);
            return n;
        }

        for (int j = i; j < n - 1; j++) {
            arr[j] = arr[j + 1];
        }

        System.out.println("Da xoa sach co ma so: " + bookId);
        return n - 1; // giảm số lượng
    }

    public static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so luong sach: ");
        int n = scanner.nextInt();

        int[] bookIds = new int[n];

        System.out.println("Nhap ma sach:");
        for (int i = 0; i < n; i++) {
            bookIds[i] = scanner.nextInt();
        }

        int currentSize = n;
        int bookId;

        while (true) {
            System.out.print("Nhap id muon xoa (9999 de dung): ");
            bookId = scanner.nextInt();

            if (bookId == 9999) break;

            currentSize = deleteBook(bookIds, currentSize, bookId);
        }
    }
}
