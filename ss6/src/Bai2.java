class Account{
    String userName;
    String password;
    String email;

    public Account(String userName, String password, String email){
        this.userName = userName;
        this.password = password;
        this.email = email;
    }

    public void changePassword(String newPassword) {
        this.password = newPassword;
    }

    public void displayInfo() {
        System.out.println("Username: " + userName);
        System.out.println("Email: " + email);
        System.out.println("Password: **********");
        System.out.println("--------------------");
    }
}

public class Bai2 {

    public static void main(String[] args) {
        Account acc1 = new Account("Nguyentienthanh", "123456789", "thanh@gmail.com");
        acc1.displayInfo();

        acc1.changePassword("987654321");
        acc1.displayInfo();
    }
}