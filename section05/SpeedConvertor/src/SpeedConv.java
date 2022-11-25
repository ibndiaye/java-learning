public class SpeedConv {
    public static void main(String[] args) {
        long result=toMilesPerHour(25.42);
        System.out.println(result);
        printConversion(75.114);
    }

    public static long toMilesPerHour(double pKilometersPerHour){
        if (pKilometersPerHour<0){
//            System.out.println("cant be negative");
            return -1;
        }else {
            long toMiles = (long) Math.round(pKilometersPerHour * 0.6213711922);
            return toMiles;
        }
    }

    public static void printConversion(double pKilometersPerHour){
        if (pKilometersPerHour<0){
            System.out.println("invalid value");
        }else {
            long milesPerHour = (long) Math.round(pKilometersPerHour / 1.609);
            System.out.println(pKilometersPerHour + " km/h = " + milesPerHour + " mi/h");
        }
    }
}
