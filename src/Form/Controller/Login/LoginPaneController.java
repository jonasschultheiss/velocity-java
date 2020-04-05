package Form.Controller.Login;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginPaneController {
    @FXML
    private Button btnLogin;

    @FXML
    private PasswordField txfPw1;

    @FXML
    private TextField txfName;

    @FXML
    private Label lblError;

    @FXML
    private Button btnToCreate;

    private LoginController loginController;

    @FXML
    public void initialize() {
        this.lblError.setVisible(false);
    }

    public LoginPaneController(LoginController loginController) {
        this.loginController = loginController;
    }

    @FXML
    void login(ActionEvent event) {
        var user = this.loginController.viewHandler.applicationHandler.userHandler.GetByName(this.txfName.getText());
        if (user == null) {
            DisplayError("Username or password not correct.");
        } else if (!this.txfPw1.getText().equals(user.getPassword())) {
            DisplayError("Username or password not correct.");
        } else {
            this.loginController.viewHandler.applicationHandler.LoggedInUser = this.loginController.viewHandler.applicationHandler.userHandler.GetByName(txfName.getText());
            this.loginController.viewHandler.stage.close();
        }
    }

    @FXML
    void toCreate() {
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

    private void DisplayError(String errorMessage) {
        this.lblError.setVisible(true);
        this.lblError.setText(errorMessage);
    }
}