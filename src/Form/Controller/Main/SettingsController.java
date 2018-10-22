package Form.Controller.Main;

import Handler.ViewHandler;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;

import java.io.*;

public class SettingsController {
    @FXML
    private TextField txfConfNewUsername;

    @FXML
    private Label lblImageName;

    @FXML
    private Button btnSave;

    @FXML
    private PasswordField txfCurrentPassword;

    @FXML
    private PasswordField txfConfNewPassword;

    @FXML
    private Button btnPP;

    @FXML
    private PasswordField txfNewPassword;

    @FXML
    private Label lblErrorUnsaved;

    @FXML
    private Label lblErrorPassword;

    @FXML
    private Label lblErrorUsername;

    @FXML
    private TextField txfNewUsername;

    @FXML
    private TextField txfCurrentUsername;

    private MainSidebarController mainSidebarController;


    private File newPP = null;

    public SettingsController(MainSidebarController mainSidebarController) {
        this.mainSidebarController = mainSidebarController;
    }

    @FXML
    public void initialize() {

    }

    @FXML
    void choosePP() {
        this.newPP = CreateFileChooser().showOpenDialog(this.mainSidebarController.viewHandler.stage);
        if (this.newPP != null) {
            this.lblImageName.setText(this.newPP.getName());
        }
    }


    @FXML
    void SaveAllChanges() throws IOException {
        if (this.newPP != null) {
            SaveAndSetImage(this.newPP);
        }
        this.mainSidebarController.viewHandler.applicationHandler.userHandler.Save();
    }

    @FXML
    void enterBtn() {
        this.mainSidebarController.viewHandler.mouseEnter();
    }

    @FXML
    void exitBtn() {
        this.mainSidebarController.viewHandler.mouseExit();
    }


    @FXML
    void resetTeam() {
        // TODO : after i've implemented teams
    }

    @FXML
    void changeUsername() {
        // TODO : make better
        this.mainSidebarController.viewHandler.applicationHandler.LoggedInUser.setName(txfNewUsername.getText());
    }


    @FXML
    void changePassword() {
        // TODO: make better
        this.mainSidebarController.viewHandler.applicationHandler.LoggedInUser.setPassword(txfNewPassword.getText());
    }

    @FXML
    void saveAllChanges() throws IOException {
        this.mainSidebarController.viewHandler.applicationHandler.userHandler.Save();
    }

    // diese methode ist aus dem internet kopiert :(
    private void SaveAndSetImage(File source) throws IOException {
        InputStream is = null;
        OutputStream os = null;
        String path = "src/Media/Pictures/ProfilePictures/" + this.mainSidebarController.viewHandler.applicationHandler.NumbersofPictures + ".png";
        try {
            is = new FileInputStream(source);
            os = new FileOutputStream(path);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
            }
            this.mainSidebarController.viewHandler.applicationHandler.LoggedInUser.setImagePath(path.substring(path.indexOf("/") + 1));
        } finally {
            is.close();
            os.close();
        }
    }

    private FileChooser CreateFileChooser() {
        FileChooser fc = new FileChooser();
        FileChooser.ExtensionFilter filter = new FileChooser.ExtensionFilter("Image Files", "*.png");
        fc.getExtensionFilters().add(filter);
        fc.setTitle("Choose a new profile picture");
        return fc;
    }
}
