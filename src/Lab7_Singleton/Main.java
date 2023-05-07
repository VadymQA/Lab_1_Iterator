package Lab7_Singleton;


public class Main {
    public static void main(String[] args) {

        System.out.println("Should be only 2 messages:");
        User user1 = new User("user1", PostgreSQL.getInstance());
        User user2 = new User("user2", MongoDB.getInstance());

        User user3 = new User("user3", PostgreSQL.getInstance());
        User user4 = new User("user4", MongoDB.getInstance());

    }
}