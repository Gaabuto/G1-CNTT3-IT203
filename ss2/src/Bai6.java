import java.util.Scanner;

public class Bai6 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int biggest = 0;
        int avg = 0;
        int smallest = 0;
        for (int i = 1; i < 8; i ++){
            System.out.println("Nhập luot muon ngay thu " + i + ": ");
            int borrowCount = Integer.parseInt(scanner.nextLine());
            if (borrowCount > biggest) {
                biggest = borrowCount;
            }
            if(borrowCount < smallest) {
                smallest = borrowCount;
            }
            if(borrowCount != 0) {
                avg += borrowCount;
            }
        }
        System.out.println("-- Ket qua thong ke --");
        System.out.println("Luot muon cao nhat: " + biggest);
        System.out.println("Luot muon thap nhat: " + smallest);
        System.out.println("Trung binh luot muon: " + (avg/7));
    }
}
