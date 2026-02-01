public class Employee {
    private String employeeId;
    private String employeeName;
    private double salary;

    public Employee() {

    }

    public Employee(String employeeId, String employeeName) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salary = 0;
    }

    public Employee(String employeeId, String employeeName, double salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salary = salary;
    }

    public void displayInfo() {
        System.out.println("----- THÔNG TIN NHÂN VIÊN -----");
        System.out.println("Mã NV: " + employeeId);
        System.out.println("Tên NV: " + employeeName);
        System.out.print("Lương: " + salary);
    }
}