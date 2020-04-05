package Form.Controller.Login;


import Handler.ViewHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.BorderPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

import java.io.IOException;

public class LoginController {

    @FXML
    private MediaView mediaView;

    @FXML
    private BorderPane borderpane;

    private boolean IsLoginActive;

    private LoginPaneController loginPaneController;

    private CreatePaneController createPaneController;

    public ViewHandler viewHandler;

    public LoginController() {
        this.IsLoginActive = false;
        this.loginPaneController = null;
        this.createPaneController = null;
        this.viewHandler = null;
    }

    public LoginController(ViewHandler viewHandler) {
        this.IsLoginActive = false;
        this.loginPaneController = null;
        this.createPaneController = null;
        this.viewHandler = viewHandler;
    }

    @FXML
    public void initialize() {
        MediaPlayer mediaPlayer = new MediaPlayer(new Media(this.getClass().getResource("../../../Media/Videos/loginVideo.mp4").toExternalForm()));
        mediaPlayer.setAutoPlay(true);
        mediaPlayer.setMute(true);
        mediaPlayer.setCycleCount(MediaPlayer.INDEFINITE);
        mediaView.setMediaPlayer(mediaPlayer);
        switchCenter();
    }

    protected void switchCenter() {
        if (!IsLoginActive) setLogin();
        else setCreate();
    }

    private void setCreate() {
        this.createPaneController = new CreatePaneController(this);
        FXMLLoader loader = new FXMLLoader();
        Parent root = null;
        loader.setController(this.createPaneController);
        loader.setLocation(getClass().getResource("../../View/Login/CreatePane.fxml"));
        try {
            root = loader.load();
        } catch (IOException e) {
            System.out.println(e);
        }

        this.IsLoginActive = false;
        this.borderpane.setCenter(root);
    }

    private void setLogin() {
        this.loginPaneController = new LoginPaneController(this);
        FXMLLoader loader = new FXMLLoader();
        Parent root = null;
        loader.setController(this.loginPaneController);
        loader.setLocation(getClass().getResource("../../View/Login/LoginPane.fxml"));
        try {
            root = loader.load();
        } catch (IOException e) {
            System.out.println(e);
        }

        this.IsLoginActive = true;
        this.borderpane.setCenter(root);
    }
}
