//
//  ViewHandler.java
//  velocity
//
//  Created by Jonas Raphael Schultheiss on 05.10.18.
//  Copyright © 2018 Jonas Raphael Schultheiss. All rights reserved.
//

package Handler;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.stage.Stage;
import javafx.scene.Scene;

import java.io.IOException;

public class ViewHandler {
    private Stage primaryStage;

    private Scene MainSidebar;

    private Scene

    public ViewHandler(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }

    public void Start() {

    }

    private void LoadMain () throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/../Form/View/MainSidebar.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
        primaryStage.getOnCloseRequest();
    }
}
