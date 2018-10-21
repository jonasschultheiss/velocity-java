package Model;

public class User {
    private String Name;

    private String Password;

    private String ImagePath;

    public User() {
        this.Name = "";
        this.Password = "";
        this.ImagePath = "";
    }

    public User(String name, String password, String imagePath) {
        this.Name = name;
        this.Password = password;
        this.ImagePath =  imagePath;
    }

    public User(String name, String password) {
        this.Name = name;
        this.Password = password;
        this.ImagePath = "Media/Pictures/ProfilePictures/1.png";
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
}
