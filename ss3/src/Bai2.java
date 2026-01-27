import java.util.Scanner;

public class Bai2 {
    public static int searchBooks(String[] arr, String search) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(search)) {
                return i;
            }
        }
        return -1;
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] books = {
                "Dế Mèn Phiêu Lưu Ký",
                "Lão Hạc",
                "Tắt Đèn",
                "Nhật Ký Trong Tù",
                "Tuổi Trẻ Đáng Giá Bao Nhiêu"
        };
        String search = "Nhật Ký Trong Tù";
        int index = searchBooks(books, search);
        if (index != -1) {
            System.out.println("Tìm thấy sách ở vị trí: " + index);
        } else {
            System.out.println("Không tìm thấy sách");
        }
    }
}
