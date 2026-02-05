package Ex09.Bai3;

public class Manager extends Employee {
    private String department;

    public Manager(String name, double basicSalary, String department) {
        super(name, basicSalary);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void displayInfo() {
        System.out.println("Tên: " + getName());
        System.out.println("Lương cơ bản: " + getBasicSalary());
        System.out.println("Phòng ban: " + department);
    }
}