package pl.aliberadzki.learn.tdd.tennis;

/**
 * Created by aliberadzki on 11.05.16.
 */
public class Player {
    public String name;
    public Integer points = 0;

    public Player(String name, Integer points) {
        this.name = name;
        this.points = points;
    }
}
