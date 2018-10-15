package Form.Controller.Login;

        import javafx.event.ActionEvent;
        import javafx.fxml.FXML;
        import javafx.scene.control.Button;
        import javafx.scene.control.Label;
        import javafx.scene.control.PasswordField;
        import javafx.scene.control.TextField;

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
    void create(ActionEvent event) {

    }

    @FXML
    void toLogin(ActionEvent event) {
        this.loginController.switchCenter();
    }

}
