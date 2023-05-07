package Lab7_Singleton;

public class MongoDB implements UserDB {

    private static MongoDB instance;

    private MongoDB() {
        System.out.println("Instance MongoDB was created");
    }

    public static MongoDB getInstance() {
        if (instance == null) {
            instance = new MongoDB();
        }
        return instance;
    }

    @Override
    public void saveData() {
        //some code
    }
}
