package methods;

public class Challenge {
    public static void main(String[] args) {

    int highScorePosition = calculateHighScorePosition(1500);
    displayHighScorePosition("Bek", highScorePosition);

    highScorePosition = calculateHighScorePosition(1000);
    displayHighScorePosition("Beka", highScorePosition);

    highScorePosition = calculateHighScorePosition(500);
    displayHighScorePosition("Rebekah", highScorePosition);

    highScorePosition = calculateHighScorePosition(100);
    displayHighScorePosition("kah", highScorePosition);

    highScorePosition = calculateHighScorePosition(25);
    displayHighScorePosition("Beck", highScorePosition);

    }

    public static void displayHighScorePosition(String playerName, int playerPosition) {

        System.out.println(playerName +" managed to get into position " + playerPosition +
                " on the high score list!");
    }

    public static int calculateHighScorePosition(int playerScore) {

        int position = 4;

        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500) {
            position = 2;
        } else if (playerScore >= 100) {
            position = 3;
        }
        return position;

    }
}