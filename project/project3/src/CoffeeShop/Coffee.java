package CoffeeShop;

public class Coffee extends Drink{
    protected boolean hasMilk;
    public Coffee(String id, String name, double price, boolean hasMilk) {
        super(id, name, price);
        this.hasMilk = hasMilk;
    }

        @Override
    double calculatePrice() {
        double finalPrice = super.calculatePrice();
        if (hasMilk) {
            finalPrice += 5000; // Add cost for milk
        }
        return finalPrice;
    }
        @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Contains Milk: " + (hasMilk ? "True" : "False"));
    }
}
