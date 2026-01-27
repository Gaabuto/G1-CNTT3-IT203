import java.util.Scanner;
public class Bai2 {
    // Phương thức tìm sách
    public static int searchBooks(String[] arr, String search) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(search)) { //giống thì tìm thấy
                return i;
            }
        }
        return -1; // không có sách
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Khởi tạo sẵn danh sách sách
        String[] books = {"Doraemon","Harry Potter","Sherlock Holmes","One Piece","Clean Code"};
        System.out.print("Nhập tên sách cần tìm: ");
        String search = sc.nextLine();

        int position = searchBooks(books, search);
        if (position != -1) {
            System.out.println("Tìm thấy sách '" + search + "' tại vị trí số: " + position);
        } else {
            System.out.println("Sách không tồn tại trong thư viện.");
        }
    }
}