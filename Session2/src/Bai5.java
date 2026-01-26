import java.util.Scanner;
public class Bai5 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Khởi tạo điểm uy tín ban đầu
        int diemUyTin = 100;
        int soNgayTre;

        System.out.println("--- HE THONG DANH GIA DOC GIA ---");
        System.out.println("(Nhap so ngay tre. Nhap 999 de ket thuc)");
        while (true) {
            System.out.print("\nSo ngay tre cua lan nay: ");
            soNgayTre = sc.nextInt();
            //Vòng lặp dừng lại khi người dùng nhập số 999
            if (soNgayTre == 999) {
                break;
            }
            //Trả đúng hạn
            if (soNgayTre <= 0) {
                diemUyTin += 5;
                System.out.println("-> Tra dung han: +5 diem.");
            //Trả muộn
            } else {
                int truDiem = soNgayTre * 2;
                diemUyTin -= truDiem;
                System.out.println("-> Tra tre " + soNgayTre + " ngay: -" + truDiem + " diem.");
            }
        }
        //In ra tổng điểm uy tín cuối cùng
        System.out.println("Tong diem uy tin: " + diemUyTin);

        if (diemUyTin > 120) {
            System.out.println("Xep loai: DOC GIA THAN THIET");
        } else if (diemUyTin >= 80) {
            System.out.println("Xep loai: DOC GIA TIEU CHUAN");
        } else {
            System.out.println("Xep loai: DOC GIA CAN LUU Y");
        }
    }
}