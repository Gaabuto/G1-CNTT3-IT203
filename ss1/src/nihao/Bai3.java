package nihao;

public class Bai3 {
    static void main() {
        String book1 = "Java Basic";
        String book2 = "Python Intro";
        System.out.printf("Trước khi đổi: book1 = %s, book2 = %s\n", book1, book2);
        String temp = book1;
        book1 = book2;
        book2 = temp;
        System.out.printf("Sau khi đổi: book1 = %s, book2 = %s\n", book1, book2);
    }
}
