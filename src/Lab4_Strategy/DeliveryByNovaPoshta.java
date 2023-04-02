package Lab4_Strategy;

public class DeliveryByNovaPoshta implements Delivery {
    private double orderPrice;

    public DeliveryByNovaPoshta(double orderPrice) {
        this.orderPrice = orderPrice;
    }

    @Override
    public void calc() {
        // some calculation
        System.out.println("Сума доставки:" + ((orderPrice * 0.10 + 100)) + "грн");
    }
}
