import java.util.Scanner;
public class Bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Nhập vào số thứ tự của cuốn sách mới
        System.out.print("Nhập số thứ tự của sách trong hệ thống: ");
        int stt = sc.nextInt();
        // Xác định số thứ tự của Kệ sách mà cuốn sách đó sẽ thuộc về
        int ke = (stt - 1) / 25 + 1; // stt - 1 Vì sách bắt đầu từ 1, nhưng phép chia trong Java bắt đầu đếm từ 0, / 25 vì mỗi 25 sách là 1 nhóm, + 1 vì kệ đánh số từ 1, không phải từ 0
        // Xác định Vị trí chính xác của cuốn sách đó trên kệ đó
        int viTri = (stt - 1) % 25 + 1; // % 25 vì phần dư cho biết vị trí trong nhóm 25
        // Xác định khu vực
        String khuVuc = (ke <= 10)
                ? "Khu Cận (Gần cửa)"
                : "Khu Viễn (Xa cửa)";
        // Xuất kết quả
        System.out.println("\n--- THÔNG TIN ĐỊNH VỊ ---");
        System.out.println("Sách số: " + stt);
        System.out.println("Địa chỉ: Kệ " + ke + " - Vị trí " + viTri);
        System.out.println("Phân khu: " + khuVuc);
    }
}
