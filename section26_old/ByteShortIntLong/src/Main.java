public class Main {
    public static void main(String[] args) {
        int myValue=10000;

        int myMinIntValue= Integer.MIN_VALUE;
        int myMaxIntValue= Integer.MAX_VALUE;
        System.out.println("min value: " + myMinIntValue);
        System.out.println("max value: " + myMaxIntValue);

        byte myMinByteValue=Byte.MIN_VALUE;
        byte myMaxByteValue=Byte.MAX_VALUE;
        System.out.println("byte min= "+myMinByteValue);
        System.out.println("byte min= "+myMaxByteValue);

        short myMinShortValue=Short.MIN_VALUE;
        short myMaxShortValue=Short.MAX_VALUE;
        System.out.println("short min= "+myMinShortValue);
        System.out.println("short min= "+myMaxShortValue);

        long myLongValue = 100L;
        long myMinLongValue=Long.MIN_VALUE;
        long myMaxLongValue=Long.MAX_VALUE;
        System.out.println("long min= "+myMinLongValue);
        System.out.println("long min= "+myMaxLongValue);

        int myTotal = (myMinIntValue/2);
        byte myNewByteValue = (byte) (myMinByteValue/2);
        short myNewShortValue= (short) (myMinShortValue/2);
    }
}