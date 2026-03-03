package thuchanhdaugio;

public class FoodProduct extends Product{
    public int discountPercent;

    public FoodProduct(int id, String name, double price, int discountPercent) {
        super(id, name, price);
        this.discountPercent = discountPercent;
    }
    @Override
    public double calculateFinalPrice() {
        return getPrice() - (getPrice() - discountPercent / 100.0);
    }
    @Override
    public void displayInfo() {
        System.out.println("ID: %d, Name: %s, Price: %.2f%n, discount percent: %d\", id, name, price, discountPercent");
    }
}
