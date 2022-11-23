public class Main {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println(highScore);

        gameOver = true;
        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println(highScore);

        int highScorePos=calculateHighScorePosition(1500);
        displayHighScorePosition("tim",highScorePos);
         highScorePos=calculateHighScorePosition(900);
        displayHighScorePosition("max",highScorePos);
         highScorePos=calculateHighScorePosition(400);
        displayHighScorePosition("benny",highScorePos);
         highScorePos=calculateHighScorePosition(50);
        displayHighScorePosition("tome",highScorePos);
        highScorePos=calculateHighScorePosition(1000);
        displayHighScorePosition("zuzu",highScorePos);

    }

    public static int calculateScore(boolean pGameOver, int pScore, int pLevelCompleted, int pBonus) {

        if (pGameOver) {
            int finalScore = pScore + (pLevelCompleted * pBonus);
            finalScore += 2000;
            return finalScore;
        } else {
            return -1;
        }

//        OR  return -1;

    }

    public static void displayHighScorePosition(String pPlayerName, int pPlayerPosition) {
        System.out.println("player name: " + pPlayerName + ", " + pPlayerPosition + " on the high score table");
    }

    public static int calculateHighScorePosition(int pPlayerScore) {
//        if (pPlayerScore >= 1000) {
//            return 1;
//        } else if (pPlayerScore >= 500) {
//            return 2;
//        } else if (pPlayerScore >= 100) {
//            return 3;
//        }
//            return 4;
        int position = 4; //assuming pos 4 will be returned
        if (pPlayerScore>=1000){
            position=1;
        }else if (pPlayerScore>=500){
            position=2;
        } else if (pPlayerScore>=100) {
            position=3;
        }
        return position;
    }


}