package Lab4_Strategy;

public class CompanyDelivery<orderPrice> implements Delivery {

    private double orderPrice;

    public CompanyDelivery(double orderPrice) {
        this.orderPrice = orderPrice;
    }

    @Override
    public void calc() {
        // some calculation
        System.out.println("Сума доставки:" + (orderPrice * 0.05) + "грн");
    }
}
