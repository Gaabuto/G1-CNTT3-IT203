package Ex04;

public class Bai2 {
    public static void main(String[] args) {
        String description = "Sách giáo khoa Toán lớp 12, Kệ: A1-102, tình trạng mới";
        String keyword = "Kệ:";
        int index = description.indexOf(keyword);
        int startPos = index + keyword.length();
        int endPos = description.indexOf(" ", startPos);
        String shelfCode = description.substring(startPos, endPos).trim();
        System.out.println("Vị trí tìm thấy: " + shelfCode);
        String newDescription = description.replace(keyword, "\nVị trí lưu trữ:");
        System.out.println("Mô tả mới: " + newDescription);
    }
}