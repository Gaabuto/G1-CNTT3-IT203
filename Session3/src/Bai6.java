import java.util.Arrays;
public class Bai6 {
    public static int[] mergeBooks(int[] a, int[] b) {
        //Tạo ra mảng kết quả arrayMerge
        int[] temp = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;
        // Gộp 2 mảng và lọc trùng
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                temp[k++] = a[i++];
            } else if (a[i] > b[j]) {
                temp[k++] = b[j++];
            } else { // a[i] == b[j]
                temp[k++] = a[i];
                i++;
                j++;
            }
        }
        while (i < a.length) {
            temp[k++] = a[i++];
        }
        while (j < b.length) {
            temp[k++] = b[j++];
        }
        //Trả về mảng kết quả
        return Arrays.copyOf(temp, k); //Tạo ra mảng mới từ mảng cũ
    }
    public static void main(String[] args) {
        int[] khoCu = {1, 3, 5, 7, 9};
        int[] loMoi = {2, 3, 5, 6, 8, 9, 10};

        System.out.println("Kho cũ: " + Arrays.toString(khoCu));
        System.out.println("Lô mới: " + Arrays.toString(loMoi));

        int[] khoTong = mergeBooks(khoCu, loMoi);

        System.out.println("Kho tổng (đã gộp & lọc trùng): " + Arrays.toString(khoTong));
    }
}