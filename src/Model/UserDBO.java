package Model;

import java.util.ArrayList;

public class UserDBO {
    public ArrayList<User> users;

    public UserDBO() {
        this.users = new ArrayList<User>();
    }

    public UserDBO(ArrayList<User> users) {
        this.users = users;
    }
}
