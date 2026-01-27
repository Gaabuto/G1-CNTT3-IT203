import java.util.Scanner;

public class Bai4 {
    public static void sortBooks(int[] arr){
        int n = arr.length;
        System.out.println("Trước khi sắp xếp: [");
        for(int i = 0; i < n; i ++){
            System.out.println(arr[i]);
        }
        System.out.println("]");

        for(int i = 0; i < n - 1; i ++){
            for(int j = 0; j < n - i - 1; j ++){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Sau khi sap xep: ");
        for(int i = 0; i < n; i ++){
            System.out.println(arr[i]);
        }
        System.out.println("]");
    }

    static void main() {

        Scanner scanner = new Scanner(System.in);
        int[] isbns = {
                10001,
                10002,
                10003,
                10004,
                10005
        };
        sortBooks(isbns);
    }
}
