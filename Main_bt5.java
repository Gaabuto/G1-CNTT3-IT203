package baitap5;

public class Main_bt5 {
    public static void main(String[] args) {

        double score = 8.5;

        // Sử dụng hằng số
        if (score >= Config.MIN_SCORE && score <= Config.MAX_SCORE) {
            System.out.println("Điểm hợp lệ: " + score);
        } else {
            System.out.println("Điểm không hợp lệ!");
        }

    }
}
