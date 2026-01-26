import java.util.Scanner;
public class Bai3 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = 0;
        final int realMoney = 5000;
        //Nhập số lượng sách trả muộn
        System.out.print("Nhap so luong sach tra muon: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            //Nhập số ngày trễ của cuốn sách
            System.out.print("Nhap so ngay tre cua cuon thu " + i + ": ");
            int ngayTre = sc.nextInt();
            //Cộng dồn vào biến total
            total += ngayTre * realMoney;
        }
        //In ra tổng số tiền phạt cuối cùng
        System.out.println("===> Tong tien phat: " + total + " VND");
    }
}