public class MainTH {
    public static void main(String[] args) {
        //Khởi tại 2 đối tương
        BankAccount firstAccount = new BankAccount("AC001", "Nguyễn Văn A", 500000);
        BankAccount secondAccount = new BankAccount("AC002", "Trần Thị B", 1000000);
        //Trước khi nạp và sau khi nạp
        firstAccount.deposit(300000);
        firstAccount.withdraw(800000);

        firstAccount.displayInfo();
        System.out.println();

        secondAccount.withdraw(500000);
        secondAccount.deposit(100000);
        secondAccount.displayInfo();
    }
}