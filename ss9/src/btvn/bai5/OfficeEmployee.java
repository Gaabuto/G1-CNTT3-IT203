package btvn.bai5;

public class OfficeEmployee extends SuperEmployee{
    public int baseSalary;

    @Override
    public float calculateSalary() {
        return baseSalary;
    }
    public OfficeEmployee(String name, int baseSalary) {
        super(name);
        this.baseSalary = baseSalary;
    }
}
