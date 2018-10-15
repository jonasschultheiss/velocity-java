package Model;

public class User {
    private String Name;

    private String PasswordHash;

    private String Image;

    public User () {

    }

    public User (String name, String passwordHash, String image) {
        this.Name = name;
        this.PasswordHash = passwordHash;
        this.Image = image;
    }

    public void CreateDummy () {
        this.Name = "quest1onmark";
        this.PasswordHash = "DA6893B1B1CCB0CEE5E9776BEFB6D5863995845CB56EB2C0519172ABCCAD9CBFEBAB02864C3FD69811540481734CDC19F9F7FF999A4E2B4F8F0516EBDA0E4AA4";
        this.Image = "quest1.jpg";
    }


    public String getName() {
        return this.Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String image) {
        Image = image;
    }

    public String getPasswordHash() {
        return PasswordHash;
    }

    public void setPasswordHash(String passwordHash) {
        PasswordHash = passwordHash;
    }
}
