package Ex06;

class Product{
    private int productId;
    private String productName;
    private float productPrice;

    public Product(int productId, String productName, float productPrice) {
        this.productId = productId;
        this.productName = productName;
        setProductPrice(productPrice);
    };
    public int getProductId() {
        return productId;
    };
    public String getProductName() {
        return productName;
    };
    public float getProductPrice() {
        return productPrice;
    };
    public void setProductPrice(float productPrice) {
        if (productPrice > 0) {
            this.productPrice = productPrice;
        } else {
            System.out.println("Sai thông tin, Giá phải > 0");
        }
    }
    public void displayInfo() {
        System.out.println("Mã SP: " + productId);
        System.out.println("Tên SP: " + productName);
        System.out.println("Giá bán: " + productPrice);
        System.out.println("--------------------");
    }
}

public class Bai3 {
    public static void main(String[] args) {
        Product p = new Product(1, "Tôm hùm", 3000000);
        p.displayInfo();
        p.setProductPrice(-2000);
    }
}