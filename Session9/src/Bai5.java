class Employee5 {
    protected String name;

    public Employee5(String name) {
        this.name = name;
    }

    public double calculateSalary() {
        return 0;
    }

    public String getInfo() {
        return name;
    }
}

class OfficeEmployee extends Employee5 {
    private double baseSalary;

    public OfficeEmployee(String name, double baseSalary) {
        super(name);
        this.baseSalary = baseSalary;
    }

    @Override
    public double calculateSalary() {
        return baseSalary;
    }

    @Override
    public String getInfo() {
        return name + " (Office) - Lương: " + String.format("%,.0f", calculateSalary());
    }
}

class ProductionEmployee extends Employee5 {
    private int numOfProducts;
    private double price;

    public ProductionEmployee(String name, int numOfProducts, double price) {
        super(name);
        this.numOfProducts = numOfProducts;
        this.price = price;
    }

    @Override
    public double calculateSalary() {
        return numOfProducts * price;
    }

    @Override
    public String getInfo() {
        return name + " (Production) - Lương: " + String.format("%,.0f", calculateSalary()) + " (" + numOfProducts + " sản phẩm * " + String.format("%,.0f", price) + ")";
    }
}

public class Bai5 {
    public static void main(String[] args) {
        Employee5[] employees = new Employee5[3];

        employees[0] = new OfficeEmployee("Nguyen Van A", 10_000_000);
        employees[1] = new ProductionEmployee("Tran Thi B", 300, 20.000);
        employees[2] = new ProductionEmployee("Le Van C", 150, 30.000);

        double totalSalary = 0;

        System.out.println("Danh sách lương nhân viên:");

        for (int i = 0; i < employees.length; i++) {
            System.out.println((i + 1) + ". " + employees[i].getInfo());
            totalSalary += employees[i].calculateSalary();
        }

        System.out.println("\n=> TỔNG LƯƠNG CÔNG TY: " + String.format("%,.0f", totalSalary));
    }
}