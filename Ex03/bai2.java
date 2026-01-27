package Ex03;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] library = {"Doraemon", "Bếp lửa", "Chiếc thuyền ngoài xa", "Truyện Kiều", "Lao Hạc"};

        System.out.print("Nhập tên sách cần tìm: ");
        String searchName = scanner.nextLine();

        int result = searchBooks(library, searchName);

        if (result != -1) {
            System.out.println("Tìm thấy sách '" + searchName + "' tại vị trí: " + result);
        } else {
            System.out.println("Sách không có trong thư viện.");
        }
    }

    public static int searchBooks(String[] arr, String search) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(search)) {
                return i;
            }
        }
        return -1;
    }
}