public class Main {
    public static void main(String[] args) {
        double myFirstVar=20.00d;
        double mySecondVar=80.00d;
        double result=(myFirstVar+mySecondVar)*100.00d;
        double remainder =result%40.00d;
        boolean isNoRemainder= remainder==0?true:false;
        System.out.println(isNoRemainder);
        if (!isNoRemainder){
            System.out.println("got some remainder");
        }
    }
}