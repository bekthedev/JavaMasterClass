package basics.codeblocks;

public class Challenge {
    public static void main(String[] args) {
        boolean gameOver = true;

        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;


        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        int finalScore = score;

        if (gameOver) {
            finalScore += (bonus * levelCompleted);
            System.out.println("Your final score was " + finalScore);
        }
    }
}