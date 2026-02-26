import java.util.ArrayList;
import java.util.List;

public class TimBenhNhanTrungKhop {

    // Phương thức Generic tìm bệnh nhân trùng
    public static <T> List<T> findCommonPatients(List<T> listA, List<T> listB) {
        List<T> result = new ArrayList<>();

        for (T item : listA) {
            if (listB.contains(item)) {
                result.add(item);
            }
        }

        return result;
    }

    public static void main(String[] args) {

        // ===== Test Case 1: Integer =====
        List<Integer> noiKhoa = new ArrayList<>();
        noiKhoa.add(101);
        noiKhoa.add(102);
        noiKhoa.add(105);

        List<Integer> ngoaiKhoa = new ArrayList<>();
        ngoaiKhoa.add(102);
        ngoaiKhoa.add(105);
        ngoaiKhoa.add(108);

        List<Integer> ketQua1 = findCommonPatients(noiKhoa, ngoaiKhoa);
        System.out.println("Test Case 1 Output: " + ketQua1);

        // ===== Test Case 2: String =====
        List<String> noiKhoaBHYT = new ArrayList<>();
        noiKhoaBHYT.add("DN01");
        noiKhoaBHYT.add("DN02");
        noiKhoaBHYT.add("DN03");

        List<String> ngoaiKhoaBHYT = new ArrayList<>();
        ngoaiKhoaBHYT.add("DN02");
        ngoaiKhoaBHYT.add("DN04");

        List<String> ketQua2 = findCommonPatients(noiKhoaBHYT, ngoaiKhoaBHYT);
        System.out.println("Test Case 2 Output: " + ketQua2);
    }
}