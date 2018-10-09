package Model;

import javafx.scene.image.Image;

public class User {
    private String Name;

    private Image Image;

    public User (String name) {
        this.Name = name;
    }


    public String getName() {
        return this.Name;
    }

    public void setName(String name) {
        this.Name = name;
    }
}
