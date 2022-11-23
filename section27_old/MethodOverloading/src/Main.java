public class Main {
    public static void main(String[] args) {
        int newScore = calculateScore("Tim", 500);
        System.out.println("New score is " + newScore);
        calculateScore(500);
        calculateScore();
        double centimeter = calcFeetAndInchesToCentimeter(6, -10);
        if (centimeter < 0) {
            System.out.println("invalid parameters");
        }
        calcFeetAndInchesToCentimeter(100);
    }

    public static int calculateScore(String pPlayerName, int pScore) {
        System.out.println("PLayer " + pPlayerName + " scored " + pScore + " points");
        return pScore * 1000;
    }

    public static int calculateScore(int pScore) {
        System.out.println("unnamed PLayer " + " scored " + pScore + " points");
        return pScore * 1000;
    }

    public static int calculateScore() {
        System.out.println("no PLayer name " + " scored " + " no points");
        return 0;
    }

    public static double calcFeetAndInchesToCentimeter(double pFeet, double pInches) {
        if (pFeet < 0 || pInches < 0 || pInches > 12) {
            System.out.println("invalid range");
            return -1;
        }
        double centimeters = pFeet * 12 * 2.54;
        centimeters += pInches * 2.54;
        System.out.println(pFeet + " feet, " + pInches + " inches = " + centimeters + " cm");
        return centimeters;
    }

    public static double calcFeetAndInchesToCentimeter(double pInches) {
        if (pInches < 0) {
            System.out.println("invalid range");
            return 0;
        }
        double feet=(int)pInches/12;
        double remainingInches=(int)pInches%12;
        System.out.println(pInches+" inches is equal to "+ feet + " feet and "+remainingInches+" is equal to remaining inches");
        return calcFeetAndInchesToCentimeter(feet,remainingInches);
    }
}
