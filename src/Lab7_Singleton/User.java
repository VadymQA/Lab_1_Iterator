package Lab7_Singleton;

public final class User {

    private UserDB userDB;
    private String username;



    public User(String user1, UserDB userDB) {
        this.userDB = userDB;
        this.username = username;
    }

    public User() {

    }

    public void setUserDB(UserDB userDB){
        this.userDB = userDB;
    }

    public UserDB getUserDB() {
        return userDB;
    }
}
