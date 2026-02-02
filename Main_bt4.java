package baitap4;

public class Main_bt4 {
    public static void main(String[] args) {

        ClassRoom sv1 = new ClassRoom("Nguyễn Văn A");
        ClassRoom sv2 = new ClassRoom("Trần Thị B");
        ClassRoom sv3 = new ClassRoom("Lê Văn C");

        sv1.contribute(100000);
        sv2.contribute(150000);
        sv3.contribute(200000);

        ClassRoom.showClassFund();
    }
}
