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

    }

    @FXML
    void toCreate(ActionEvent event) {
        this.loginController.switchCenter();
    }
}