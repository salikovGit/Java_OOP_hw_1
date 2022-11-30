import java.awt.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Product pr1 = new Product("Chips", 60.);
        ArrayList<Product> prods = new ArrayList<>();
        System.out.println(pr1.getName());
        System.out.println(pr1.getPrice());
        VendingMachine v1 = new VendingMachine();
        System.out.println(v1);
        prods.add(new Product("Chips", 20.));
        prods.add(new Product("Juice", 50.));
        prods.add(new Product("Cookies", 64.));
        prods.add(new Product("Soda", 49.));
        VendingMachine v2 = new VendingMachine(prods);
        System.out.println(v2);
        prods.add(new Milk("Happy farmer", 39., 2));
        System.out.println(v2);
        prods.add(new Soda("7UP", 42.99, 0.45));
        System.out.println(v2);
    }
}