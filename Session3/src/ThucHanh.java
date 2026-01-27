import java.util.Scanner;
public class ThucHanh {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int MAX = 100;// kích thước tối đa
        int[] ids = new int[MAX];
        String[] titles = new String[MAX];
        int[] quantities = new int[MAX];

        int size = 0;// số sách hiện có
        int choice;
        do {
            System.out.println("===== MENU QUAN LY SACH =====");
            System.out.println("1. Xem danh sach");
            System.out.println("2. Them sach moi");
            System.out.println("3. Cap nhat so luong");
            System.out.println("4. Xoa sach");
            System.out.println("5. Tim kiem theo ten");
            System.out.println("6. Sap xep giam dan theo so luong");
            System.out.println("7. Thoat");
            System.out.print("Lua chon cua ban: ");
            choice = sc.nextInt();
            sc.nextLine(); // xóa Enter
            switch (choice) {
                case 1:
                    //Xem danh sách
                    System.out.println("\nMa | Ten sach | So luong");
                    for (int i = 0; i < size; i++) {
                        System.out.println(ids[i] + " | " + titles[i] + " | " + quantities[i]);
                    }
                    break;

                case 2:
                    //Thêm sách
                    if (size == MAX) {
                        System.out.println("Mang day");
                        break;
                    }
                    System.out.print("Nhap ma sach: ");
                    int newId = sc.nextInt();
                    sc.nextLine();
                    boolean exists = false;
                    for (int i = 0; i < size; i++) {
                        if (ids[i] == newId) {
                            exists = true;
                            break;
                        }
                    }
                    if (exists) {
                        System.out.println("Ma sach khong duoc trung");
                        break;
                    }
                    System.out.print("Nhap ten sach: ");
                    String newTitle = sc.nextLine();
                    System.out.print("Nhap so luong: ");
                    int newQty = sc.nextInt();
                    ids[size] = newId;
                    titles[size] = newTitle;
                    quantities[size] = newQty;
                    size++;
                    System.out.println("Them sach thanh cong");
                    break;
                case 3:
                    //Cập nhật số lượng
                    System.out.print("Nhap ma sach can cap nhat: ");
                    int updateId = sc.nextInt();
                    boolean foundUpdate = false;
                    for (int i = 0; i < size; i++) {
                        if (ids[i] == updateId) {
                            System.out.print("Nhap so luong moi: ");
                            quantities[i] = sc.nextInt();
                            foundUpdate = true;
                            System.out.println("Cap nhat thanh cong");
                            break;
                        }
                    }
                    if (!foundUpdate) {
                        System.out.println("Khong co sach");
                    }
                    break;
                case 4:
                    //Xóa sách
                    System.out.print("Nhap ma sach can xoa: ");
                    int deleteId = sc.nextInt();
                    int index = -1;
                    for (int i = 0; i < size; i++) {
                        if (ids[i] == deleteId) {
                            index = i;
                            break;
                        }
                    }
                    if (index == -1) {
                        System.out.println("Khong co sach");
                        break;
                    }
                    for (int i = index; i < size - 1; i++) {
                        ids[i] = ids[i + 1];
                        titles[i] = titles[i + 1];
                        quantities[i] = quantities[i + 1];
                    }
                    size--;
                    System.out.println("Xoa sach thanh cong");
                    break;

                case 5:
                    //Tìm kiếm sách
                    System.out.print("Nhap tu khoa: ");
                    String keyword = sc.nextLine().toLowerCase();
                    System.out.println("\nKet qua tim kiem:");
                    for (int i = 0; i < size; i++) {
                        if (titles[i].toLowerCase().contains(keyword)) {
                            System.out.println(ids[i] + " | " + titles[i] + " | " + quantities[i]);
                        }
                    }
                    break;
                case 6:
                    //Sắp xếp theo số lượng
                    for (int i = 0; i < size - 1; i++) {
                        for (int j = i + 1; j < size; j++) {
                            if (quantities[i] < quantities[j]) {
                                //Đổi quantities
                                int tempQ = quantities[i];
                                quantities[i] = quantities[j];
                                quantities[j] = tempQ;
                                //Đổi ids
                                int tempId = ids[i];
                                ids[i] = ids[j];
                                ids[j] = tempId;
                                //Đổi titles
                                String tempTitle = titles[i];
                                titles[i] = titles[j];
                                titles[j] = tempTitle;
                            }
                        }
                    }
                    System.out.println("Sap xep giam dan thanh cong");
                    break;
                case 7:
                    System.out.println("Thoat chuong trinh");
                    break;
                default:
                    System.out.println("Lua chon khong hop le");
            }
        } while (choice != 7);
    }
}