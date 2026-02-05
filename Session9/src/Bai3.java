class Employee3 {
    protected String name;
    protected double baseSalary;

    public Employee3(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public void displayInfo() {
        System.out.println("Tên nhân viên: " + name);
        System.out.println("Lương cơ bản: " + baseSalary);
    }
}

class Manager3 extends Employee3 {
    private String department;

    public Manager3(String name, double baseSalary, String department) {
        super(name, baseSalary);
        this.department = department;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Phòng ban: " + department);
    }
}

public class Bai3 {
    public static void main(String[] args) {
        Manager3 m = new Manager3("Nguyễn Văn A",15000000,"Kinh doanh");

        m.displayInfo();
    }
}