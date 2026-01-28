public class Bai4 {

    public static void main() {

        String cardID = "TV202312345";

        if (!cardID.matches("^[A-Z]{2}.*")) {
            System.out.println("Mã thẻ phải bắt đầu bằng 2 chữ cái viết hoa");
        }
        else if (!cardID.substring(2, 6).matches("\\d{4}")) {
            System.out.println("Năm không hợp lệ");
        }
        else if (!cardID.substring(6).matches("\\d{5}")) {
            System.out.println("5 ký tự cuối phải là số");
        }
        else {
            System.out.println("Mã thẻ hợp lệ!");
        }
    }
}
