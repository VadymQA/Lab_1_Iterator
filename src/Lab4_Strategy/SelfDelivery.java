package Lab4_Strategy;

public class SelfDelivery implements Delivery {
    private double orderPrice;

    public SelfDelivery(double orderPrice) {
        this.orderPrice = orderPrice;
    }

    @Override
    public void calc() {
        // some calculation
        System.out.println("Сума доставки: " + (orderPrice * 0) + "грн");
    }
}
