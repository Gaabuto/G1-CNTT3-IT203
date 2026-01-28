public class Bai2 {

    public static void main(String[] args) {

        String description = "Sách giáo khoa Toán lớp 12, Kệ: A1-102, tình trạng mới";

        String keyword = "Kệ:";

        int index = description.indexOf(keyword);

        if (index == -1) {
            System.out.println("Không tìm thấy thông tin kệ sách");
            return;
        }

        int start = index + keyword.length();

        int end = description.indexOf(",", start);
        if (end == -1) {
            end = description.length();
        }

        String location = description.substring(start, end).trim();

        String newDescription = description.replace("Kệ:", "Vị trí lưu trữ:");

        System.out.println("Vị trí tìm thấy: " + location);
        System.out.println("Mô tả mới: " + newDescription);
    }
}
