import java.util.LinkedList;

class EmergencyRoom {

    private LinkedList<String> line = new LinkedList<>();

    public void patientCheckIn(String name) {
        line.addLast(name);
    }

    public void emergencyCheckIn(String name) {
        line.addFirst(name);
    }

    public void treatPatient() {
        if (line.isEmpty()) {
            System.out.println("Không có bệnh nhân.");
            return;
        }

        String patient = line.removeFirst();

        if (patient.equals("C")) {
            System.out.println("Đang cấp cứu: " + patient);
        } else {
            System.out.println("Đang khám: " + patient);
        }
    }
}

public class Bai4 {
    public static void main(String[] args) {

        EmergencyRoom er = new EmergencyRoom();

        er.patientCheckIn("A");
        er.patientCheckIn("B");
        er.emergencyCheckIn("C");

        er.treatPatient();
        er.treatPatient();
        er.treatPatient();
    }
}