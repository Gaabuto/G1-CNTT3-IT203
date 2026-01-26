import java.util.Scanner;

public class Bai2 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi nhap 1 chu cai");
        char ch = scanner.nextLine().charAt(0);
        System.out.print("Vị trí:  ");
        switch (ch)
        {

            case 'A':
                System.out.print("Tầng 1: Sách Văn học");
                break;
            case 'B':
                System.out.print("Tầng 2: Sách Khoa học");
                break;
            case 'C':
                System.out.print("Tầng 3: Sách Ngoại ngữ");
                break;
            case 'D':
                System.out.print("Tầng 4: Sách Tin học");
                break;
            default:
                System.out.println("Mã khu vực không hợp lệ");
        }
    }
}
