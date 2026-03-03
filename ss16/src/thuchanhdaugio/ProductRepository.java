package thuchanhdaugio;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ProductRepository implements IRepository<Product> {

    ArrayList<Product> products = new ArrayList<>();
    HashMap<String, Product> productMap = new HashMap<>();
    @Override
     public boolean add(Product product) {
        if (productMap.containsKey(String.valueOf(product.getId()))) {
            return false;
        }
        products.add(product);
        productMap.put(String.valueOf(product.getId()), product);
        return true;
    }

    @Override
    public boolean removeById(String id) {
        if (!productMap.containsKey(id)) {
            return false;
        }
        Product product = productMap.get(id);
        products.remove(product);
        productMap.remove(id);
        return true;
    }
    @Override
    public Product findById(String id) {
        return productMap.get(id);
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products);
    }

}
