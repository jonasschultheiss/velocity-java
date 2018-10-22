package Form.Controller.Main;

import Form.Controller.ListViewCellController;
import Handler.ViewHandler;
import Model.Player;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;

import java.net.URL;
import java.util.ResourceBundle;

public class TeamController implements Initializable {
    @FXML
    private Button btnSub;

    @FXML
    private ListView<Player> lsvSub;

    @FXML
    private ListView<Player> lsvActive;

    @FXML
    private ListView<Player> lsvReserve;

    @FXML
    private Button btnReserve;

    @FXML
    private Button btnActive;

    private ViewHandler viewHandler;

    public TeamController(ViewHandler viewHandler) {
        this.viewHandler = viewHandler;
    }

    @FXML
    void toActive() {

    }

    @FXML
    void toSub() {

    }

    @FXML
    void toReserve() {

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        lsvActive.setItems(this.viewHandler.applicationHandler.LoggedInUser.getActive());
        lsvActive.setCellFactory(activeListView -> new ListViewCellController());
        lsvSub.setItems(this.viewHandler.applicationHandler.LoggedInUser.getSubstitute());
        lsvSub.setCellFactory(subListView -> new ListViewCellController());
        lsvReserve.setItems(this.viewHandler.applicationHandler.LoggedInUser.getReserve());
        lsvReserve.setCellFactory(reserveListView -> new ListViewCellController());
    }
}
