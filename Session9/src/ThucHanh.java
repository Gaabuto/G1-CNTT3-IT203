class Employee {
    protected String name;
    protected double baseSalary;

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    double getSalary() {
        return baseSalary;
    }

    double getSalary(double bonus) {
        return baseSalary + bonus;
    }
}
class Manager extends Employee {
    private double responsibilityBonus;

    public Manager(String name, double baseSalary, double responsibilityBonus) {
        super(name, baseSalary);
        this.responsibilityBonus = responsibilityBonus;
    }

    @Override
    double getSalary() {
        return super.getSalary() + responsibilityBonus;
    }
}
class Developer extends Employee {
    private int overtimeHours;
    public Developer(String name, double baseSalary, int overtimeHours) {
        super(name, baseSalary);
        this.overtimeHours = overtimeHours;
    }
    @Override
    double getSalary() {
        return super.getSalary() + overtimeHours * 200_000;
    }
}
public class ThucHanh {
    public static void main(String[] args) {
        Employee e1 = new Manager("Anh Quân", 15_000_000, 5_000_000);
        Employee e2 = new Developer("Minh Tuấn", 12_000_000, 10);

        System.out.println("Lương Manager: " + e1.getSalary());
        System.out.println("Lương Developer: " + e2.getSalary());

        System.out.println("Lương có thưởng: " + e2.getSalary(2_000_000));
    }
}