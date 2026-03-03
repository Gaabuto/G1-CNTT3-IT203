package btth;

import java.util.Stack;

public class Patient extends Person{
    private String medicalCondition;
    private Stack<String> histories;
    public Patient(int id, String fullName, int age, String medicalCondition) {
        super(id, fullName, age);
        this.medicalCondition = medicalCondition;
    }

    public String getMedicalCondition() {
        return medicalCondition;
    }

    public void setMedicalCondition(String medicalCondition) {
        this.medicalCondition = medicalCondition;
    }

    @Override
    public void showInfo() {
        System.out.println("[ID: " + getId() + ", Name: " + getFullName() + ", Age: " + getAge() + ", Medical Condition: " + medicalCondition + "]");
        for(String s: histories)
    }
}
