package Ex07.bai4;

public class Main {
    public static void main(String[] args) {
        ClassRoom sv1 = new ClassRoom("Bàng Trọng Tú");
        ClassRoom sv2 = new ClassRoom("Nguyễn Tiến Thành");
        ClassRoom sv3 = new ClassRoom("Trần Anh Dũng");
        ClassRoom sv4 = new ClassRoom("Trần Bảo Khánh");
        ClassRoom sv5 = new ClassRoom("Nguyễn Trường An");

        sv1.addMoney(100000);
        sv2.addMoney(200000);
        sv3.addMoney(250000);
        sv4.addMoney(-120000);
        sv5.addMoney(340000);

        System.out.println("Tổng số tiền trong quỹ: "+ClassRoom.classFund+" VNĐ");
    }
}
