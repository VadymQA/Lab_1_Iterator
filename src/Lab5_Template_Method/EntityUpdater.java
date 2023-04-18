package Lab5_Template_Method;

abstract class EntityUpdater {
    public void updateEntity() {
        Object entity = retrieveEntity();
        if (validateEntity(entity)) {
            sendUpdateRequest(entity);
            Object response = createResponse(entity);
            processResponse(response);
        } else {
            onValidationFailed(entity);
        }
    }

    protected abstract Object retrieveEntity();

    protected abstract void sendUpdateRequest(Object entity);


    protected boolean validateEntity(Object entity) {
        return true;
    }

    protected Object createResponse(Object entity) {
        // реалізація створення відповіді
        return null;
    }

    protected void processResponse(Object response) {
        // хук обробка відповіді
    }

    protected void onValidationFailed(Object entity) {
        // хук для обробки відмови валідації
    }
}
