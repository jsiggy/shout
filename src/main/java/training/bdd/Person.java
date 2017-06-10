package training.bdd;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private int location;
    private List<String> messagesHeard = new ArrayList<String>();

    public void setLocation(int location) {
        this.location = location;
    }

    public void shouts(String message) {
    }

    public List<String> getMessagesHeard() {
        return messagesHeard;
    }
}
