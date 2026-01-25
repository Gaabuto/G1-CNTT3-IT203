import java.util.Scanner;
public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // nhập vào một số nguyên 4 chữ số
        System.out.print("Nhập mã sách (4 chữ số): ");
        int code = sc.nextInt();

        // Tách các chữ số bằng toán tử số học
        int thousands = code / 1000;
        int hundreds  = (code / 100) % 10;
        int dozens    = (code / 10) % 10;
        int units     = code % 10;

        // Tính tổng 3 chữ số đầu
        int sumOfFirstThreeNumber = thousands + hundreds + dozens;

        // Số dư của sumOfFirstThreeNumber % 10 phải bằng donVi
        int expectedCheckDigit = sumOfFirstThreeNumber % 10;

        // Kiểm tra hợp lệ (toán tử logic)
        boolean isValid = expectedCheckDigit == units;

        // Xuất kết quả
        System.out.println("Chữ số kiểm tra kỳ vọng: " + expectedCheckDigit);
        System.out.println("Kết quả kiểm tra mã sách: " + (isValid ? "HỢP LỆ" : "SAI MÃ"));
    }
}
