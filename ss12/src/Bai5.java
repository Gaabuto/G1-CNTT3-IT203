import java.util.*;

class Patient {
    String id;
    String fullName;
    int age;
    String diagnosis;

    Patient(String id, String fullName, int age, String diagnosis) {
        this.id = id;
        this.fullName = fullName;
        this.age = age;
        this.diagnosis = diagnosis;
    }

    public String toString() {
        return "ID: " + id +
                " | Tên: " + fullName +
                " | Tuổi: " + age +
                " | Chẩn đoán: " + diagnosis;
    }
}

public class Bai5 {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<Patient> list = new ArrayList<>();

    static void menu() {
        System.out.println("=========== MENU ===========");
        System.out.println("1. Tiếp nhận bệnh nhân");
        System.out.println("2. Cập nhật chẩn đoán");
        System.out.println("3. Xuất viện");
        System.out.println("4. Sắp xếp danh sách bệnh nhân");
        System.out.println("5. Hiển thị danh sách");
        System.out.println("6. Thoát");
        System.out.print("Chọn chức năng: ");
    }

    static void addPatient() {
        System.out.print("Nhập ID: ");
        String id = sc.nextLine();

        for (Patient p : list) {
            if (p.id.equals(id)) {
                System.out.println("ID đã tồn tại!");
                return;
            }
        }

        System.out.print("Nhập tên: ");
        String name = sc.nextLine();

        System.out.print("Nhập tuổi: ");
        int age = Integer.parseInt(sc.nextLine());

        System.out.print("Nhập chẩn đoán: ");
        String diagnosis = sc.nextLine();

        list.add(new Patient(id, name, age, diagnosis));
        System.out.println("Thêm bệnh nhân thành công.");
    }

    static void updatePatient() {
        System.out.print("Nhập ID cần cập nhật: ");
        String id = sc.nextLine();

        for (Patient p : list) {
            if (p.id.equals(id)) {
                System.out.print("Nhập chẩn đoán mới: ");
                p.diagnosis = sc.nextLine();
                System.out.println("Cập nhật thành công.");
                return;
            }
        }

        System.out.println("Không tìm thấy bệnh nhân.");
    }

    static void retiredPatient() {
        System.out.print("Nhập ID cần xuất viện: ");
        String id = sc.nextLine();

        Iterator<Patient> it = list.iterator();

        while (it.hasNext()) {
            Patient p = it.next();
            if (p.id.equals(id)) {
                it.remove();
                System.out.println("Đã xuất viện.");
                return;
            }
        }

        System.out.println("Không tìm thấy bệnh nhân.");
    }


    static void displayPatients() {
        if (list.size() == 0) {
            System.out.println("Danh sách trống.");
            return;
        }else{
            System.out.println("Danh sách bệnh nhân:");
        }

        for (Patient p : list) {
            System.out.println(p);
        }
    }

    public static void main(String[] args) {

        int choice;

        do {
            menu();
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    addPatient();
                    break;
                case 2:
                    updatePatient();
                    break;
                case 3:
                    retiredPatient();
                    break;
                case 4:
                    displayPatients();
                    break;
                case 5:
                    System.out.println("Thoát chương trình");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ");
            }

        } while (choice != 6);
    }
}