package Ex15.Bai4;

import java.util.LinkedList;
import java.util.Queue;

public class EmergencyQueue {
    private Queue<EmergencyPatient> emergencyQueue;
    private Queue<EmergencyPatient> normalQueue;

    public EmergencyQueue() {
        this.emergencyQueue = new LinkedList<>();
        this.normalQueue = new LinkedList<>();
    }

    public void addPatient(EmergencyPatient p) {
        if (p.getPriority() == 1) {
            emergencyQueue.add(p);
            System.out.println(">>> TIẾP NHẬN KHẨN CẤP: " + p.getName());
        } else {
            normalQueue.add(p);
            System.out.println(">>> Tiếp nhận thông thường: " + p.getName());
        }
    }

    public EmergencyPatient callNextPatient() {
        if (!emergencyQueue.isEmpty()) {
            EmergencyPatient p = emergencyQueue.poll();
            System.out.println("<<< BÁC SĨ GỌI KHÁM NGAY: " + p.getName() + " (CẤP CỨU)");
            return p;
        }
        // Tiêu chí 2: Khi Queue Cấp cứu rỗng, mới gọi bệnh nhân Thông thường
        else if (!normalQueue.isEmpty()) {
            EmergencyPatient p = normalQueue.poll();
            System.out.println("<<< Bác sĩ gọi khám: " + p.getName() + " (Thông thường)");
            return p;
        }

        System.out.println("!!! Hiện không có bệnh nhân nào đang chờ.");
        return null;
    }

    public void displayQueue() {
        System.out.println("\n--- DANH SÁCH BỆNH NHÂN ĐANG CHỜ KHÁM ---");

        System.out.println(" HÀNG ĐỢI CẤP CỨU (Ưu tiên khám trước):");
        if (emergencyQueue.isEmpty()) {
            System.out.println("   -> (Trống)");
        } else {
            for (EmergencyPatient p : emergencyQueue) {
                System.out.println("   -> " + p);
            }
        }

        System.out.println(" HÀNG ĐỢI THÔNG THƯỜNG:");
        if (normalQueue.isEmpty()) {
            System.out.println("   -> (Trống)");
        } else {
            for (EmergencyPatient p : normalQueue) {
                System.out.println("   -> " + p);
            }
        }
        System.out.println("-----------------------------------------\n");
    }
}