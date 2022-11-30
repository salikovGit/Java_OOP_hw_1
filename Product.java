public class Product {
    private String name;
    private Double price;

    public Product(String name, Double price){
        this.setName(name);
        this.setPrice(price);
    }
    public String getName() {
        return name;
    }
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        if (price <= 0){
            return;
        }
        this.price = price;
    }

    protected void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    //    public void setName(String name) {
//        this.name = name;
//    }
}
