package Lab3_Memento;

import java.util.Date;

public class UserInterface {
    private String message_options;
    private Date date;

    public void setPreferenceAndDate(String version){
        this.message_options = version;
        this.date = new Date();
    }

    public Save save(){
        return new Save(message_options);
    }

    public void load (Save save){
        message_options = save.getVersion();
        date = save.getDate();
    }

    @Override
    public String toString() {
        return "User's preference:\n" +
                "\nMessage preference='" + message_options + "'" +
                "\nDate=" + date + "\n";
    }
}
