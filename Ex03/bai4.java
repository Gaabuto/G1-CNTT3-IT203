package Ex03;

public class bai4 {
    public static void main(String[] args) {

        int[] books = {105, 102, 109, 101, 103};
        System.out.print("Trước khi sắp xếp: [");

        for (int i = 0; i < books.length; i++) {
            System.out.print(books[i]);
            if (i < books.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        int n = books.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (books[j] > books[j + 1]) {
                    int temp = books[j];
                    books[j] = books[j + 1];
                    books[j + 1] = temp;
                }
            }
        }
        System.out.print("Sau khi sắp xếp:   [");
        for (int i = 0; i < books.length; i++) {
            System.out.print(books[i]);
            if (i < books.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}