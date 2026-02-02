package Ex07.bai3;

public class Main {
    public static void main(String[] args) {
        double avg = ScoreUtils.calculateScore(8.5, 7, 9);

        System.out.printf("Điểm trung bình cộng: %.2f\n", avg);

        if (ScoreUtils.checkScore(avg)){
            System.out.println("Kết quả: Đạt");
        }else{
            System.out.println("Kết quả: Không đạt");
        }
    }


}
