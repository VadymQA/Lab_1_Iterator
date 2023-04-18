package Lab5_Template_Method;

public class Main {
    public static void main(String[] args) {
        EntityUpdater productUpdater = new ProductUpdater();
        productUpdater.updateEntity();

        EntityUpdater userUpdater = new UserUpdater();
        userUpdater.updateEntity();

        EntityUpdater orderUpdater = new OrderUpdater();
        orderUpdater.updateEntity();
    }
}
