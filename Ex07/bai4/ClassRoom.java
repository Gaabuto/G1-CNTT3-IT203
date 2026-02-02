package Ex07.bai4;

public class ClassRoom {
    // Biến instance
    public String studentName;

    // Biến static
    public static double classFund=0;

    public ClassRoom(String studentName) {
        this.studentName = studentName;
    }

    // Phương thức đóng tiền vào quỹ
    public void addMoney(double money){
        if(money>=0){
            classFund+=money;
            System.out.println("Đóng tiền thành công");
        }else{
            System.out.println("Số tiền không hợp lệ");
        }
    }
    // Phương thức xem quỹ
    public void displayFund(){
        System.out.println("Số tiền có trong quỹ: "+classFund);
    }
}
