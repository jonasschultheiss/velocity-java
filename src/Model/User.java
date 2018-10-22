package Model;

import javafx.beans.InvalidationListener;
import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class User {
    private String Name;

    private String Password;

    private String ImagePath;

    private ObservableList<Player> Active;

    private ObservableList<Player> Substitute;

    private ObservableList<Player> Reserve;

    public User() {
        this.Name = null;
        this.Password = null;
        this.ImagePath = null;
        this.Active = FXCollections.observableArrayList();
        this.Substitute = FXCollections.observableArrayList();
        this.Reserve = FXCollections.observableArrayList();
    }

    public User(String name, String password, String imagePath) {
        this.Name = name;
        this.Password = password;
        this.ImagePath =  imagePath;
        this.Active = FXCollections.observableArrayList();
        this.Substitute = FXCollections.observableArrayList();
        this.Reserve = FXCollections.observableArrayList();
    }

    public User(String name, String password) {
        this.Name = name;
        this.Password = password;
        this.ImagePath = "Media/Pictures/ProfilePictures/1.png";
        this.Active = FXCollections.observableArrayList();
        this.Substitute = FXCollections.observableArrayList();
        this.Reserve = FXCollections.observableArrayList();
    }

    public String getName() {
        return this.Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public String getImagePath() {
        return ImagePath;
    }

    public void setImagePath(String imagePath) {
        ImagePath = imagePath;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public ObservableList<Player> getActive() {
        return Active;
    }

    public void setActive(ObservableList<Player> active) {
        Active = active;
    }

    public ObservableList<Player> getSubstitute() {
        return Substitute;
    }

    public void setSubstitute(ObservableList<Player> substitute) {
        Substitute = substitute;
    }

    public ObservableList<Player> getReserve() {
        return Reserve;
    }

    public void setReserve(ObservableList<Player> reserve) {
        Reserve = reserve;
    }
}
