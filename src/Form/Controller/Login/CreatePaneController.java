package Form.Controller.Login;

import Model.PlayerDBO;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;

public class CreatePaneController {

    @FXML
    private PasswordField txfPw1;

    @FXML
    private PasswordField txfPw2;

    @FXML
    private TextField txfName;

    @FXML
    private Button btnCreate;

    @FXML
    private Button btnToLogin;

    @FXML
    private Label lblError;

    private LoginController loginController;

    @FXML
    public void initialize() {
        this.lblError.setVisible(false);
    }

    public CreatePaneController(LoginController loginController) {
        this.loginController = loginController;
    }

    @FXML
    void create() throws IOException {
        if (DoesUserExist(txfName.getText())) {
            DisplayError("User already exists.");
        } else if (!txfPw1.getText().equals(txfPw2.getText())) {
            DisplayError("Passwords do not match.");
        } else if (txfPw1.getLength() < 8 || txfPw1.getLength() > 13) {
            DisplayError("Password has to be between 8 and 13 chars.");
        } else {
            this.loginController.viewHandler.applicationHandler.userHandler.CreateNewUser(txfName.getText(), txfPw1.getText());
            this.loginController.viewHandler.applicationHandler.userHandler.Save();
            this.loginController.viewHandler.applicationHandler.LoggedInUser = this.loginController.viewHandler.applicationHandler.userHandler.GetByName(txfName.getText());
            PlayerDBO playerDBO = new PlayerDBO();
            this.loginController.viewHandler.applicationHandler.LoggedInUser.setReserve(playerDBO.defaultList);
            this.loginController.viewHandler.stage.close();
        }
    }

    @FXML
    void toLogin() {
        this.loginController.switchCenter();
    }

    @FXML
    void enter() {
        this.loginController.viewHandler.mouseEnter();
    }

    @FXML
    void exit() {
        this.loginController.viewHandler.mouseExit();
    }

    private boolean DoesUserExist(String name) {
        if (this.loginController.viewHandler.applicationHandler.userHandler.GetByName(name) == null) {
            return false;
        } else {
            return true;
        }
    }

    private void DisplayError(String errorMessage) {
        this.lblError.setVisible(true);
        this.lblError.setText(errorMessage);
    }
}
