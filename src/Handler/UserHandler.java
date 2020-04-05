package Handler;

import Model.User;
import Model.UserDBO;

import java.io.IOException;

public class UserHandler {
    private SerializationHandler serializationHandler;

    private UserDBO userDBO;

    UserHandler() throws IOException {
        this.serializationHandler = new SerializationHandler();
        this.userDBO = new UserDBO();
        this.userDBO.users = this.serializationHandler.DeserializeUserDBO();
    }

    public void Save() throws IOException {
        serializationHandler.SerializeUserDBO(this.userDBO.users);
    }

    public void CreateNewUser(String name, String password) {
        User user = new User(name, password);
        this.userDBO.users.add(user);
    }

    public User GetByName(String name) {
        for (User user : this.userDBO.users) {
            if (user.getName().equals(name)) return user;
        }
        return null;
    }
}
