package Ex01;

import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mã sách (4 chữ số): ");
        int code = Integer.parseInt(scanner.nextLine());
        int thousands = code / 1000;
        int hundreds = (code / 100) % 10;
        int dozens = (code / 10) % 10;
        int units = code % 10;
        int sumOfFirstThree = thousands + hundreds + dozens;
        int expectedUnit = sumOfFirstThree % 10;
        boolean isValid = (units == expectedUnit);
        System.out.println("Chữ số kiểm tra kỳ vọng: " + expectedUnit);
        String resultText = isValid ? "HỢP LỆ" : "SAI MÃ";
        System.out.println("Kết quả kiểm tra mã sách: " + resultText);
    }
}