import java.util.Scanner;

public class Bai4 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int id = 1;
        do {
            System.out.println("Mời bạn nhập mã id");
            id = Integer.parseInt(scanner.nextLine());
            if( id <=0 ) {
                System.out.println("Mã không hợp lệ, mời bạn nhập lại");
            }else {
                System.out.println("Lưu mã sách thành công");
            }
        }while( id <=0 );
        }
    }
