import java.util.Scanner;
public class Bai6 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max = -1;        // biến tạm lưu lượt mượn cao nhất
        int min = Integer.MAX_VALUE; // biến tạm lưu lượt mượn thấp nhất, đảm bảo số nhập đầu tiên luôn nhỏ hơn
        int sum = 0;
        int count = 0;

        String[] days = {"Thu 2", "Thu 3", "Thu 4", "Thu 5", "Thu 6", "Thu 7", "Chu Nhat"};

        // Vòng lặp for chạy 7 lần
        for (int i = 0; i < 7; i++) {
            System.out.print("Nhap luot muon ngay " + days[i] + ": ");
            int luotMuon = sc.nextInt();
            // Nếu lượt mượn = 0 thì bỏ qua ngày này
            if (luotMuon == 0) {
                continue;
            }
            // Cập nhật max
            if (luotMuon > max) {
                max = luotMuon;
            }
            // Cập nhật min
            if (luotMuon < min) {
                min = luotMuon;
            }
            sum += luotMuon;
            count++;
        }
        //Nếu có ít nhất một ngày mở cửa thì tính trung bình bằng tổng chia cho số ngày, ngược lại nếu không có ngày nào thì trung bình bằng 0.
        double average = (count > 0) ? (double) sum / count : 0;    

        System.out.println("\n--- KET QUA THONG KE ---");
        System.out.println("Luot muon cao nhat: " + max);
        System.out.println("Luot muon thap nhat: " + min);
        System.out.println("Trung binh luot muon/ngay: " + average);
    }
}