public class PositiveNegativeOrZeroChallenge {
    public static void main(String[] args) {
        checkNumber(-1);
    }

    public static void  checkNumber(int pNumber){
        if (pNumber>0){
            System.out.println("positive");
        } else if (pNumber<0) {
            System.out.println("negative");
        }else {
            System.out.println("zero");
        }

    }
}
