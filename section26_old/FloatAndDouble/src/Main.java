public class Main {
    public static void main(String[] args) {
        float myMinFloatValue=Float.MIN_VALUE;
        float myMaxFloatValue=Float.MAX_VALUE;
        System.out.println("float min value= " + myMinFloatValue);
        System.out.println("float max value= " + myMaxFloatValue);


        double myMinDoubleValue=Double.MIN_VALUE;
        double myMaxDoubleValue=Double.MAX_VALUE;
        System.out.println("double min value= " + myMinDoubleValue);
        System.out.println("double max value= " + myMaxDoubleValue);

        int myIntValue=5/3;
        float myFloatValue=5f/3f;
        double myDoubleValue=5.00/3.00;
        System.out.println("MyIntValue= " + myIntValue);
        System.out.println("MyFloatValue= " + myFloatValue);
        System.out.println("MyDoubleValue= " + myDoubleValue);

        double numInPounds=200d;
        double convNumToKg=numInPounds*0.45359237d;
        System.out.println("its " + convNumToKg +" kg");

        double pi= Math.PI;
        double anotherNum= 3_000_000.4_567_890d;
        System.out.println(pi);
        System.out.println(anotherNum);
    }
}