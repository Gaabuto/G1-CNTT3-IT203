package Student;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Student {
    private String id;
    private String name_student;
    private double score;
    public Student(String id, String name_student, double score) {
        this.id = id;
        this.name_student = name_student;
        this.score = score;
    }
    public String getId() {
            return id;
    }
    public String getName_student() {
        return name_student;
    }
    public double getScore() {
        return score;
    }
    public void getRank() {
        if (score >= 8) {
            System.out.println("Gioi");
        } else if (score >= 6.5) {
            System.out.println("Kha");
        } else {
            System.out.println("Trung Binh");
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public void displayInfo() {
        System.out.printf("Mã sinh viên: %s, Tên sinh viên: %s, Điểm số: %.2f, Học lực: ", id, name_student, score);
        getRank();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        int countStudents = 0;
        Student[] students = new Student[100];
        do {
            System.out.println("""
                    ===== QUẢN LÝ ĐIỂM SINH VIÊN =====
                    1. Nhập danh sách sinh viên\s
                    2. Hiển thị danh sách sinh viên\s
                    3. Tìm kiếm sinh viên theo Học lực\s
                    4. Sắp xếp theo học lực giảm dần
                    5. Thoát\s
                    ==================================
                    Chọn chức năng:\s
                    
                    """);
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1 -> {
                    System.out.print("Nhập số lượng sinh viên: ");
                    int n = Integer.parseInt(scanner.nextLine());
                    for (int i = 0; i < n; i++) {
                        System.out.printf("Nhập thông tin sinh viên thứ %d:\n", i + 1);
                        System.out.print("Mã sinh viên: ");
                        String id = scanner.nextLine();
                        if(!Pattern .compile("^SV+[0-9]{3}$").matcher(id).matches()){
                            System.out.println("Quy tac khong hop le");
                            i--;
                            continue;
                        }
                        System.out.print("Tên sinh viên: ");
                        String name = scanner.nextLine();
                        System.out.print("Điểm số: ");
                        double score = Double.parseDouble(scanner.nextLine());
                        if(score < 0 || score > 10){
                            System.out.println("Diem so khong hop le");
                            i--;
                            continue;
                        }
                        students[i] = new Student(id, name, score);
                    }
                    System.out.println("Danh sách sinh viên đã được nhập.");
                }
                case 2 -> {
                    System.out.println("------------------------------------------");
                    System.out.println("Danh sách sinh viên:");
                    for (int i = 0; i < students.length; i++) {
                        if (students[i] != null) {
                            students[i].displayInfo();
                        }
                    }
                    System.out.println("------------------------------------------");
                }
                case 3 -> {
                    System.out.println("Nhập học lực cần tìm (Gioi, Kha, Trung Binh): ");
                    String rank = scanner.nextLine();
                    System.out.println("Kết quả tìm kiếm:");
                    for (int i = 0; i < students.length; i++) {
                        if (students[i] != null) {
                            if (rank.equalsIgnoreCase("Gioi") && students[i].getScore() >= 8) {
                                students[i].displayInfo();
                            } else if (rank.equalsIgnoreCase("Kha") && students[i].getScore() >= 6.5) {
                                students[i].displayInfo();
                            } else {
                                students[i].displayInfo();
                            }
                        }
                    }
                }
                case 4 -> {
                    for (int i = 0; i < students.length - 1; i++) {
                        for (int j = i + 1; j < students.length; j++) {
                            if (students[i] != null && students[j] != null) {
                                if (students[i].getScore() < students[j].getScore()) {
                                    Student temp = students[i];
                                    students[i] = students[j];
                                    students[j] = temp;
                                }
                            }
                        }
                    }
                    System.out.println("Danh sách sinh viên sau khi sắp xếp theo học lực giảm dần:");
                    for (int i = 0; i < students.length; i++) {
                        if (students[i] != null) {
                            students[i].displayInfo();
                        }
                    }
                }
                case 5 -> System.out.println("Thoát chương trình.");
                default -> System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
                }
        }while(choice != 5);

    }

}
