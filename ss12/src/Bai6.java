import java.util.*;

class Medicine {
    String drugId;
    String drugName;
    double unitPrice;
    int quantity;

    Medicine(String drugId, String drugName, double unitPrice, int quantity) {
        this.drugId = drugId;
        this.drugName = drugName;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    double getTotal() {
        return unitPrice * quantity;
    }

    public String toString() {
        return String.format("%s %s %s %s %s",
                drugId, drugName, unitPrice, quantity, getTotal());
    }
}

public class Bai6 {

    static Scanner sc = new Scanner(System.in);
    static List<Medicine> list = new ArrayList<>();

    static void menu() {
        System.out.println("\n========= MENU KÊ ĐƠN =========");
        System.out.println("1. Thêm thuốc");
        System.out.println("2. Điều chỉnh số lượng");
        System.out.println("3. Xóa thuốc");
        System.out.println("4. In hóa đơn");
        System.out.println("5. Tìm thuốc giá < 50.000");
        System.out.println("6. Thoát");
        System.out.print("Chọn: ");
    }

    static void addMedicine() {
        System.out.print("Mã thuốc: ");
        String id = sc.nextLine();
        int flag = 0;

        for (Medicine m : list) {
            if (m.drugId.equals(id)) {
                System.out.print("Nhập số lượng thêm: ");
                int qty = Integer.parseInt(sc.nextLine());
                m.quantity += qty;
                System.out.println("Đã cộng thêm số lượng.");
                flag = 1;
            }
        }

        if (flag == 0) {
            System.out.print("Tên thuốc: ");
            String name = sc.nextLine();

            System.out.print("Đơn giá: ");
            double price = Double.parseDouble(sc.nextLine());

            System.out.print("Số lượng: ");
            int qty = Integer.parseInt(sc.nextLine());

            list.add(new Medicine(id, name, price, qty));
            System.out.println("Đã thêm thuốc mới.");
        }
    }

    static void updateQuantity() {
        System.out.print("Nhập mã thuốc: ");
        String id = sc.nextLine();
        int flag = 0;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).drugId.equals(id)) {
                flag++;
                System.out.print("Nhập số lượng mới: ");
                int newQty = Integer.parseInt(sc.nextLine());

                if (newQty == 0) {
                    list.remove(i);
                    System.out.println("Đã xóa thuốc khỏi đơn.");
                } else {
                    list.get(i).quantity = newQty;
                    System.out.println("Đã cập nhật số lượng.");
                }
            }
        }

        if (flag == 0) {
            System.out.println("Không tìm thấy thuốc.");
        }
    }

    static void deleteMedicine() {
        System.out.print("Nhập mã thuốc cần xóa: ");
        String id = sc.nextLine();
        int flag = 0;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).drugId.equals(id)) {
                list.remove(i);
                System.out.println("Đã xóa thuốc.");
                flag++;
            }
        }

        if (flag == 0) {
            System.out.println("Không tìm thấy thuốc.");
        }
    }

    static void printInvoice() {

        if (list.isEmpty()) {
            System.out.println("Đơn thuốc trống.");
            return;
        }

        double total = 0;

        System.out.println("\n============= HÓA ĐƠN =============");
        System.out.printf("%s %s %s %s %s\n",
                "Mã", "Tên", "Giá", "SL", "Thành tiền");

        for (Medicine m : list) {
            System.out.println(m);
            total += m.getTotal();
        }

        System.out.println("Tổng tiền: " + total + " VNĐ");

        list.clear();
        System.out.println("Đã hoàn tất đơn và làm mới danh sách.");
    }

    static void findCheapMedicine() {

        boolean found = false;

        for (Medicine m : list) {
            if (m.unitPrice < 50000) {
                System.out.println(m.drugId + " " + m.drugName + " " + m.unitPrice);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Không có thuốc giá dưới 50.000.");
        }
    }

    public static void main(String[] args) {

        int choice;

        do {
            menu();
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    addMedicine();
                    break;
                case 2:
                    updateQuantity();
                    break;
                case 3:
                    deleteMedicine();
                    break;
                case 4:
                    printInvoice();
                    break;
                case 5:
                    findCheapMedicine();
                    break;
                case 6:
                    System.out.println("Thoát chương trình");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }

        } while (choice != 6);
    }
}