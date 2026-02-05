class Animal4 {
    public void sound() {
        System.out.println("Động vật phát ra âm thanh");
    }
}

class Dog4 extends Animal4 {
    @Override
    public void sound() {
        System.out.println("Gâu gâu");
    }

    public void bark() {
        System.out.println("Chó đang sủa to");
    }
}

public class Bai4 {
    public static void main(String[] args) {
        Animal4 animal = new Dog4();

        animal.sound();
    }
}
