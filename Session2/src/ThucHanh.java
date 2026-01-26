import java.util.Scanner;
public class ThucHanh {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Chức năng 1
        // Nhập số lượng sách độc giả trả
        System.out.print("Nhập số lượng sách trả: ");
        int soSach = sc.nextInt();

        int tongTienPhat = 0;
        // Nhập số ngày quá hạn
        for (int i = 1; i <= soSach; i++) {
            System.out.print("Nhập số ngày quá hạn của sách " + i + ": ");
            int ngayTre = sc.nextInt();

            int tienPhat;

            if (ngayTre <= 5) {
                tienPhat = ngayTre * 2000;
            } else {
                tienPhat = 5 * 2000 + (ngayTre - 5) * 5000;
            }

            tongTienPhat += tienPhat;
        }

        System.out.println("Tổng tiền phạt: " + tongTienPhat + " VNĐ");
        //Chức năng 2
        //Nhập tuổi và số sách đã mượn trong tháng qua
        System.out.print("Nhập tuổi: ");
        int tuoi = sc.nextInt();
        System.out.print("Nhập số sách đã mượn trong tháng: ");
        int soSachMuon = sc.nextInt();

        System.out.print("Có thẻ sinh viên ưu tiên không? (1: Có, 0: Không): ");
        int uuTien = sc.nextInt();

        boolean duDieuKienVIP =
                (tuoi >= 18 && soSachMuon >= 10) || uuTien == 1;

        String ketQuaVIP = duDieuKienVIP
                ? "Đủ tiêu chuẩn nâng cấp VIP"
                : "Chưa đủ tiêu chuẩn";

        System.out.println("Kết quả: " + ketQuaVIP);
        // Chức năng 3
        int demSach = 0;
        int maSach;
        //Nhập mã số các cuốn sách mới về kho
        System.out.println("Nhập mã sách (0 để dừng):");

        do {
            System.out.print("Nhập mã sách: ");
            maSach = sc.nextInt();

            if (maSach < 0) {
                System.out.println("Mã không hợp lệ, nhập lại!");
                continue;
            }

            if (maSach == 0) {
                break;
            }

            demSach++;

        } while (true);

        System.out.println("Tổng số sách hợp lệ đã nhập: " + demSach);
    }
}
