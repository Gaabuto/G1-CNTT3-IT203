package CoffeeShop;

public class Main {
    Drink[] drinks = new Drink[3];
    public Main() {
        drinks[0] = new Coffee("C001", "Bạc sỉu", 30000, true);
        drinks[1] = new FruitJuice("C002", "Nước cam",40000, 10);
        drinks[2] = null;

        System.out.println("Hoa don");
        for (Drink drink : drinks) {
            if (drink != null) {
                drink.displayInfo();
                System.out.println("Final Price: $" + drink.calculatePrice());
                System.out.println();
                if(drink instanceof IMixable) {
                    ((IMixable) drink).mix();
                }
            }
        }
    }
}
