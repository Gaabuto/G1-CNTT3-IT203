public class Main3 {
    public static void main(String[] args) {
        Product p1 = new Product("SP01", "Laptop", 15000000);

        p1.displayInfo();

        System.out.println("Thử set giá KHÔNG hợp lệ");
        p1.setPrice(-5000);

        p1.displayInfo();

        System.out.println("Set giá hợp lệ");
        p1.setPrice(18000000);

        p1.displayInfo();
    }
}