package pl.aliberadzki.learn.tdd.tennis;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by aliberadzki on 11.05.16.
 */
public class TennisTest {

    private Tennis tennis;
    private Player jarek;
    private  Player donek;

    @Before
    public void setUp() {
        this.jarek = new Player("Jarosław", 0);
        this.donek = new Player("Donald", 0);
        this.tennis = new Tennis(jarek, donek);
    }

    @Test
    public void itScoresAScorelessGame() {
        assertEquals("Love-All", tennis.score());
    }

    @Test
    public void isScoresA10Game() {
        this.jarek.points = 1;
        assertEquals("Fifteen-Love", tennis.score());

    }
}