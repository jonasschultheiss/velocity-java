//
//  Main.java
//  velocity
//
//  Created by Jonas Raphael Schultheiss on 05.10.18.
//  Copyright © 2018 Jonas Raphael Schultheiss. All rights reserved.
//

import Handler.ApplicationHandler;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        ApplicationHandler applicationHandler = new ApplicationHandler();
        applicationHandler.Start(primaryStage);
    }


    public static void main(String[] args) {
        launch(args);
    }
}
