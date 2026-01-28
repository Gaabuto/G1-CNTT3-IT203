import java.time.LocalDate;
import java.time.LocalDateTime;

public class baitap3 {
    public static void main(String[] args) {

        int soGiaoDich = 10000; // số lượng giao dịch lớn
        LocalDate ngayMuon = LocalDate.now();

        /* =======================
           CÁCH 1: DÙNG TOÁN TỬ +
           ======================= */
        long start1 = System.currentTimeMillis();

        String baoCao1 = "Thời gian hệ thống: " + LocalDateTime.now() + "\n";

        for (int i = 1; i <= soGiaoDich; i++) {
            baoCao1 += "Mã sách: B" + i + " | Ngày mượn: " + ngayMuon + "\n";
        }

        long end1 = System.currentTimeMillis();
        System.out.println("Thời gian chạy dùng '+': " + (end1 - start1) + " ms");

        /* ===========================
           CÁCH 2: DÙNG STRINGBUILDER
           =========================== */
        long start2 = System.currentTimeMillis();

        StringBuilder baoCao2 = new StringBuilder();
        baoCao2.append("Thời gian hệ thống: ")
                .append(LocalDateTime.now())
                .append("\n");

        for (int i = 1; i <= soGiaoDich; i++) {
            baoCao2.append("Mã sách: B")
                    .append(i)
                    .append(" | Ngày mượn: ")
                    .append(ngayMuon)
                    .append("\n");
        }

        long end2 = System.currentTimeMillis();
        System.out.println("Thời gian chạy dùng StringBuilder: " + (end2 - start2) + " ms");

        /* In thử vài dòng đầu (tránh in quá nhiều) */
        System.out.println("\n--- 5 dòng đầu của báo cáo ---");
        System.out.println(baoCao2.substring(0, 200));
    }
}
