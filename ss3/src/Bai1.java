import java.util.Scanner;



public class Bai1 {
    public static int[] addBookToLibraries(int n){
        Scanner scanner = new Scanner(System.in);
        int [] bookIds = new int[n];
        for(int i = 0; i < n; i ++){

            System.out.println("Nhap ma so sach " + (i + 1) + ": ");
            bookIds[i] = scanner.nextInt();
        }
        return bookIds;
    }

    public static void displayLibraries(int[] arr){
        System.out.println("Ma so sach trong thu vien: ");
        for(int i = 0; i < arr.length; i ++){
            System.out.println("Sach thu " + (i + 1) + ": " + arr[i]);
        }
    }


    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of libraries: ");
        int n = scanner.nextInt();
        int [] codeBook = addBookToLibraries(n);
        displayLibraries(codeBook);
    }
}
