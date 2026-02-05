package btth;

public class Manager extends Employee{
    public Manager (String id, String name, int age, float salary) {
        super(id, name, age, salary);
    }


    @Override
    public void calcSalary(){
        float luong = getSalary() + 2000000;
        setSalary(luong);
    }
}
