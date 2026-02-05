package Ex09.Bai4;

public class Main {
    public static void main(String[] args) {
        Dog animal = new Dog();

        System.out.println("Phương thức chung:");
        animal.eat();

        System.out.println("Phương thức riêng:");
        animal.bark();
    }
}