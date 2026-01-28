package Ex04;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- NHẬP THÔNG TIN SÁCH ---");
        System.out.print("Tên sách: ");
        String title = sc.nextLine();
        System.out.print("Tên tác giả: ");
        String author = sc.nextLine();
        title = title.trim().replaceAll("\\s+", " ").toUpperCase();
        author = author.trim().replaceAll("\\s+", " ").toLowerCase();
        String[] words = author.split(" ");
        String finalAuthor = "";
        for (int i = 0; i < words.length; i++) {
            String w = words[i];
            String firstChar = w.substring(0, 1).toUpperCase();
            String remainChar = w.substring(1);
            finalAuthor += firstChar + remainChar;
            if (i < words.length - 1) {
                finalAuthor += " ";
            }
        }
        System.out.println("--- KẾT QUẢ CHUẨN HÓA ---");
        System.out.println("[" + title + "] - Tác giả: " + finalAuthor);
    }
}