import java.util.Scanner;

public class baitap4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập mã thẻ thư viện: ");
        String maThe = sc.nextLine().trim();

        // Regex cho từng phần
        String regexPrefix = "^[A-Z]{2}.*";
        String regexYear = "^[A-Z]{2}\\d{4}.*";
        String regexFull = "^[A-Z]{2}\\d{4}\\d{5}$";

        if (!maThe.matches(regexPrefix)) {
            System.out.println("❌ Thiếu hoặc sai tiền tố (phải là 2 chữ cái viết hoa, ví dụ: TV)");
        }
        else if (maThe.length() < 6 || !maThe.substring(2, 6).matches("\\d{4}")) {
            System.out.println("❌ Năm vào học không hợp lệ (phải gồm 4 chữ số)");
        }
        else if (!maThe.matches(regexFull)) {
            System.out.println("❌ Phần số ngẫu nhiên không hợp lệ (phải gồm 5 chữ số)");
        }
        else {
            System.out.println("✅ Mã thẻ hợp lệ!");
        }
    }
}
