package Lab4_Strategy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Client user = new Client();

        Scanner input = new Scanner(System.in);

        System.out.println("Ціна залежить від суми замовлення, введіть сумму замовлення");
        double orderPrice = input.nextDouble();

        System.out.println("Виберіть тип доставки:");
        System.out.println("1 - кур'єром");
        System.out.println("2 - самовивіз");
        System.out.println("3 - поштою");

        int deliveryType = input.nextInt();

        switch (deliveryType) {
            case 1:
                System.out.println("Ви обрали доставку кур'єром.");
                user.setDelivery(new CompanyDelivery(orderPrice));
                user.calcDelivery();
                break;
            case 2:
                System.out.println("Ви обрали самовивіз.");
                user.setDelivery(new SelfDelivery(orderPrice));
                user.calcDelivery();
                break;
            case 3:
                System.out.println("Ви обрали доставку поштою.");
                user.setDelivery(new DeliveryByNovaPoshta(orderPrice));
                user.calcDelivery();
                break;
            default:
                System.out.println("Ви ввели неправильне число.");
                break;
        }
        input.close();
    }
}
