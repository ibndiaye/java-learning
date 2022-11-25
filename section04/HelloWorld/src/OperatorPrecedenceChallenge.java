public class OperatorPrecedenceChallenge {


    public static void main(String[] args) {
        double myDoubleVar=20d;
        double myDoubleVar2=80d;

        double sumDoubles=(myDoubleVar+myDoubleVar2)*100d;
        double remainder=sumDoubles%40d;
        boolean isNoRemainder= (remainder==0)?true:false;

        if (!isNoRemainder){
            System.out.println("got some remainder");
        }

        System.out.println(remainder);

    }

}
