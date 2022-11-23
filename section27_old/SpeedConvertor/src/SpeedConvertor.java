public class SpeedConvertor {
    public static double toMilesPerHour(double pKilometersPerHour) {
        long roundedMiles = Math.round(pKilometersPerHour * 0.6213711922);
        if (pKilometersPerHour < 0) {
            return -1;
        } else {
            return roundedMiles;
        }
    }

    public static void printConversion(double pKilometersPerHour) {

        if (pKilometersPerHour < 0) {
            System.out.println("invalid value");
        } else {
            double milesPerHour = Math.round(pKilometersPerHour * 0.6213711922);
            System.out.println(pKilometersPerHour + " km/h = " + milesPerHour + " mi/h");
        }

    }
}
