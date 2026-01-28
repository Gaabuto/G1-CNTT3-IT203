package Ex04;

public class Bai3 {

    public static void main(String[] args) {
        String[] transactions = {"BK001-20/01", "BK005-21/01", "BK099-22/01"};
        StringBuilder report = new StringBuilder();
        report.append("--- BÁO CÁO MƯỢN SÁCH ---");
        report.append("Ngày tạo: 24/01/2026");
        for (String trans : transactions) {
            report.append("Giao dịch: ");
        }
        System.out.println(report.toString());
        int loopCount = 10000;
        long startTimeSB = System.currentTimeMillis();
        StringBuilder sbTest = new StringBuilder();
        for (int i = 0; i < loopCount; i++) {
            sbTest.append("Test Data ");
        }
        long timeSB = System.currentTimeMillis() - startTimeSB;

        long startTimeStr = System.currentTimeMillis();
        StringBuilder strTest = new StringBuilder();
        for (int i = 0; i < loopCount; i++) {
            strTest.append("Test Data ");
        }
        long timeStr = System.currentTimeMillis() - startTimeStr;
        System.out.println("Số thời gian thực thi đối với StringBuilder: " + timeSB);
        System.out.println("Số thời gian thực thi đối với String: " + timeStr);
    }
}