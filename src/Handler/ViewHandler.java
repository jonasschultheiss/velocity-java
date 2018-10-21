//
//  ViewHandler.java
//  velocity
//
//  Created by Jonas Raphael Schultheiss on 05.10.18.
//  Copyright © 2018 Jonas Raphael Schultheiss. All rights reserved.
//

package Handler;

import Form.Controller.Login.LoginController;
import Form.Controller.Main.MainSidebarController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class ViewHandler {
    public ApplicationHandler applicationHandler;

    public Stage stage;

    public ViewHandler(ApplicationHandler applicationHandler) {
        this.applicationHandler = applicationHandler;
        InitWindow();
    }

    public void Start() throws IOException {
        StartLoginPhase();
        StartMainPhase();
    }

    private void InitWindow() {
        this.stage = new Stage();
        this.stage.setTitle("velocity");
        this.stage.getIcons().add(new Image(getClass().getResource("../Media/Pictures/logoblack.png").toExternalForm()));
    }

    private void StartLoginPhase() throws IOException {
        LoginController loginController = new LoginController(this);
        FXMLLoader loader = new FXMLLoader();
        loader.setController(loginController);
        loader.setLocation(getClass().getResource("../Form/View/Login/Login.fxml"));
        this.stage.setScene(new Scene(loader.load()));
        this.stage.setResizable(false);
        this.stage.showAndWait();
    }

    private void StartMainPhase() throws IOException {
        if (this.applicationHandler.LoggedInUser != null) {
            InitWindow();
            MainSidebarController mainSidebarController = new MainSidebarController(this);
            FXMLLoader loader = new FXMLLoader();
            loader.setController(mainSidebarController);
            loader.setLocation(getClass().getResource("../Form/View/Main/MainSidebar.fxml"));
            this.stage.setScene(new Scene(loader.load()));
            this.stage.show();
        }

    }

    public void mouseEnter() {
        this.stage.getScene().setCursor(Cursor.HAND);
    }

    public void mouseExit() {
        this.stage.getScene().setCursor(Cursor.DEFAULT);
    }
}
