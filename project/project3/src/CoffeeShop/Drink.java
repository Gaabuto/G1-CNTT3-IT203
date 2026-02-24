package CoffeeShop;

public class Drink {
    protected String id;
    protected String name;
    protected double price;

    public Drink(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    double calculatePrice() {
        return price;
    }
    void displayInfo() {
        System.out.println("CoffeeShop.Drink ID: " + id);
        System.out.println("CoffeeShop.Drink Name: " + name);
        System.out.println("Price: $" + price);
    }
}
