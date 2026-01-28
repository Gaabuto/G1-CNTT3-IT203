import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class baitap2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập mô tả sách: ");
        String moTa = sc.nextLine();

        // Regex tìm vị trí kệ
        String regex = "Kệ:\\s*([^,\\n]+)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(moTa);

        if (matcher.find()) {
            // Trích xuất mã kệ
            String viTriKe = matcher.group(1).trim();
            System.out.println("Mã vị trí kệ sách: " + viTriKe);

            // Thay thế từ khóa
            String moTaMoi = moTa.replaceAll("Kệ:", "Vị trí lưu trữ:");
            System.out.println("Mô tả sau khi cập nhật:");
            System.out.println(moTaMoi);
        } else {
            System.out.println("Không tìm thấy thông tin kệ sách trong mô tả.");
        }
    }
}
