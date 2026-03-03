package Ex15.Bai3;

import java.util.Stack;

public class MedicationProcessChecker {
    private Stack<String> stack;

    public MedicationProcessChecker() {
        this.stack = new Stack<>();
    }

    public boolean checkProcess(String[] actions) {
        System.out.println(">>> Đang kiểm tra: " + String.join(", ", actions));

        reset();

        for (int i = 0; i < actions.length; i++) {
            String action = actions[i].toUpperCase().trim();

            if (action.equals("PUSH")) {
                stack.push(action);
                System.out.println(" - Bước " + (i + 1) + " [PUSH]: Đã ghi nhận phát thuốc.");

            } else if (action.equals("POP")) {
                if (stack.isEmpty()) {
                    System.out.println("Lỗi tại bước " + (i + 1) + ": Báo cáo hoàn tất (POP) nhưng chưa có thao tác phát thuốc nào trước đó (Stack rỗng).");
                    return false;
                }
                stack.pop();
                System.out.println(" - Bước " + (i + 1) + " [POP] : Đã xác nhận hoàn tất 1 ca phát thuốc.");

            } else {
                System.out.println("Lỗi tại bước " + (i + 1) + ": Thao tác không hợp lệ (" + action + ").");
                return false;
            }
        }

        if (!stack.isEmpty()) {
            System.out.println("Lỗi cuối ca trực: Ca trực kết thúc nhưng còn " + stack.size() + " ca phát thuốc chưa được xác nhận hoàn tất (Stack không rỗng).");
            return false;
        }

        System.out.println("Kết luoaanj: Quy trình hoàn toàn hoopopje lệ");
        return true;
    }

    public void reset() {
        stack.clear();
    }
}
