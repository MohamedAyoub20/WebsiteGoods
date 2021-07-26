package websitegoods;

import java.util.ArrayList;

public class ShoppingCart {

    private double getproduct;
    private ArrayList<product> listOfProduct;

    public ShoppingCart() {
        listOfProduct = new ArrayList();
    }

    public double getGetproduct() {
        return getproduct;
    }

    public void setGetproduct(double getproduct) {
        this.getproduct = getproduct;
    }

    public void addProduct(product p) {
        listOfProduct.add(p);
    }

    private int search(String name) {
        for (product listOfProduct1 : listOfProduct) {
            if (listOfProduct1.getName().equals(name)) {
                return listOfProduct.indexOf(listOfProduct1);
            }

        }
        return -1;
    }

    public void removeProduct(String name) {
        int index = search(name);
        if (index != -1) {
            listOfProduct.remove(index);
        }
    }

    public double getTotatlPrice() {
        double TotalPrice = 0.0;
        for (product listOfProduct1 : listOfProduct) {
            TotalPrice += listOfProduct1.getPrice();
        }
        return TotalPrice;
    }

    private double getTotalDescount() {
        double TotalDescount = 0.0;
        for (product listOfProduct1 : listOfProduct) {
            TotalDescount += listOfProduct1.getPrice();
        }
        return TotalDescount;
    }

    public double  getTotalPriceAftreDescount() {
        return getTotatlPrice() - getTotalDescount();
    }

    @Override
    public String toString() {
        return "ShoppingCart{" + "getproduct=" + getproduct + ", listOfProduct=" + listOfProduct + '}';
    }

}
