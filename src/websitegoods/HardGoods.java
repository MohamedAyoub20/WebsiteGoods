package websitegoods;

public class HardGoods extends product {

    private String deliveryAddress;

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    @Override
    public String toString() {
        return "HardGoods{" + "deliveryAddress=" + deliveryAddress + '}';
    }

}
