package baitap4;

public class ClassRoom {

    static double classFund = 0;

    private String studentName;

    public ClassRoom(String studentName) {
        this.studentName = studentName;
    }

    public void contribute(double amount) {
        if (amount > 0) {
            classFund += amount;
            System.out.println(studentName + " đã đóng " + amount + " vào quỹ lớp.");
        } else {
            System.out.println("Số tiền đóng không hợp lệ!");
        }
    }

    public static void showClassFund() {
        System.out.println("Tổng quỹ lớp hiện tại: " + classFund);
    }
}
