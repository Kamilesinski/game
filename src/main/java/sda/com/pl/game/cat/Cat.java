package sda.com.pl.game.cat;


public class Cat {

    private String name;
    private String race;
    private String color;

    public Cat(String name, String race, String color) {
        this.name = name;
        this.race = race;
        this.color = color;
    }

    public Cat() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
