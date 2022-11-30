public class Soda extends Product {
    private double volume;

    public Soda(String name, Double price) {
        super(name, price);
    }

    public Soda(String name, Double price, double volume) {
        super(name, price);
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Soda{" +
                "name=" + this.getName() + " " +
                "price=" + this.getPrice() + " " +
                "volume=" + volume +
                '}';
    }
}
