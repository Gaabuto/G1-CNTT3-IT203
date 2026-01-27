import java.util.Scanner;

public class Bai6 {
    public static int[] mergeBooks(int[] a, int[] b) {
        int[] merge = new int[a.length + b.length];
        int size = 0;

        for (int i = 0; i < a.length; i++) {
            merge[size++] = a[i];
        }

        for (int i = 0; i < b.length; i++) {
            int value = b[i];

            boolean exists = false;
            for (int j = 0; j < size; j++) {
                if (merge[j] == value) {
                    exists = true;
                    break;
                }
            }

            if (exists) continue;

            int count = 0;
            while (count < size && merge[count] < value) {
                count++;
            }

            for (int j = size; j > count; j--) {
                merge[j] = merge[j - 1];
            }

            merge[count] = value;
            size++;
        }

        int[] result = new int[size];
        for (int i = 0; i < size; i++) {
            result[i] = merge[i];
        }

        return result;
    }


    static void main() {
        Scanner scanner = new Scanner(System.in);
        int[] arrayFirst = {
                1, 2, 3, 4, 5
        };
        int[] arraySecond = {
                6, 7, 8, 9, 10
        };
        int[] mergedArray = mergeBooks(arrayFirst, arraySecond);
        System.out.println("Kho cu: ");
        for(int i = 0; i < arrayFirst.length; i ++){
            System.out.println(arrayFirst[i]);
    }
        System.out.println("Kho moi: ");
        for(int i = 0; i < arraySecond.length; i ++){
            System.out.println(arraySecond[i]);
        }
        System.out.println("Kho sau khi gop: ");
        for(int i = 0; i < mergedArray.length; i ++){
            System.out.println(mergedArray[i]);
        }
    }
}
