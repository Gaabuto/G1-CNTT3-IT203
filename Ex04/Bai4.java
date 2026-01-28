package Ex04;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã thẻ thư viện (VD: TV202312345): ");
        String cardID = sc.nextLine();
        String regex = "^[A-Z]{2}\\d{4}\\d{5}$"; // sai chộ nào
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(cardID);
        if (matcher.matches()) {
            System.out.println("Mã thẻ hợp lệ!");
        } else {
            System.out.println("Mã thẻ không hợp lệ. Vui lòng kiểm tra:");
            if (!cardID.matches("^[A-Z]{2}.*")) {
                System.out.println("-> Lỗi: Mã thẻ phải bắt đầu bằng 2 chữ cái IN HOA (Ví dụ: TV)");
            }
            if (cardID.length() != 11) {
                System.out.println("-> Lỗi: Độ dài mã thẻ không đúng (Yêu cầu 11 ký tự)");
            }
            else {
                String numberPart = cardID.substring(2);
                if (!numberPart.matches("\\d+")) {
                    System.out.println("-> Lỗi: 9 ký tự sau cùng phải là số nguyên");
                }
            }
        }
    }
}