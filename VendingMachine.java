import java.util.ArrayList;

public class VendingMachine {
    private ArrayList<Product> products = new ArrayList<>();
    private final static ArrayList<Product> initProducts = new ArrayList<>();

    static {
        initProducts.add(new Product("Snickers", 50.));
    }

    public VendingMachine(){
        this(initProducts);
    }

    public VendingMachine(ArrayList<Product> products){
        this.products = products;
    }

    public Product getProdByName(String prodName){
         for (Product product : products){
             if (product.getName().contains(prodName)){
                 return product;
             }
         }
         return null;
    }

    public Product getProdByPrice(double prodPrice){
        for (Product product : products){
            if (product.getPrice().equals(prodPrice)){
                return product;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return products.toString();
    }
}
