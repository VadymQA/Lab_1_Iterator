package Lab5_Template_Method;

class OrderUpdater extends EntityUpdater {
    @Override
    protected Object retrieveEntity() {
        // отримання сутності Замовлення
        return new Object();
    }

    @Override
    protected void sendUpdateRequest(Object entity) {
        // надсилання запиту на оновлення Order
    }

    @Override
    protected Object createResponse(Object entity) {
        // ствоення JSON відповіді для Order
        return new Object();
    }

    @Override
    protected void processResponse(Object response) {
        // обробка JSON відповіді для Order
    }
}
