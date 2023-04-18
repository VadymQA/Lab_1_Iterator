package Lab5_Template_Method;

class ProductUpdater extends EntityUpdater {
    @Override
    protected Object retrieveEntity() {
        // отримання сутності Товар
        return new Object();
    }

    @Override
    protected boolean validateEntity(Object entity) {
        boolean isValid = super.validateEntity(entity);
        // валідація для Product
        return isValid;
    }

    @Override
    protected void sendUpdateRequest(Object entity) {
        // надсилання запиту на оновлення Product
    }

    @Override
    protected void onValidationFailed(Object entity) {
        // сповіщеня адміністратора у мессенджері
    }
}
