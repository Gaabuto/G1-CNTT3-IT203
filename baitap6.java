import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class baitap6 {

    // Hàm tạo chuỗi **** theo độ dài từ
    public static String taoDauSao(int len) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len; i++) {
            sb.append("*");
        }
        return sb.toString();
    }

    public static void main(String[] args) {

        // Blacklist từ nhạy cảm
        String[] blackList = { "ngu", "xau", "te", "doan" };

        // Đánh giá mẫu
        String danhGia = "Cuốn sách này nội dung không ngu nhưng phần đầu hơi te, "
                + "cách viết khá xau và có vài đoạn đọc rất doan. "
                + "Tuy nhiên về tổng thể thì sách mang lại nhiều kiến thức bổ ích "
                + "cho sinh viên ngành công nghệ thông tin và rất đáng để tham khảo thêm.";

        /* ======================
           1. TẠO REGEX BLACKLIST
           ====================== */
        String regex = "(?i)\\b(" + String.join("|", blackList) + ")\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(danhGia);

        StringBuffer daLoc = new StringBuffer();

        // Thay thế từ nhạy cảm bằng ****
        while (matcher.find()) {
            String tuCam = matcher.group();
            matcher.appendReplacement(daLoc, taoDauSao(tuCam.length()));
        }
        matcher.appendTail(daLoc);

        String ketQua = daLoc.toString();

        /* ======================
           2. CẮT NGẮN NẾU QUÁ DÀI
           ====================== */
        if (ketQua.length() > 200) {
            int viTriCat = ketQua.lastIndexOf(" ", 200);

            if (viTriCat == -1) {
                viTriCat = 200;
            }

            StringBuilder rutGon = new StringBuilder();
            rutGon.append(ketQua.substring(0, viTriCat))
                    .append("...");

            ketQua = rutGon.toString();
        }

        /* ======================
           3. IN KẾT QUẢ
           ====================== */
        System.out.println("ĐÁNH GIÁ SAU KHI XỬ LÝ:");
        System.out.println(ketQua);
    }
}
