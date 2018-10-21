package Form.Controller.Main;

import Handler.ViewHandler;
import javafx.fxml.FXML;
import javafx.scene.Cursor;
import javafx.scene.image.ImageView;

import java.awt.*;
import java.net.MalformedURLException;
import java.net.URL;

public class AboutController {
    @FXML
    private ImageView imvGithub;

    @FXML
    private ImageView imvTwitter;

    @FXML
    private ImageView imvGitLab;

    @FXML
    private ImageView imvLinkedin;

    private ViewHandler viewHandler;

    public AboutController(ViewHandler viewHandler) {
        this.viewHandler = viewHandler;
    }

    @FXML
    public void initialize() {

    }

    @FXML
    void openTwitter() throws Exception {
        Desktop desktop = Desktop.getDesktop();
        desktop.browse(new URL("http://twitter.com/quest1onmark_").toURI());
    }

    @FXML
    void openGithub() throws Exception {
        Desktop desktop = Desktop.getDesktop();
        desktop.browse(new URL("https://github.com/quest1onmark").toURI());
    }

    @FXML
    void openGitLab() throws Exception {
        Desktop desktop = Desktop.getDesktop();
        desktop.browse(new URL("https://gitlab.com/quest1onmark").toURI());
    }

    @FXML
    void openLinkedin() throws Exception {
        Desktop desktop = Desktop.getDesktop();
        desktop.browse(new URL("https://www.linkedin.com/in/jonas-schultheiss-682b54157/").toURI());
    }

    @FXML
    void enter() {
        this.viewHandler.mouseEnter();
    }

    @FXML
    void exit() {
        this.viewHandler.mouseExit();
    }


}
