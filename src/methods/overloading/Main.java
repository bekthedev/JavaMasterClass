package methods.overloading;

public class Main {
    public static void main(String[] args) {

       int newScore = calculatedScore("Bek", 500);
       System.out.println("New score: " + newScore);

       calculatedScore(50);
    }

    public static int calculatedScore(String playerName, int score) {
        System.out.println("Player: " + playerName);
        return score * 1000;
    }

    public static int calculatedScore(int score) {
        System.out.println("Score: " + score);
        return score * 1000;
    }
}