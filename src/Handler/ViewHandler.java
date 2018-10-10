//
//  ViewHandler.java
//  velocity
//
//  Created by Jonas Raphael Schultheiss on 05.10.18.
//  Copyright © 2018 Jonas Raphael Schultheiss. All rights reserved.
//

package Handler;

import Form.Controller.LoginController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ViewHandler {
    private Stage primaryStage;

    private Scene MainSidebar;

    // private Scene

    public ViewHandler(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }

    public void Start() throws IOException {
        LoadLogin();
    }

    public void LoadLogin() throws IOException {
        LoginController loginController = new LoginController();
        FXMLLoader loader = new FXMLLoader();
        loader.setController(loginController);
        loader.setLocation(getClass().getResource("../Form/View/Login/Login.fxml"));
        Parent root = loader.load();
        this.primaryStage.setTitle("velocity");
        this.primaryStage.setScene(new Scene(root));
        this.primaryStage.show();
    }

    private void LoadMain () throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("../Form/View/MainSidebar.fxml"));
        this.primaryStage.setTitle("velocity");
        this.primaryStage.setScene(new Scene(root));
        this.primaryStage.show();
    }
}
