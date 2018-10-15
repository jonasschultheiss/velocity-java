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

import java.io.IOException;

public class ApplicationHandler {

    public User LoggedInUser;

    public ApplicationHandler () {

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

    // looks if Media folder exists. Returns a boolean value
    private boolean isFirstStart() {
        // do stuff
        return true;
    }

    private void GetAssets() {

    }
}
