package Lab5_Template_Method;

class UserUpdater extends EntityUpdater {
    @Override
    protected Object retrieveEntity() {
        // отримання сутності User
        return new Object();
    }

    @Override
    protected boolean validateEntity(Object entity) {
        boolean isValid = super.validateEntity(entity);
        // валідація для User з урахуванням що заборонено змінювати значення у полі email
        return isValid;
    }

    @Override
    protected void sendUpdateRequest(Object entity) {
        // надсилання запиту на оновлення User
    }
}
