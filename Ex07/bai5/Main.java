package Ex07.bai5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập điểm số: ");
        double score = sc.nextDouble();

        // Thử thay đổi giá trị
        //Config.MAX_SCORE =9;
        //Sau khi thử thay đổi thì báo lỗi: java: cannot assign a value to static final variable MAX_SCORE

        if(Config.MIN_SCORE<=score && score <= Config.MAX_SCORE){
            System.out.println("Điểm hợp lệ");
        }else{
            System.out.println("Điểm không hợp lệ");
        }
    }
}