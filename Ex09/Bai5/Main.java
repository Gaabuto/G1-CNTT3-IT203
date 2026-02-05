package Ex09.Bai5;

public class Main {
    public static void main(String[] args) {
        Employee[] staffList = new Employee[3];
        staffList[0] = new OfficeEmployee("Nguyễn Tiến Thành", 10000000);
        staffList[1] = new ProductionEmployee("Trần Khánh Trắng", 100);
        staffList[2] = new ProductionEmployee("Bàng Trọng Tú", 200);
        System.out.println("--- BẢNG LƯƠNG THÁNG ---");
        double totalBudget = 0;
        for (Employee emp : staffList) {
            double salary = emp.calculateSalary();
            totalBudget += salary;
            System.out.printf("Tên: %-20s | Lương: %,.0f VND\n", emp.getName(), salary);
        }
        System.out.println("------------------------------------");
        System.out.printf("TỔNG QUỸ LƯƠNG CẦN TRẢ: %,.0f VND\n", totalBudget);
    }
}