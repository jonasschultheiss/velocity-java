package Model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class PlayerDBO {
    public ObservableList<Player> defaultList;

    public PlayerDBO() {
        this.defaultList = FXCollections.observableArrayList();
        LoadDefault();
    }

    // achtung, vom aluege vo dere methode kriege sie augekrebs
    // eifache ersatz zun're api, da es keini git oder si koste
    public ObservableList<Player> LoadDefault() {
        this.defaultList = FXCollections.observableArrayList();
        this.defaultList.add(new Player(1, "Roman Bürki", "Goalie", "buerki.jpg"));
        this.defaultList.add(new Player(35, "Marwin Hitz", "Goalie", "hitz.jpg"));
        this.defaultList.add(new Player(40, "Eric Oelschlägel", "Goalie", "oelschlägel.jpg"));
        this.defaultList.add(new Player(16, "Manuel Akanji", "Defense", "akanji.jpg"));
        this.defaultList.add(new Player(4, "Abdou Diallo", "Defense", "Diallo.jpg"));
        this.defaultList.add(new Player(13, "Raphael Guerreiro", "Defense", "guerreiro.jpg"));
        this.defaultList.add(new Player(5, "Achraf Hakimi", "Defense", "hakimi.jpg"));
        this.defaultList.add(new Player(26, "Lukasz Piszczek", "Defense", "piszczek.jpg"));
        this.defaultList.add(new Player(29, "Marcel Schmelzer", "Defense", "schmelzer.jpg"));
        this.defaultList.add(new Player(15, "Jeremy Toljan", "Defense", "toljantol.jpg"));
        this.defaultList.add(new Player(36, "Ömer Toprak", "Defense", "toprak.jpg"));
        this.defaultList.add(new Player(2, "Dan-Axel Zagadou", "Defense", "zagadou.jpg"));
        this.defaultList.add(new Player(34, "Jacob Bruun Larsen", "Midfield", "larsenl.jpg"));
        this.defaultList.add(new Player(32, "Dzenis Burnic", "Midfield", "burnic.jpg"));
        this.defaultList.add(new Player(19, "Mahmoud Dahoud", "Midfield", "dahoud.jpg"));
        this.defaultList.add(new Player(6, "Thomas Delaney", "Midfield", "delaney.jpg"));
        this.defaultList.add(new Player(17, "Sergio Gomez", "Midfield", "gomez.jpg"));
        this.defaultList.add(new Player(10, "Mario Götze", "Midfield", "götze.jpg"));
        this.defaultList.add(new Player(23, "Shinji Kagawa", "Midfield", "kagawa.jpg"));
        this.defaultList.add(new Player(22, "Christian Pulisic", "Midfield", "pulisic.jpg"));
        this.defaultList.add(new Player(11, "Marco Reus", "Midfield", "reus.jpg"));
        this.defaultList.add(new Player(18, "Sebastian Rode", "Midfield", "rode.jpg"));
        this.defaultList.add(new Player(7, "Jadon Sancho", "Midfield", "sancho.jpg"));
        this.defaultList.add(new Player(33, "Julian Weigl", "Midfield", "weigl.jpg"));
        this.defaultList.add(new Player(28, "Axel Witsel", "Midfield", "witsel.jpg"));
        this.defaultList.add(new Player(27, "Marius Wolf", "Midfield", "wolf.jpg"));
        this.defaultList.add(new Player(14, "Alexander Isak", "Forward", "isak.jpg"));
        this.defaultList.add(new Player(9, "Paco Alcacer", "Forward", "alcacer.jpg"));
        this.defaultList.add(new Player(20, "Maximilian Philipp", "Forward", "philippp.jpg"));
        return this.defaultList;
    }
}
