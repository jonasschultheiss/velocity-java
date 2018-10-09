package Form.Controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.event.*;

import java.awt.event.MouseEvent;

public class MainSidebar {

    @FXML
    private Label lblUserName;

    @FXML
    private Button btnTeam;

    @FXML
    private ImageView pcbUserPicture;

    @FXML
    private Button btnSettings;

    @FXML
    private Button btnPlay;

    @FXML
    private Button btnAbout;

    @FXML
    private Button btnWelcome;

    @FXML
    void welcome(ActionEvent event) {
        this.lblUserName.setText("quest1onmark");
        this.pcbUserPicture.setImage(new Image(getClass().getResourceAsStream("../../Media/Pictures/quest1.jpg")));
    }

    @FXML
    void team(ActionEvent event) {

    }

    @FXML
    void play(ActionEvent event) {

    }

    @FXML
    void settings(ActionEvent event) {

    }

    @FXML
    void about(ActionEvent event) {

    }

    private void LoadNewCenter(String name) {

    }
}
