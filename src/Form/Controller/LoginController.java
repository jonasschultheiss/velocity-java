package Form.Controller;


import javafx.fxml.FXML;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

public class LoginController {
    @FXML
    private MediaView mediaView;

    public LoginController() {
//        File file = new File("../../Media/Videos/login.mp4");
//        Media media = new Media(getClass().getResource("../../Media/Videos/loginVideo.mp4").toString());
//        MediaPlayer mediaPlayer = new MediaPlayer(media);
//        mediaPlayer.setAutoPlay(true);
//        videoPlayer.setMediaPlayer(mediaPlayer);
        MediaPlayer mediaPlayer = new MediaPlayer(new Media(this.getClass().getResource("../../Media/Videos/loginVideo.mp4").toExternalForm()));
        mediaPlayer.setAutoPlay(true);
        mediaView.setMediaPlayer(mediaPlayer);
    }
}
