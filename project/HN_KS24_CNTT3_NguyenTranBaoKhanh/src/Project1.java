import java.util.Scanner;

public class Project1 {


    static void main() {
        Scanner scanner = new Scanner(System.in);
        String[] MSSV = new String[100];
        int choice = 0;
        do {
            System.out.println("Menu:");
            System.out.println("1. Hien thi danh sach sinh vien");
            System.out.println("2. Them sinh vien");
            System.out.println("3. Cap nhat sinh vien");
            System.out.println("4. Xoa sinh vien");
            System.out.println("5. Tim kiem sinh vien");
            System.out.println("6. Thoat");
            System.out.print("Nhap lua chon cua ban: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    displayStudents(MSSV);
                    break;
                case 2:
                    addStudent(MSSV);
                    break;
                case 3:
                    updateStudent(MSSV);
                    break;
                case 4:
                    deleteStudent(MSSV);
                    break;
                case 5:
                    searchStudent(MSSV);
                    break;
                case 6:
                    System.out.println("Thoat chuong trinh.");
                    break;
                default:
                    System.out.println("Lua chon khong hop le. Vui long thu lai.");
            }
        } while (choice != 6);

        System.out.println("Tam biet!");
    }

    public static void displayStudents(String[] MSSV) {
        System.out.println("Danh sach sinh vien:");
        for (int i = 0; i < MSSV.length; i++) {
            if (MSSV[i] != null) {
                System.out.println((i + 1) + ". " + MSSV[i]);
            }
        }
    }

    public static void addStudent(String[] MSSV) {
        Scanner scanner = new Scanner(System.in);
        String regex = "B[0-9]{7}";
        System.out.print("Nhap MSSV cua sinh vien can them: ");
        String newMSSV = scanner.nextLine();
        for (int i = 0; i < MSSV.length; i++) {
            if (MSSV[i] == null) {
                if (newMSSV.matches(regex)) {
                    MSSV[i] = newMSSV;
                    System.out.println("Da them sinh vien voi MSSV: " + newMSSV);
                    return;
                } else {
                    System.out.println("MSSV khong hop le. Vui long nhap lai.");
                    return;
                }
            }

        }
        System.out.println("Danh sach sinh vien da day. Khong the them sinh vien moi.");
    }

    public static void updateStudent(String[] MSSV) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap index cua sinh vien can cap nhat: ");
        String index = scanner.nextLine();
        String regex = "B[0-9]{7}";
        int idx = Integer.parseInt(index) - 1;
        if (idx >= 0 && idx < MSSV.length && MSSV[idx] != null) {
            System.out.print("Nhap MSSV moi: ");
            String newMSSV = scanner.nextLine();
            if (newMSSV.matches(regex)) {
                MSSV[idx] = newMSSV;
                System.out.println("Da cap nhat MSSV cua sinh vien tai index " + (idx + 1) + " thanh " + newMSSV);
            } else {
                System.out.println("MSSV khong hop le. Vui long nhap lai.");
            }
        } else {
            System.out.println("Index khong hop le hoac khong co sinh vien tai index do.");
        }
    }

    public static void deleteStudent(String[] MSSV) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap MSSV cua sinh vien can xoa: ");
        String deleteMSSV = scanner.nextLine();
        int index = -1;
        for (int i = 0; i < MSSV.length; i++) {
            if (MSSV[i] != null && MSSV[i].equals(deleteMSSV)) {
                index = i;
                for(int j = i; j < MSSV.length - 1; j++) {
                    MSSV[j] = MSSV[j + 1];
                }
                MSSV[MSSV.length - 1] = null;
                System.out.println("Da xoa sinh vien voi MSSV: " + deleteMSSV);
                return;
            }
        }
        if (index == -1) {
            System.out.println("Khong tim thay sinh vien voi MSSV: " + deleteMSSV);
        }
}
    public static void searchStudent(String[] MSSV) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap MSSV cua sinh vien can tim kiem: ");
        String searchMSSV = scanner.nextLine();
        for (int i = 0; i < MSSV.length; i++) {
            if (MSSV[i] != null && MSSV[i].equals(searchMSSV)) {
                System.out.println("Da tim thay sinh vien voi MSSV: " + searchMSSV + " tai index " + (i + 1));
                return;
            }
        }
        System.out.println("Khong tim thay sinh vien voi MSSV: " + searchMSSV);
    }


}
