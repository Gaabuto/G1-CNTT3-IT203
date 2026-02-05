package Ex09.Bai2;

public class Main {
    public static void main(String[] args) {
        // Tạo đối tượng Chó
        Animal myDog = new Dog();

        // Tạo đối tượng Mèo
        Animal myCat = new Cat();

        System.out.println("--- KIỂM TRA TIẾNG KÊU ---");

        // Gọi phương thức sound()
        // Dù kiểu khai báo là Animal, nhưng nó sẽ chạy code của lớp con (Ghi đè)
        myDog.sound();
        myCat.sound();
    }
}