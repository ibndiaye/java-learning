public class Main {
    public static void main(String[] args) {
        byte myByteVar=8;
        short myShortVar=9;
        int myIntVar=15;
        long myLongVar=50000L+10L*(myIntVar+myByteVar+myShortVar);
        System.out.println(myLongVar);
        short shortTotal= (short) (1000 +10* (myIntVar+myByteVar+myShortVar));
    }
}