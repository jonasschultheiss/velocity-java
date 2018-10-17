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

    public ApplicationHandler() {

    }

    public void Start() {
        CreateViewHandler();
    }

    private void CreateViewHandler() {
        ViewHandler viewHandler = new ViewHandler(this);
        try {
            viewHandler.Start();

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
