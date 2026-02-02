package baitap6;

public class Main_bt6 {
    public static void main(String[] args) {

        // ===== Tạo user =====
        User u1 = new User(1, "dev_a", "123456");
        User u2 = new User(2, "dev_b", "abcdef");
        User u3 = new User(3, "dev_c", "999999");

        // ===== Thêm user vào hệ thống =====
        UserManager.addUser(u1);
        UserManager.addUser(u2);
        UserManager.addUser(u3);

        System.out.println(">> Đã thêm 3 user vào hệ thống.");
        System.out.println("Danh sách hiện tại:");
        UserManager.showUsers();

        // ===== Kiểm tra đăng nhập =====
        System.out.println("\n>> Kiểm tra đăng nhập:");

        System.out.println("- Login (\"dev_a\", \"123456\"): "
                + (UserManager.checkLogin("dev_a", "123456") ? "Thành công!" : "Thất bại!"));

        System.out.println("- Login (\"dev_b\", \"sai_pass\"): "
                + (UserManager.checkLogin("dev_b", "sai_pass") ? "Thành công!" : "Thất bại!"));

    }
}
