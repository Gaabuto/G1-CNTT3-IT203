package CoffeeShop;

public class FruitJuice extends Drink implements IMixable{
    protected int discountPercent;
    public FruitJuice(String id, String name, double price, int discountPercent) {
        super(id, name, price);
        this.discountPercent = discountPercent;
    }
    @Override
    double calculatePrice() {
        double finalPrice = super.calculatePrice();
        finalPrice -= (finalPrice * discountPercent / 100);
        return finalPrice;
    }


    @Override
    public void mix() {
        System.out.println("Dang ep trai cay tuoi");
    }
}
