package Model;

public class User {
    private String Name;

    private String Password;

    private String ImagePath;

    public User() {

    }

    public User(String name, String password, String imagePath) {
        this.Name = name;
        this.Password = password;
        this.ImagePath = imagePath;
    }

    public User(String name, String password) {
        this.Name = name;
        this.Password = password;
        this.ImagePath = null;
    }

    public String getName() {
        return this.Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public String getImage() {
        return ImagePath;
    }

    public void setImage(String image) {
        ImagePath = image;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }
}
