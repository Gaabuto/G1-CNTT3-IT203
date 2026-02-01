class Employee {
    private String employeeId;
    private String employeeName;
    private double employeeSalary;
    public Employee() {
        this.employeeId = "Chưa có";
        this.employeeName = "Chưa có";
        this.employeeSalary = 0;
    }
    public Employee(String empId, String empName) {
        this.employeeId = empId;
        this.employeeName = empName;
        this.employeeSalary = 0;
    }
    public Employee(String empId, String empName, double salary) {
        this.employeeId = empId;
        this.employeeName = empName;
        this.employeeSalary = salary;
    }
    public void displayInfo() {
        System.out.println("Mã nhân viên: " + employeeId);
        System.out.println("Tên nhân viên: " + employeeName);
        System.out.println("Lương nhân viên: " + employeeSalary);
        System.out.println("--------------------");
    }
}

public class Bai4 {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee("NV01", "Nguyễn Tiến Thành");
        Employee e3 = new Employee("NV02", "Nguyễn Trần Khánh Trắng", 7000000);
        e1.displayInfo();
        e2.displayInfo();
        e3.displayInfo();
    }
}
