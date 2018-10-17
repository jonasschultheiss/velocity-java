//
//  ApplicationHandler.java
//  velocity
//
//  Created by Jonas Raphael Schultheiss on 05.10.18.
//  Copyright © 2018 Jonas Raphael Schultheiss. All rights reserved.
//

package Handler;

import Model.User;
import javafx.stage.Stage;

import java.beans.ExceptionListener;
import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ApplicationHandler {

    public User LoggedInUser;

    public UserHandler userHandler;

    public ApplicationHandler() throws IOException {
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
