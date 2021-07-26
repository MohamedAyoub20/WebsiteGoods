package websitegoods;

public class SoftGoods extends product {

    private double sizeInMg;

    public SoftGoods(String name, String description, double price, double descont, int quantity) {
        super(name, description, price, descont, quantity);
    }

    public SoftGoods(double sizeInMg, String name, String description, double price, double descont, int quantity) {
        super(name, description, price, descont, quantity);
        this.sizeInMg = sizeInMg;
    }

    public double getSizeInMg() {
        return sizeInMg;
    }

    public void setSizeInMg(double sizeInMg) {
        this.sizeInMg = sizeInMg;
    }

    @Override
    public String toString() {
        return "SoftGoods{" + "sizeInMg=" + sizeInMg + '}';
    }

}
