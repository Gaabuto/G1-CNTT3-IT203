package Ex04;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Bai5 {
    public static void main(String[] args) {
        String[] logs = {
                "2024-05-20 | User: NguyenVanA | Action: BORROW | BookID: BK12345",
                "2024-05-21 | User: LeThiB | Action: RETURN | BookID: BK67890",
                "2024-05-22 | User: TranVanC | Action: BORROW | BookID: BK99999"
        };
        String regex = "^(\\d{4}-\\d{2}-\\d{2}) \\| User: (.+?) \\| Action: (\\w+) \\| BookID: (.+)$";
        Pattern pattern = Pattern.compile(regex);
        int borrowCount = 0;
        int returnCount = 0;
        System.out.println("--- KẾT QUẢ PHÂN TÍCH ---");
        for (String line : logs) {
            Matcher matcher = pattern.matcher(line);
            if (matcher.find()) {
                String date = matcher.group(1);
                String user = matcher.group(2);
                String action = matcher.group(3);
                String bookId = matcher.group(4);
                System.out.println("Ngày: " + date);
                System.out.println("Người dùng: " + user);
                System.out.println("Hành động: " + action);
                System.out.println("Mã sách: " + bookId);
                System.out.println("--------------------");
                if (action.equals("BORROW")) {
                    borrowCount++;
                } else if (action.equals("RETURN")) {
                    returnCount++;
                }
            }
        }
        System.out.println("Tổng số lượt mượn (BORROW): " + borrowCount);
        System.out.println("Tổng số lượt trả (RETURN): " + returnCount);
    }
}