package pl.aliberadzki.learn.tdd.tennis;

/**
 * Created by aliberadzki on 11.05.16.
 */
public class Tennis {

    private Player player1;
    private Player player2;

    public Tennis(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public String score() {
        if(player1.points == 1 && player2.points == 0) return "Fifteen-Love";
        return "Love-All";
    }
}
