import java.util.Scanner;
public class Bai5 {
    // Xóa sách theo kỹ thuật dồn trái
    public static int deleteBook(int[] arr, int n, int bookId) {
        int index = -1;
        //Tìm vị trí sách cần xóa
        for (int i = 0; i < n; i++) {
            if (arr[i] == bookId) {
                index = i;
                break;
            }
        }
        //Nếu không tìm thấy
        if (index == -1) {
            System.out.println("Không tìm thấy sách có mã " + bookId);
            return n;
        }
        //Dồn trái
        for (int i = index; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }
        System.out.println("Đã xóa sách mã " + bookId);
        //Giảm số lượng
        return n - 1;
    }
    //Phương thức in mảng chỉ tới n phần tử
    public static void displayBooks(int[] arr, int n) {
        System.out.print("[ ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("]");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] books = {101, 102, 103, 104, 105};
        int n = 5;
        while (true) {
            //In ra mảng sau mỗi lần xóa
            System.out.print("Kho sách hiện tại (" + n + " cuốn): ");
            displayBooks(books, n);
            //Nếu không có sách
            if (n == 0) {
                System.out.println("Kho sách rỗng.");
                break;
            }
            System.out.print("Nhập mã sách cần xóa (0 để thoát): ");
            int bookId = sc.nextInt();
            //0 để thoát
            if (bookId == 0) {
                break;
            }
            //Xóa sách
            n = deleteBook(books, n, bookId);
        }
    }
}