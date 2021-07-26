package websitegoods;

public class Visitor {

    private String name;
    private String e_mail;
    private ShoppingCart shc;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getE_mail() {
        return e_mail;
    }

    public void setE_mail(String e_mail) {
        this.e_mail = e_mail;
    }

    public ShoppingCart getShc() {
        return shc;
    }

    public void setShc(ShoppingCart shc) {
        this.shc = shc;
    }

    @Override
    public String toString() {
        return "Visitor{" + "name=" + name + ", e_mail=" + e_mail + ", shc=" + shc + '}';
    }

}
