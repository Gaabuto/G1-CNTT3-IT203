package btvn.bai3;

public class Manager extends Employee {
    public String room;

    public Manager(String name, float salary, String room) {
        super(name, salary);
        this.room = room;
    }
}
