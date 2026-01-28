import java.util.Date;

public class Bai3 {

    public static void main(String[] args) {

        String[] transactions = {
                "BK001-20/01",
                "BK005-21/01",
                "BK099-22/01"
        };

        StringBuilder report = new StringBuilder();

        report.append("--- BÁO CÁO MƯỢN SÁCH ---\n");
        report.append("Ngày tạo: ").append(new Date()).append("\n");

        for (int i = 0; i < transactions.length; i++) {
            report.append("Giao dịch: ")
                    .append(transactions[i])
                    .append("\n");
        }

        System.out.println(report.toString());
    }
}
