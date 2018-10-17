package Handler;

import Model.User;
import Model.UserDBO;

import java.beans.ExceptionListener;
import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class SerializationHandler {

    public SerializationHandler() {

    }

    public void SerializeUserDBO(ArrayList<User> users) throws IOException {
        FileOutputStream fos = new FileOutputStream("src/Data/Users.xml");
        XMLEncoder encoder = new XMLEncoder(fos);
        encoder.setExceptionListener(new ExceptionListener() {
            public void exceptionThrown(Exception e) {
                System.out.println("Exception! :" + e.toString());
            }
        });
        encoder.writeObject(users);
        encoder.close();
        fos.close();
    }

    public ArrayList<User> DeserializeUserDBO() throws IOException {
        FileInputStream fis = new FileInputStream("src/Data/Users.xml");
        XMLDecoder decoder = new XMLDecoder(fis);
        ArrayList<User> users = (ArrayList<User>) decoder.readObject();
        decoder.close();
        fis.close();
        return users;
    }
}
