package websitegoods;

public class product {

    private String name;
    private String description;
    private double price;
    private double descont;
    private int quantity;

    public product() {
    }

    public product(String name, String description, double price, double descont, int quantity) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.descont = descont;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDescont() {
        return descont;
    }

    public void setDescont(double descont) {
        this.descont = descont;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "product{" + "name=" + name + ", description=" + description + ", price=" + price + ", descont=" + descont + ", quantity=" + quantity + '}';
    }
}
