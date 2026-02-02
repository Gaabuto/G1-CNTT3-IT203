package Ex07.bai3;

public class ScoreUtils {
    // Tính điểm trung bình
    public static double calculateScore(double s1, double s2, double s3){
        return (s1+s2+s3)/3;
    }

    // Kiểm tra đạt/không đạt
    public static boolean checkScore(double avg){
        if(avg>=5){
            return true;
        }else{
            return false;
        }
    }
}