package thuchanhdaugio;

public class ElectronicProduct extends Product {
    public int warrantyMonths;

    public ElectronicProduct(int id, String name, double price, int warrantyMonths) {
        super(id, name, price);
        this.warrantyMonths = warrantyMonths;
    }

    @Override
    public double calculateFinalPrice() {
        if(warrantyMonths >12){
            return getPrice() +  1000000;
        }
        return getPrice();
    }
    @Override
    public void displayInfo() {
        System.out.println("ID: %d, Name: %s, Price: %.2f%n, warranty month: %d\", id, name, price, warrantyMonths");
    }
}
