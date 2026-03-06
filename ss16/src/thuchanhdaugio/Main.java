package thuchanhdaugio;

public class Main {
    public static void main(String[] args) {
        IRepository<Product> productRepository = new ProductRepository();

        Product food1 = new FoodProduct(1, "bánh mỳ không đường", 40000, 50);
        Product food2 = new FoodProduct(2, "bánh mỳ có đường", 12000, 30);
        Product electronic1 = new ElectronicProduct(3, "Máy tính bảng", 53000000, 7);
        Product electronic2 = new ElectronicProduct(4, "Máy tính bàn", 8700000, 36);

        productRepository.add(food1);
        productRepository.add(food2);
        productRepository.add(electronic1);
        productRepository.add(electronic2);


        for (Product product : productRepository.findAll()) {
            product.displayInfo();
            System.out.println("Final Price: " + product.calculateFinalPrice());
        }
        Product productNeedToFind = productRepository.findById("2");
        if (productNeedToFind != null) {
            System.out.println("Found product:");
            productNeedToFind.displayInfo();
        } else {
            System.out.println("Product not found.");
}

    }
}
