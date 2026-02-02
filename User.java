package baitap6;

public class User {

    // ===== Thuộc tính =====
    public final int id;        // ID không thể thay đổi
    public String username;
    public String password;

    // ===== Constructor =====
    public User(int id, String username, String password) {
        this.id = id;                 // final -> bắt buộc gán ở đây
        this.username = username;
        this.password = password;
    }

    // ===== In thông tin user =====
    @Override
    public String toString() {
        return "User[id=" + id + ", name=" + username + "]";
    }
}
