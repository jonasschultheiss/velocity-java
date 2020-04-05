package Handler;

import Model.User;
import javafx.stage.Stage;

import java.beans.ExceptionListener;
import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;

import static com.sun.tools.attach.VirtualMachine.list;

public class ApplicationHandler {

    public User LoggedInUser;

    public UserHandler userHandler;

    public int NumbersofPictures;

    public ApplicationHandler() throws IOException {
        this.NumbersofPictures = Objects.requireNonNull(new File("src/Media/Pictures/ProfilePictures").list()).length;
        userHandler = new UserHandler();
    }

    public void Start() throws IOException {
        CreateAndStartViewHandler();
    }

    private void CreateAndStartViewHandler() throws IOException {
        ViewHandler viewHandler = new ViewHandler(this);
        viewHandler.Start();
    }
}
