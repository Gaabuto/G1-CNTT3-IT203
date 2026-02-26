import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class QuanLyThuoc {

    // Phương thức lọc thuốc không trùng và sắp xếp
    public static List<String> locVaSapXepThuoc(List<String> danhSachNhapKho) {
        List<String> danhSachKhongTrung = new ArrayList<>();

        for (String thuoc : danhSachNhapKho) {
            if (!danhSachKhongTrung.contains(thuoc)) {
                danhSachKhongTrung.add(thuoc);
            }
        }

        Collections.sort(danhSachKhongTrung); // sắp xếp A-Z
        return danhSachKhongTrung;
    }

    public static void main(String[] args) {
        List<String> danhSachThuoc = new ArrayList<>();
        danhSachThuoc.add("Paracetamol");
        danhSachThuoc.add("Ibuprofen");
        danhSachThuoc.add("Panadol");
        danhSachThuoc.add("Paracetamol");
        danhSachThuoc.add("Aspirin");
        danhSachThuoc.add("Ibuprofen");

        System.out.println("Danh sách nhập kho: " + danhSachThuoc);

        List<String> ketQua = locVaSapXepThuoc(danhSachThuoc);
        System.out.println("Danh sách thuốc không trùng (A-Z): " + ketQua);
    }
}