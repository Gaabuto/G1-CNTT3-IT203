public class Bai3 {
    //Phương thức tìm sách có số lượng lớn nhất
    public static void maxQuantityOfBooks(String[] names, int[] quantities) {
        int max = quantities[0];
        //Tìm số lượng lớn nhất
        for (int i = 1; i < quantities.length; i++) {
            if (quantities[i] > max) {
                max = quantities[i];
            }
        }
        //In tất cả sách có số lượng = max
        System.out.println("Sách có số lượng nhiều nhất (" + max + "):");
        for (int i = 0; i < quantities.length; i++) {
            if (quantities[i] == max) {
                System.out.println("- " + names[i]);
            }
        }
    }
    //Phương thức tìm sách có số lượng nhỏ nhất
    public static void minQuantityOfBooks(String[] names, int[] quantities) {
        int min = quantities[0];
        //Tìm số lượng nhỏ nhất
        for (int i = 1; i < quantities.length; i++) {
            if (quantities[i] < min) {
                min = quantities[i];
            }
        }
        //In tất cả sách có số lượng = min
        System.out.println("Sách có số lượng ít nhất (" + min + "):");
        for (int i = 0; i < quantities.length; i++) {
            if (quantities[i] == min) {
                System.out.println("- " + names[i]);
            }
        }
    }
    public static void main(String[] args) {
        // Khởi tạo dữ liệu
        String[] names = {"Python Pro","Web Design","Data Structure","Java Core","UI/UX Design"};

        int[] quantities = {50, 50, 5, 20, 30};

        maxQuantityOfBooks(names, quantities);
        System.out.println("--------------------");
        minQuantityOfBooks(names, quantities);
    }
}