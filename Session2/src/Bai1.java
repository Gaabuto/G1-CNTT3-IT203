import java.util.Scanner;
public class Bai1 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Nhập tuổi (số nguyên) và số sách đang giữ (số nguyên)
        System.out.print("Nhap tuoi cua ban: ");
        int tuoi = sc.nextInt();
        System.out.print("Nhap so sach dang muon: ");
        int soSach = sc.nextInt();

        if (tuoi >= 18 && soSach < 3) {
            //Nếu thỏa mãn
            System.out.println("Ket qua: Ban DU DIEU KIEN muon sach quy hiem.");
        } else {
            //Nếu không
            System.out.println("Ket qua: Khong du dieu kien.");
            if (tuoi < 18) {
                System.out.println("- Ly do: Ban phai tu 18 tuoi tro len.");
            } else if (soSach >= 3) {
                System.out.println("- Ly do: Ban da muon toi da 3 cuon.");
            }
        }
    }
}