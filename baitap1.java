import java.util.Scanner;

public class baitap1 {

    // Hàm viết hoa chữ cái đầu mỗi từ
    public static String vietHoaChuDau(String s) {
        String[] arr = s.split(" ");
        String result = "";

        for (String word : arr) {
            if (!word.isEmpty()) {
                result += Character.toUpperCase(word.charAt(0))
                        + word.substring(1).toLowerCase() + " ";
            }
        }
        return result.trim();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập dữ liệu
        System.out.print("Nhập tên sách: ");
        String tenSach = sc.nextLine();

        System.out.print("Nhập tên tác giả: ");
        String tacGia = sc.nextLine();

        System.out.print("Nhập thể loại: ");
        String theLoai = sc.nextLine();

        // Chuẩn hóa khoảng trắng
        tenSach = tenSach.trim().replaceAll("\\s+", " ");
        tacGia = tacGia.trim().replaceAll("\\s+", " ");
        theLoai = theLoai.trim().replaceAll("\\s+", " ");

        // Định dạng
        tenSach = tenSach.toUpperCase();
        tacGia = vietHoaChuDau(tacGia);

        // Xuất kết quả
        System.out.println("\nKẾT QUẢ:");
        System.out.println(tenSach + " - Tác giả: " + tacGia);
    }
}
