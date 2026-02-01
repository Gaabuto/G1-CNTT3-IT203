public class BankAccount {

    private String accountNumber;
    private String ownerName;
    private double balance;

    public BankAccount() {

    }

    public BankAccount(String accountNumber, String ownerName, double balance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;

        // kiểm tra số dư hợp lệ
        if (balance >= 0) {
            this.balance = balance;
        } else {
            this.balance = 0;
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public double getBalance() {
        return balance;
    }

    public void setOwnerName(String ownerName) {
        if (!ownerName.isEmpty()) {
            this.ownerName = ownerName;
        }
    }

    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("\u001b[31mSố dư không hợp lệ\u001b[0m");
        }
    }
    //Nạp tiền
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Nạp tiền thành công: +" + amount);
        } else {
            System.out.println("\u001b[31mSố tiền không hợp lệ\u001b[0m");
        }
    }
    //Rút tiền
    public void withdraw(double amount) {

        if (amount <= 0) {
            System.out.println("\u001b[31mSố tiền không hợp lệ\u001b[0m");
            return;
        }

        if (amount > balance) {
            System.out.println("\u001b[31mKhông đủ số dư để rứt\u001b[0m");
            return;
        }

        balance -= amount;
        System.out.println("Rút tiền thành công: -" + amount);
    }

    public void displayInfo() {
        System.out.println("----- THÔNG TIN TÀI KHOẢN -----");
        System.out.println("Số tài khoản: " + accountNumber);
        System.out.println("Chủ tài khoản: " + ownerName);
        System.out.println("Số dư: " + balance);
    }
}