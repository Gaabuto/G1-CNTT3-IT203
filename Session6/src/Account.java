public class Account {
    private String username;
    private String password;
    private String email;

    public Account(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public void changePassword(String oldPassword, String newPassword) {
        if (!this.password.equals(oldPassword)) {
            System.out.println("Mật khẩu cũ không đúng");
            return;
        }

        if (newPassword.length() < 6) {
            System.out.println("Mật khẩu mới phải có ít nhất 6 ký tự");
            return;
        }

        this.password = newPassword;
        System.out.println("Đổi mật khẩu thành công");
    }

    public void displayInfo() {
        System.out.println("----- THÔNG TIN TÀI KHOẢN -----");
        System.out.println("Username: " + username);
        System.out.println("Email: " + email);
        System.out.println("Password: ******");
    }
}