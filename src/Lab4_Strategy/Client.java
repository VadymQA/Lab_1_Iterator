package Lab4_Strategy;

public class Client {
    Delivery delivery;

    public void setDelivery(Delivery delivery) {
        this.delivery = delivery;
    }

    public void calcDelivery(){
        delivery.calc();
    }
}
