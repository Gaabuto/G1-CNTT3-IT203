import java.util.Arrays;
public class Bai4 {
    //Phương thức sắp xếp mảng (Bubble Sort)
    public static void sortBooks(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    //Phương thức in mảng
    public static void displayBooks(int[] arr) {
        System.out.println(Arrays.toString(arr)); //In mảng nhanh
    }
    public static void main(String[] args) {
        //Khởi tạo mảng ngẫu nhiên
        int[] books = {105, 102, 109, 101, 103};
        //In mảng trước khi sắp xếp
        System.out.print("Trước khi sắp xếp: ");
        displayBooks(books);

        sortBooks(books);

        System.out.print("Sau khi sắp xếp: ");
        displayBooks(books);
    }
}