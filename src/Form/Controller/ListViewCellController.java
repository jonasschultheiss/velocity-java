package Form.Controller;

import Model.Player;
import javafx.concurrent.Task;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.IOException;

public class ListViewCellController extends ListCell<Player> {
    @FXML
    private Label lblName;

    @FXML
    private Label lblPosition;

    @FXML
    private ImageView imvPlayerProfile;

    @FXML
    private Label lblNumber;

    public ListViewCellController() {

    }

    @FXML
    public void initialize() {

    }

    private void loadFXML() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("task_cell.fxml"));
            loader.setController(this);
            loader.setRoot(this);
            loader.load();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    protected void updateItem(Player player, boolean empty) {
        super.updateItem(player, empty);

        if (empty || player == null) {
            setGraphic(null);
        } else {

            this.lblName.setText(player.Name);
            this.lblPosition.setText(player.Position);
            this.lblNumber.setText(String.valueOf(player.Number));
            // this.imvPlayerProfile.setImage(new Image("src/Media/Pictures/Players/" + player.ImageName));
        }
    }
}
