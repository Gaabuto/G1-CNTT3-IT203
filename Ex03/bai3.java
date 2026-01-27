package Ex03;

public class bai3 {

    public static void main(String[] args) {
        String[] names = {"Java Basic", "Python", "C++", "Frontend", "CSDL my SQL"};

        int[] quantities = {20, 50, 15, 50, 5};
        int maxVal = quantities[0];
        for (int i = 1; i < quantities.length; i++) {
            if (quantities[i] > maxVal) {
                maxVal = quantities[i];
            }
        }

        System.out.println("Sách có số lượng nhiều nhất (" + maxVal + "):");
        for (int i = 0; i < quantities.length; i++) {
            if (quantities[i] == maxVal) {
                System.out.println(" - " + names[i]);
            }
        }

        int minVal = quantities[0];
        for (int i = 1; i < quantities.length; i++) {
            if (quantities[i] < minVal) {
                minVal = quantities[i];
            }
        }

        System.out.println("Sách có số lượng ít nhất (" + minVal + "):");
        for (int i = 0; i < quantities.length; i++) {
            if (quantities[i] == minVal) {
                System.out.println(" - " + names[i]);
            }
        }
    }
}