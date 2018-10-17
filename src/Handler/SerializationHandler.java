package Handler;

import Model.User;

import java.beans.ExceptionListener;
import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class SerializationHandler {

    private void test() throws IOException {
        FileOutputStream fos = new FileOutputStream("settings.xml");
        XMLEncoder encoder = new XMLEncoder(fos);
        encoder.setExceptionListener(new ExceptionListener() {
            public void exceptionThrown(Exception e) {
                System.out.println("Exception! :" + e.toString());
            }
        });
        User user = new User();
        user.CreateDummy();
        encoder.writeObject(user);
        encoder.close();
        fos.close();
    }

    private void test2() throws IOException {
        FileInputStream fis = new FileInputStream("settings.xml");
        XMLDecoder decoder = new XMLDecoder(fis);
        User user = (User) decoder.readObject();
        decoder.close();
        fis.close();
        System.out.println(user.getName());
    }
}
