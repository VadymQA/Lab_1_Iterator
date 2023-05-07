package Lab7_Singleton;

public class PostgreSQL implements UserDB {

    private static PostgreSQL instance;

    private PostgreSQL() {
        System.out.println("Instance PostgreSQL was created");
    }

    public static PostgreSQL getInstance() {
        if (instance == null) {
            instance = new PostgreSQL();
        }
        return instance;
    }

    @Override
    public void saveData() {

        //some code
    }
}
