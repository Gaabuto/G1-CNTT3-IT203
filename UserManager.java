package baitap6;

import java.util.ArrayList;

public class UserManager {

    // ===== Danh sách user dùng chung cho toàn hệ thống =====
    public static ArrayList<User> users = new ArrayList<>();

    // ===== Thêm user =====
    public static void addUser(User u) {
        users.add(u);
    }

    // ===== Kiểm tra đăng nhập =====
    public static boolean checkLogin(String username, String password) {
        for (User u : users) {
            if (u.username.equals(username) && u.password.equals(password)) {
                return true;
            }
        }
        return false;
    }

    // ===== Hiển thị danh sách user =====
    public static void showUsers() {
        int index = 1;
        for (User u : users) {
            System.out.println(index + ". " + u);
            index++;
        }
    }
}
