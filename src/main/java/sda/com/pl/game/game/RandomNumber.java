package sda.com.pl.game.game;

public class RandomNumber {
    private int userValue;

    public RandomNumber() {
    }

    public RandomNumber(int userValue) {
        this.userValue = userValue;
    }

    public int getUserValue() {
        return userValue;
    }

    public void setUserValue(int userValue) {
        this.userValue = userValue;
    }
}
