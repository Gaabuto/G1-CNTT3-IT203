import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class baitap5 {
    public static void main(String[] args) {

        // Giả lập file log (nhiều dòng)
        String[] logs = {
                "2024-05-20 | User: NguyenVanA | Action: BORROW | BookID: BK12345",
                "2024-05-20 | User: TranThiB | Action: RETURN | BookID: BK12345",
                "2024-05-21 | User: LeVanC | Action: BORROW | BookID: BK67890",
                "2024-05-21 | User: NguyenVanA | Action: BORROW | BookID: BK11111"
        };

        String regex = "(\\d{4}-\\d{2}-\\d{2}) \\| User: (\\w+) \\| Action: (\\w+) \\| BookID: (\\w+)";
        Pattern pattern = Pattern.compile(regex);

        int borrowCount = 0;
        int returnCount = 0;

        for (String log : logs) {
            Matcher matcher = pattern.matcher(log);

            if (matcher.find()) {
                String ngay = matcher.group(1);
                String user = matcher.group(2);
                String action = matcher.group(3);
                String bookId = matcher.group(4);

                // In thông tin tách được
                System.out.println("Ngày: " + ngay);
                System.out.println("User: " + user);
                System.out.println("Hành động: " + action);
                System.out.println("Mã sách: " + bookId);
                System.out.println("--------------------");

                // Thống kê
                if (action.equals("BORROW")) {
                    borrowCount++;
                } else if (action.equals("RETURN")) {
                    returnCount++;
                }
            }
        }

        // Kết quả thống kê
        System.out.println("📊 THỐNG KÊ:");
        System.out.println("Số lần mượn (BORROW): " + borrowCount);
        System.out.println("Số lần trả (RETURN): " + returnCount);
    }
}
