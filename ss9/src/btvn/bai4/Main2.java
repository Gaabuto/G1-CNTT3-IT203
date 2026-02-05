package btvn.bai2;

public class Main2 {
    public static void main(String[] args) {

        Animal animal = new Dog();

        if (animal instanceof Dog) {
            animal.makeSound();
        }
    }
}
