package Model;

public class Player {
    public int Number;

    public String Name;

    public String Position;

    private String ImageName;

    Player(int _Number, String _Name, String _Position, String _ImageName) {
        this.Number = _Number;
        this.Name = _Name;
        this.Position = _Position;
        this.ImageName = _ImageName;
    }
}
