
package bai5;

public class Patient implements Comparable<Patient> {
    String name;
    int severity;
    String arrivalTime;

    public Patient(String name, int severity, String arrivalTime) {
        this.name = name;
        this.severity = severity;
        this.arrivalTime = arrivalTime;
    }

    @Override
    public int compareTo(Patient other) {
        if (this.severity != other.severity) {
            return this.severity - other.severity;
        }else{
            return this.arrivalTime.compareTo(other.arrivalTime);
        }
    }



    @Override
    public String toString() {
        return "Bệnh nhân: " + name + " (Mức: " + severity + ", Đến lúc: " + arrivalTime + ")";
    }
}
