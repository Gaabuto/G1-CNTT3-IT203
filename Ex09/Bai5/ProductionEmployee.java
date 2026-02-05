package Ex09.Bai5;

public class ProductionEmployee extends Employee {
    private int productCount;

    public ProductionEmployee(String name, int productCount) {
        super(name);
        this.productCount = productCount;
    }

    @Override
    public double calculateSalary() {
        return this.productCount * 50000;
    }
}