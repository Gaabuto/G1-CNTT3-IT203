package nihao;

import java.util.Scanner;

public class Bai6 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Moi ban nhap so thu tu cua sach trong he thong: ");
        int stt = Integer.parseInt(scanner.nextLine());
        int ke = (stt - 1) / 25 + 1;
        int viTri = (stt - 1) % 25 + 1;

        String khuVuc = stt <= 10 ? "Khu Can" : "Khu Vien";
        System.out.printf("-- Thông tin định vị --\n Sách số %d\n Địa chỉ: Kệ %d - Vị trí %d \n Phân khu: %s",
                stt, ke, viTri, khuVuc);
    }
}
