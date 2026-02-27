import java.util.LinkedList;

public class main {

    private LinkedList<String> queue = new LinkedList<>();

    // Bệnh nhân thường vào cuối hàng đợi
    public void patientCheckIn(String name) {
        queue.addLast(name);
    }

    // Ca cấp cứu nguy kịch vào đầu hàng đợi
    public void emergencyCheckIn(String name) {
        queue.addFirst(name);
    }

    // Bác sĩ gọi bệnh nhân đầu tiên
    public void treatPatient() {
        if (queue.isEmpty()) {
            System.out.println("Không còn bệnh nhân chờ.");
            return;
        }

        String patient = queue.pollFirst();

        // Nếu là ca cấp cứu (ở đầu do emergencyCheckIn)
        if (patient.equals("C")) {
            System.out.println("Đang cấp cứu: " + patient);
        } else {
            System.out.println("Đang khám: " + patient);
        }
    }

    public static void main(String[] args) {

        main er = new main();

        // Mô phỏng theo đề bài
        er.patientCheckIn("A");
        er.patientCheckIn("B");
        er.emergencyCheckIn("C");

        // Bác sĩ lần lượt chữa trị
        er.treatPatient();
        er.treatPatient();
        er.treatPatient();
    }
}