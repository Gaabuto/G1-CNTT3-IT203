package btth;

public class EmergencyPatient extends Person {
    private String priorityLevel;

    public EmergencyPatient(String name, int age, String priorityLevel) {
        super(0, name, age);
        this.priorityLevel = priorityLevel;
    }
}
