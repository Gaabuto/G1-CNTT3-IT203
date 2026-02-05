package Ex09.Bai5;

public class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double calculateSalary() {
        return 0;
    }

    public void displayInfo() {
        System.out.println("Nhân viên: " + name);
    }
}