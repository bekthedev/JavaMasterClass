package methods;

public class Main {

    public static void main(String[] args) {

       int highscore = calculateScore(true, 800, 5, 100);
        System.out.println("The highest score is " + highscore);

        System.out.println("The next highest score is " +
            calculateScore(true, 10000, 8, 200));
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        int finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
        }
        return finalScore;
    }
}