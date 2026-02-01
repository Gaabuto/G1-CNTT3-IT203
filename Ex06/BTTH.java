package Ex06;

class BankAccount{
    private String bankNumber;
    private String fullName;
    private float balance;

    public BankAccount() {
        this.bankNumber = "000000";
        this.fullName = "Chưa xác định";
        this.balance = 0;
    }

    public BankAccount(String bankNumber, String fullName, float balance){
        this.bankNumber = bankNumber;
        this.fullName = fullName;
        setBalance(balance);
    }

    public String getBankNumber() {
        return bankNumber;
    }
    public void setBankNumber(String bankNumber) {
        this.bankNumber = bankNumber;
    }

    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public double getBalance() {
        return balance;
    }
    public void setBalance(float balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Số dư không được âm");
        }
    }

    // Nạp tiền
    public void deposit(float money) {
        if(money <= 0) {
            System.out.println("Số tiền không hợp lệ"); // Chữ đỏ
            return;
        }
        this.balance += money;
    }
    // Rút tiền
    public float withdraw(float money) {
        if(money <= 0){
            System.out.println("Số tiền rút không hợp lệ"); // Chữ đỏ
        } else if (this.balance - money < 0){
            System.out.println("Số dư không đủ"); // Chữ đỏ
        } else {
            this.balance -= money;
        }
        return this.balance;
    }
    // Hiển thị
    public void display() {
        System.out.println("----------------------------------");
        System.out.println("Số tài khoản: "+bankNumber);
        System.out.println("Tên: "+fullName);
        System.out.println("Số dư: "+balance);
        System.out.println("----------------------------------");
    }
}

public class BTTH {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("1111111111111","Bàng Trọng Tú",50000000);
        BankAccount acc2 = new BankAccount("2222222222222","Nguyễn Phương San",45000000);

        //Nạp
        System.out.println("Trước khi nạp: ");
        acc1.display();
        acc1.deposit(5000000);
        System.out.println("Sau khi nạp tiền");
        acc1.display();

        //Rút
        System.out.println("Trước khi rút: ");
        acc2.display();
        acc2.withdraw(10000000);
        System.out.println("sau khi rút: ");
        acc2.display();
    }
}
