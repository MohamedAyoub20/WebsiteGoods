package websitegoods;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

    }

    public static void menueOfSelecte() {
        System.err.println("enter number 1 to:Add product to shopping cart");
        System.err.println("enter number 2 to:Remove product by name from shopping cart");
        System.err.println("enter number 3 to:get total price for all product");
        System.err.println("enter number 4 to:get total price for all product After discount");
        System.err.println("enter number 5 to:Add visitor by name and email to website");
        System.err.println("enter number 6 to:Add product to website");
        System.err.println("enter number 7 to:remove product by name from website");
        System.err.println("enter number 8 to :search by product price");
        System.err.println("enter number 8 to :search by product name");
    }

    public static void showaAllInf() {
        ShoppingCart s = new ShoppingCart();
        WebsiteGoods w = new WebsiteGoods();
        menueOfSelecte();
        int number = new Scanner(System.in).nextInt();
        switch (number) {
            case 1:
                System.err.println("enter Descount");
                double descount = new Scanner(System.in).nextDouble();
                System.err.println("enter description");
                String description = new Scanner(System.in).nextLine();
                System.err.println("enter price");
                double price = new Scanner(System.in).nextDouble();
                System.err.println("enter quantity");
                int quantity = new Scanner(System.in).nextInt();
                System.err.println("enter name");
                String name = new Scanner(System.in).nextLine();
                product p = new product(name, description, price, descount, quantity);
                s.addProduct(p);
                break;
            case 2:
                System.err.println("enter name");
                String name1 = new Scanner(System.in).nextLine();
                s.removeProduct(name1);
                break;
            case 3:
                s.getTotatlPrice();
            case 4:
                s.getTotalPriceAftreDescount();
            case 5:
                
        }
    }
}
