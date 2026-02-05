package btvn.bai5;

public class ProductionEmployee extends SuperEmployee{

    public int numOfProducts;
    public float price;

    @Override
    public float calculateSalary() {
        return numOfProducts * price;
    }
    public ProductionEmployee(String name, float price) {
        super(name);
        this.price = price;
    }
}
