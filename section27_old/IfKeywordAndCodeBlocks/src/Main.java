public class Main {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

//        if (score < 5000 && score > 1000) {
//            System.out.println("your score was less than 5000 but greater than 1000");
//        } else if (score < 1000) {
//            System.out.println("score less than 1000");
//        } else {
//            System.out.println("got here");
//        }

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("your final score was " + finalScore);
        }

//        boolean newGameOver=true;
//        int newScore= 10000;
//        int newLevelCompleted=8;
//        int newBonus=200;
//
//        if (newGameOver){
//            int finalScore=newScore+(newlevelCompleted*newBonus);
//            System.out.println("newScore: " + finalScore);
//        }

        gameOver = true;
        score = 10000;
        levelCompleted = 8;
        bonus = 200;
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("your final score was " + finalScore);
        }
    }
}