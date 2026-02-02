package Ex07.bai2;

public class Main {
    public static void main(String[] args) {
        int age = 21;
        int newAge = age;
        newAge = 18;

        System.out.println("Tuổi: "+age);
        System.out.println("Tuổi mới: "+newAge);
        System.out.println("==================");

        Infor n1 = new Infor("Nguyễn Tiến Thành");
        Infor n2 = n1;
        n2.name = "Trần bảo khánh";
        System.out.println("Tên: "+n1.name);
        System.out.println("Tên mới: "+n2.name);
    }
}
