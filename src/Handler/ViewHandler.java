//
//  ViewHandler.java
//  velocity
//
//  Created by Jonas Raphael Schultheiss on 05.10.18.
//  Copyright © 2018 Jonas Raphael Schultheiss. All rights reserved.
//

package Handler;

import Form.Controller.Login.LoginController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import java.io.IOException;

public class ViewHandler {
    private ApplicationHandler applicationHandler;

    private Stage stage;

    public ViewHandler(ApplicationHandler applicationHandler) {
        this.applicationHandler = applicationHandler;
        InitWindow();
    }

    public void Start() throws IOException {
        StartLoginPhase();
    }

    private void InitWindow () {
        this.stage = new Stage();
        this.stage.setTitle("velocity");
        this.stage.getIcons().add(new Image(getClass().getResource("../Media/Pictures/logowhite.png").toExternalForm()));
    }

    private void StartLoginPhase() throws IOException {
        LoginController loginController = new LoginController();
        FXMLLoader loader = new FXMLLoader();
        loader.setController(loginController);
        loader.setLocation(getClass().getResource("../Form/View/Login/Login.fxml"));
        stage.setScene(new Scene(loader.load()));
        stage.showAndWait();
    }

//    private void LoadMain (User user) throws IOException {
//        Parent root = FXMLLoader.load(getClass().getResource("../Form/View/MainSidebar.fxml"));
//        this.primaryStage.setTitle("velocity");
//        this.primaryStage.setScene(new Scene(root));
//        this.primaryStage.show();
//    }
}
