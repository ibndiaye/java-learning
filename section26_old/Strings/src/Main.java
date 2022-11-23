public class Main {
    public static void main(String[] args) {
        String myString="This is a string";
        System.out.println("my string is equal to " +myString);
        myString=myString+", and this is more";
        System.out.println(myString);
        myString=myString+" \u00A9 2019";
        System.out.println(myString);
        String numberString = "250.55";
        numberString=numberString+"49.95";
        System.out.println(numberString);
        String lastString="10";
        int myInt=50;
        lastString=lastString+myInt;
        System.out.println("last string is equal to " + lastString);

        double doubleNum=120.47d;
        lastString=lastString+doubleNum;
        System.out.println(lastString);
    }
}