import java.util.Scanner;

public class Bai5 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int socialCredit = 100;
        int expiredDate = 0;
        int count = 0;
        String message = "1";
         do {
             System.out.println("Nhập số ngày quá hạn trả sách (nhập 999 để kết thúc): ");
             expiredDate = Integer.parseInt(scanner.nextLine());
            if (expiredDate <= 0) {
                socialCredit = socialCredit+5;
            }else{
                socialCredit = socialCredit - (expiredDate*2);
                count++;
            }
        }while(expiredDate == 999);
         if (socialCredit < 80) {
              message = "Độc giả cần lưu ý";
         }else if(socialCredit < 120) {
                message = "Độc giả Tiêu chuẩn";
         }else {
                message = "Độc giả Thân thiết";
         }
        System.out.println("So ngay tre cua lan nay: " + count);
        System.out.println("Tong diem uy tin: " + socialCredit);
        System.out.println("Điểm tín dụng xã hội hiện tại của bạn là: " + message);
    }
}
