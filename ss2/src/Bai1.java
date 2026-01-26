import java.util.Scanner;

public class Bai1 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tuổi: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập số sách đang mượn: ");
        int borrowedBooks = Integer.parseInt(scanner.nextLine());
        if (age > 18) {
            System.out.println("Bạn chưa đủ tuổi");
        } else if (borrowedBooks < 3){
            System.out.println("Bạn đã mượn quá số lượng cho phép");
        }else {
            System.out.println("Không đủ điều kiện mượn sách.");
        }
    }
}
