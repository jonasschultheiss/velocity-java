package Form.Controller.Main;

import Handler.ViewHandler;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;

import java.io.IOException;

public class MainSidebarController {
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
    private Button btnHome;

    public ViewHandler viewHandler;

    @FXML
    private BorderPane borderpane;

    public MainSidebarController(ViewHandler viewHandler) {
        this.viewHandler = viewHandler;

    }

    @FXML
    public void initialize() {
        this.lblUserName.setText(viewHandler.applicationHandler.LoggedInUser.getName());
        this.pcbUserPicture.setImage(new Image(this.viewHandler.applicationHandler.LoggedInUser.getImagePath(), 160, 160, false, true));
    }

    @FXML
    void toHome(ActionEvent event) {
        this.borderpane.setCenter(null);
        SetTransparancy(0);
    }

    @FXML
    void toTeam(ActionEvent event) {
        this.borderpane.setCenter(null);
        SetTransparancy(1);
    }

    @FXML
    void toPlay(ActionEvent event) {
        this.borderpane.setCenter(null);
        SetTransparancy(2);
    }

    @FXML
    void toSettings(ActionEvent event) {
        this.borderpane.setCenter(null);
        SetTransparancy(3);
    }

    @FXML
    void toAbout(ActionEvent event) throws IOException {
        this.borderpane.setCenter(null);
        SetTransparancy(4);
        AboutController aboutController = new AboutController(this.viewHandler);
        FXMLLoader loader = new FXMLLoader();
        Parent root = null;
        loader.setController(aboutController);
        loader.setLocation(getClass().getResource("../../View/Main/About.fxml"));
        root = loader.load();
        this.borderpane.setCenter(root);
    }

    private void SetTransparancy(int row) {
        switch (row) {
            case 0: {
                this.btnHome.setStyle("-fx-background-color: #303030; ");
                this.btnTeam.setStyle("-fx-background-color: #252525; ");
                this.btnPlay.setStyle("-fx-background-color: #252525; ");
                this.btnSettings.setStyle("-fx-background-color: #252525; ");
                this.btnAbout.setStyle("-fx-background-color: #252525;");
                break;
            }
            case 1: {
                this.btnHome.setStyle("-fx-background-color: #252525; ");
                this.btnTeam.setStyle("-fx-background-color: #303030; ");
                this.btnPlay.setStyle("-fx-background-color: #252525; ");
                this.btnSettings.setStyle("-fx-background-color: #252525; ");
                this.btnAbout.setStyle("-fx-background-color: #252525; ");
                break;
            }
            case 2: {
                this.btnHome.setStyle("-fx-background-color: #252525;");
                this.btnTeam.setStyle("-fx-background-color: #252525;");
                this.btnPlay.setStyle("-fx-background-color: #303030;");
                this.btnSettings.setStyle("-fx-background-color: #252525;");
                this.btnAbout.setStyle("-fx-background-color: #252525;");
                break;
            }
            case 3: {
                this.btnHome.setStyle("-fx-background-color: #252525;");
                this.btnTeam.setStyle("-fx-background-color: #252525;");
                this.btnPlay.setStyle("-fx-background-color: #252525;");
                this.btnSettings.setStyle("-fx-background-color: #303030;");
                this.btnAbout.setStyle("-fx-background-color: #252525;");
                break;
            }
            case 4: {
                this.btnHome.setStyle("-fx-background-color: #252525;");
                this.btnTeam.setStyle("-fx-background-color: #252525;");
                this.btnPlay.setStyle("-fx-background-color: #252525;");
                this.btnSettings.setStyle("-fx-background-color: #252525;");
                this.btnAbout.setStyle("-fx-background-color: #303030;");
                break;
            }
        }
    }
}
