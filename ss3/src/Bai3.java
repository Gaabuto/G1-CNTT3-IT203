import java.util.Scanner;

public class Bai3 {

    public static void maxQuantityOfBooks(String[] names, int[] quantities) {
        int max = quantities[0];

        for (int i = 1; i < quantities.length; i++) {
            if (quantities[i] > max) {
                max = quantities[i];
            }
        }

        System.out.println("Sách có số lượng nhiều nhất (" + max + "):");
        for (int i = 0; i < quantities.length; i++) {
            if (quantities[i] == max) {
                System.out.println("- " + names[i]);
            }
        }
    }


    public static void minQuantityOfBooks(String[] names, int[] quantities) {
        int min = quantities[0];

        for (int i = 1; i < quantities.length; i++) {
            if (quantities[i] < min) {
                min = quantities[i];
            }
        }

        System.out.println("Sách có số lượng ít nhất (" + min + "):");
        for (int i = 0; i < quantities.length; i++) {
            if (quantities[i] == min) {
                System.out.println("- " + names[i]);
            }
        }
    }

    static void main() {
        Scanner scanner = new Scanner(System.in);
        String[] names = {
                "Java cơ bản",
                "Cấu trúc dữ liệu",
                "Lập trình C",
                "Python nâng cao",
                "SQL căn bản"
        };

        int[] quantities = {
                10,
                5,
                8,
                6,
                12
        };

            maxQuantityOfBooks(names, quantities);
            minQuantityOfBooks(names, quantities);
    }

}
