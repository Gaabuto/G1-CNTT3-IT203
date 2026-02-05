package btth;

import java.util.Scanner;

public class Employee {
    Scanner scanner = new Scanner(System.in);
    private String id;
    private String name;
    private int age;
    private float salary;

    public Employee(String id, String name, int age, float salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public void inputData(Scanner scanner) {
        while (true) {
            System.out.println("Nhập id nhân viên:");
            this.id = scanner.nextLine();
            if (this.id.matches("^E\\d{3}$")) {
                break;
            } else {
                System.out.println("Id không hợp lệ! Vui lòng nhập lại theo định dạng E000 ");
            }
        }
        while (true) {
            System.out.println("Nhập tên nhân viên:");
            this.name = scanner.nextLine();
            if (this.name.length() >= 8 && this.name.length() <= 50) {
                break;
            } else {
                System.out.println("Tên không hợp lệ! Vui lòng nhập lại (8-50 ký tự)");
            }
        }

        while (true) {
            System.out.println("Nhập tuổi nhân viên:");
            this.age = Integer.parseInt(scanner.nextLine());
            if (this.age >= 18) {
                break;
            } else {
                System.out.println("Tuổi không hợp lệ! Vui lòng nhập lại (>= 18)");
            }
        }

        while (true) {
            System.out.println("Nhập hệ số lương nhân viên:");
            this.salary = Float.parseFloat(scanner.nextLine());
            if (this.salary > 0) {
                break;
            } else {
                System.out.println("Hệ số lương không hợp lệ! Vui lòng nhập lại");
            }
        }
    }

    public void displayData(){
        System.out.printf("ID: %s | Tên: %s | Tuổi: %d | Lương: %.2f\n", this.id, this.name, this.age, this.salary);
    }

    public void calcSalary(){
        this.salary = this.salary * 13000000 ;
    }
}

