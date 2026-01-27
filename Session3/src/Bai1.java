import java.util.Scanner;
public class Bai1 {
    //Phương thức cho phép người dùng nhập vào n mã sách và trả về một mảng số nguyên.
    public static int[] addBookToLibraries(int n) {
        Scanner sc = new Scanner(System.in);
        int[] books = new int[n];

        System.out.println("Nhập mã số cho " + n + " cuốn sách:");
        for (int i = 0; i < n; i++) {
            System.out.print("Sách thứ " + (i + 1) + ": ");
            books[i] = sc.nextInt();
        }
        return books;
    }
    // Phương thức hiển thị danh sách mã sách
    public static void displayLibraries(int[] arr) {
        System.out.print("Danh sách mã sách: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
    }
    // Hàm main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số lượng sách cần quản lý: ");
        int n = sc.nextInt();

        int[] libraries = addBookToLibraries(n);
        System.out.println("--- KẾT QUẢ ---");
        displayLibraries(libraries);
    }
}