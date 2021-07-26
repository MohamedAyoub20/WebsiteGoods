package websitegoods;

import java.util.ArrayList;

public class WebsiteGoods {

    ArrayList<product> listOfProduct;
    ArrayList<Visitor> listOfVisitor;

    public WebsiteGoods() {
        listOfProduct = new ArrayList();
        listOfVisitor = new ArrayList();
    }

    public void addVisitor(String name, String eMail) {
        Visitor vr = new Visitor();
        vr.setName(name);
        vr.setE_mail(eMail);
        listOfVisitor.add(vr);
    }

    public void addProduct(product p) {
        listOfProduct.add(p);
    }

    @Override
    public String toString() {
        return "WebsiteGoods{" + "listOfProduct=" + listOfProduct + ", listOfVisitor=" + listOfVisitor + '}';
    }

    public double searchProdectByPrice(double price) {
        for (product listOfProduct1 : listOfProduct) {
            if (listOfProduct1.getName().equals(price)) {
                return listOfProduct1.getPrice();
            }
        }
        return -1;
    }

    public int SearchProdectByName(String name) {
        for (product listOfProduct1 : listOfProduct) {
            if (listOfProduct1.getName().equals(name)) {
                return listOfProduct.indexOf(name);
            }

        }
        return -1;
    }

    public void removeProdecut(String name) {
        if (SearchProdectByName(name) != -1) {
            listOfProduct.remove(SearchProdectByName(name));
        }

    }

}
