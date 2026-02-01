class Product {
    private String productId;
    private String productName;
    private double price;

    public Product(String productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;

        setPrice(price);
    }

    public String getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
            System.out.println("Giá đã được cập nhật: " + price);
        } else {
            System.out.println("Giá phải lớn hơn 0");
        }
    }


    public void displayInfo() {
        System.out.println("----- THÔNG TIN SẢN PHẨM -----");
        System.out.println("Mã SP: " + productId);
        System.out.println("Tên SP: " + productName);
        System.out.println("Giá bán: " + price);
    }
}