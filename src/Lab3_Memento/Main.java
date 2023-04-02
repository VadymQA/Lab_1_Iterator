package Lab3_Memento;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        UserInterface userInterface = new UserInterface();
        Memento repo = new Memento();

        System.out.println("Default user messages is turned on");
        userInterface.setPreferenceAndDate("DEFAULT MESSAGES");
        System.out.println(userInterface);
        repo.setSave(userInterface.save());
        Thread.sleep(5000); //just to see time changes


        System.out.println("User turn off all messages");
        userInterface.setPreferenceAndDate("NO MESSAGES");
        System.out.println(userInterface);
        Thread.sleep(5000); //just to see time changes


        System.out.println("User rolled back changes");
        userInterface.load(repo.getSave());
        System.out.println(userInterface);
    }
}
